package etc.bytebuddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.*;

public class BCI {
    public static void main(String... args) throws IOException, InstantiationException, IllegalAccessException {
        System.out.println(new User().getName());
        new ByteBuddy()
                .redefine(User.class)
                .method(named("getName"))
                .intercept(FixedValue.value("ByteBuddy"))
                .make()
                .saveIn(new File("/Users/jjw/Jun/Java-Study/jun/src/main/java/etc/bytebuddy/"));



        Class<?> dynamicType = new ByteBuddy()
                .subclass(Object.class)
                .method(ElementMatchers.named("toString"))
                .intercept(FixedValue.value("Hello World!"))
                .make()
                .load(BCI.class.getClassLoader())
                .getLoaded();
        System.out.println(dynamicType.newInstance());

        String r = new ByteBuddy()
                .subclass(User.class)
                .method(named("getName")
                        .and(isDeclaredBy(User.class)
                                .and(returns(String.class))))
                .intercept(FixedValue.value("ByteBuddy"))
                .make()
                .load(BCI.class.getClassLoader())
                .getLoaded()
                .newInstance()
                .getName();
        System.out.println(r);
    }
}



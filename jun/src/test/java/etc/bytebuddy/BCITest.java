package etc.bytebuddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.implementation.bind.annotation.BindingPriority;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static net.bytebuddy.matcher.ElementMatchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BCITest {

    @Test
    @DisplayName("이름 테스트")
    void m() throws Exception {
        String byteBuddyName = new ByteBuddy().subclass(User.class)
                //.method(named("getName").and(isDeclaredBy(User.class).and(returns(String.class))))
                .method(named("getName").and(isDeclaredBy(User.class).and(returns(String.class))))
                .intercept(FixedValue.value("TestCode"))
                .make()
                .load(BCI.class.getClassLoader())
                .getLoaded()
                .newInstance()
                .getName();

        String originalName = "TestCode";

        Assertions.assertThat(byteBuddyName).isEqualTo(originalName);
    }

    @BindingPriority(3)
    public static String sayHelloBar() {
        return "Holla in Bar!";
    }

    @BindingPriority(2)
    public static String sayBar() {
        return "bar";
    }

    @Test
    @DisplayName("메서드 조작")
    void 비교() throws Exception {
        Class<?> type = new ByteBuddy()
                .subclass(Object.class)
                .name("Jun")
                .defineMethod("getName", String.class, Modifier.PUBLIC)
                .intercept(MethodDelegation.to(Bar.class))
                .defineField("name", String.class, Modifier.PRIVATE)
                .make()
                .load(getClass().getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                .getLoaded();

        Method m = type.getDeclaredMethod("getName", null);
        assertEquals(m.invoke(type.newInstance()), Bar.sayHelloBar());
        assertNotNull(type.getDeclaredField("name"));
    }
}
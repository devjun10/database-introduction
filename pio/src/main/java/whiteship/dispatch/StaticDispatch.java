package whiteship.dispatch;

import java.util.Arrays;
import java.util.List;

public class StaticDispatch {

  public static void main(String[] args) {
    List<Post> posts = Arrays.asList(new Text(), new Picture()) ;
    List<SNS> sns = Arrays.asList(new Twitter(), new FaceBook());

//    posts.forEach(post -> sns.forEach(s -> post.postOn(s)));
//    posts.forEach(post -> sns.forEach(post::postOn));
  }


}

interface SNS {}

interface Post {
//  void postOn(SNS sns);

  public void postOn(FaceBook facebook);
  public void postOn(Twitter twitter);

}

class Twitter implements SNS {}

class FaceBook implements SNS {}

class Text implements Post {

//  @Override
//  public void postOn(SNS sns) {
//    System.out.println("Text by " + sns.getClass().getSimpleName());
//  }
  public void postOn(FaceBook facebook) {
    System.out.println("FACEBOOK UPLOADING");
    System.out.println("TEXT by facebook");
  }

  public void postOn(Twitter twitter) {
    System.out.println("TWITTER UPLOADING");
    System.out.println("TEXT by twitter");
  }

}

class Picture implements Post {

//  @Override
//  public void postOn(SNS sns) {
//    System.out.println("Picture by " + sns.getClass().getSimpleName());
//  }

  public void postOn(FaceBook facebook) {
    System.out.println("FACEBOOK UPLOADING");
    System.out.println("TEXT by facebook");
  }

  public void postOn(Twitter twitter) {
    System.out.println("TWITTER UPLOADING");
    System.out.println("TEXT by twitter");
  }
}

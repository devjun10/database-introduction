package whiteship.dispatch;

import java.util.Arrays;
import java.util.List;

public class DoubleDispatch {

  public static void main(String[] args) {
    List<Post_> posts = Arrays.asList(new Text_(), new Picture_()) ;
    List<SNS_> sns = Arrays.asList(new Twitter_(), new FaceBook_(), new Instagram());

    posts.forEach(post -> sns.forEach(s -> post.postOn(s)));
//    posts.forEach(post -> sns.forEach(post::postOn));
  }


}

interface SNS_ {
  void post(Text_ text);
  void post(Picture_ picture);
}

interface Post_ {
  void postOn(SNS_ sns);

}

class Twitter_ implements SNS_ {
  public void post(Text_ text) {
    System.out.println("트위터 UPLOADING");
    System.out.println("TEXT by 트위터");
  }

  public void post(Picture_ picture) {
    System.out.println("트위터 UPLOADING");
    System.out.println("PICTURE by 트위터");
  }
}

class Instagram implements SNS_ {
  public void post(Text_ text) {
    System.out.println("INSTAGRAM UPLOADING");
    System.out.println("TEXT by instagram");
  }

  public void post(Picture_ picture) {
    System.out.println("INSTAGRAM UPLOADING");
    System.out.println("PICTURE by instagram");
  }
}

class FaceBook_ implements SNS_ {
  public void post(Text_ text) {
    System.out.println("페북 UPLOADING");
    System.out.println("TEXT by 페북");
  }

  public void post(Picture_ picture) {
    System.out.println("페북 UPLOADING");
    System.out.println("PICTURE by 페북");
  }
}

class Text_ implements Post_ {

  public void postOn(SNS_ sns) {
    sns.post(this);
  }

}

class Picture_ implements Post_ {

  public void postOn(SNS_ sns) {
    sns.post(this);
  }
}


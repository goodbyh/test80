package step33.exam04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//의존객체주입
public class Test01 {

  public static void main(String[] args) {
    //1) Car 객체 준비하기
    ApplicationContext context =
        new ClassPathXmlApplicationContext(
            "step33/exam04/application-context.xml");
    System.out.println(context.getBean("c1"));
    System.out.println(context.getBean("c2"));
  }
}


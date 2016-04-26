package step33.exam03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//생성자 호출하기 
public class Test01 {

  public static void main(String[] args) {
    //1) Car 객체 준비하기
    ApplicationContext context =
        new ClassPathXmlApplicationContext(
            "step33/exam03/application-context.xml");
    System.out.println(context.getBean("c1"));
    System.out.println(context.getBean("c2"));
  }
}

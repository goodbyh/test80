package step33.exam03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//c네임 스페이스 사용 
public class Test02 {

  public static void main(String[] args) {
    //1) Car 객체 준비하기
    ApplicationContext context =
        new ClassPathXmlApplicationContext(
            "step33/exam03/application-context02.xml");
    System.out.println(context.getBean("c1"));
    System.out.println(context.getBean("c2"));
   // System.out.println(context.getBean("c3"));
  }
}

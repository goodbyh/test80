package step33.exam07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//팩토리객체를 통해 인스턴스준비하기
public class Test02 {

  public static void main(String[] args) {
    //1) Car 객체 준비하기
    ApplicationContext context =
        new ClassPathXmlApplicationContext(
            "step33/exam07/application-context02.xml");
    
    System.out.println(context.getBean("c1"));
    
  }
}


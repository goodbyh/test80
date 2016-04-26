package step33.exam08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//primitive type과 String이 아닌 프로퍼티의 값을 설정하는 방법
public class Test02 {

  public static void main(String[] args) {
    //1) Car 객체 준비하기
    ApplicationContext context =
        new ClassPathXmlApplicationContext(
            "step33/exam08/application-context2.xml");
    System.out.println(context.getBean("c1"));
  }
}


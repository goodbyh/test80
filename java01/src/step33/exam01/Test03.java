package step33.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//스프링프레임워크사용후
//IoC 컨테이너(빈 컨테이너) 사용 후 
public class Test03 {

  public static void main(String[] args) {
    //1) Car 객체 준비하기
    ApplicationContext context =
        new ClassPathXmlApplicationContext(
            "step33/exam01/application-context03.xml");
    //2) cAr 객체 꺼내기
    Car r1 = (Car)context.getBean("c1");
    
    System.out.println(r1);
  }

}

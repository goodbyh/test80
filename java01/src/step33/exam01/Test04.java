package step33.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//스프링프레임워크사용후
//IoC 컨테이너(빈 컨테이너) 사용 후 
public class Test04 {

  public static void main(String[] args) {
    //1) Car 객체 준비하기
    ApplicationContext context =
        new ClassPathXmlApplicationContext(
            "step33/exam01/application-context04.xml");
    //2) cAr 객체 꺼내기
    Car r1 = (Car)context.getBean("c1");
    Car r2 = (Car)context.getBean("c2");
    Car r3 = (Car)context.getBean("c4");
    Car r4 = (Car)context.getBean("c7");
    
       
    Car rr = (Car)context.getBean("c3");
    if(rr == r2)
      System.out.println("같내");
    
    
    //만약 지정한 이름의 id나 name을 찾을 수 없다면 예외발생!
    //Car r5 =(Car)context.getBean("c11");
  }

}

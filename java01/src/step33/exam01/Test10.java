package step33.exam01;
//객체생성 정책(scope)
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//스프링프레임워크사용후
//IoC 컨테이너(빈 컨테이너) 사용 후 
public class Test10 {

  public static void main(String[] args) {
    ApplicationContext context =
        new ClassPathXmlApplicationContext(
            "step33/exam01/application-context10.xml");
    //2)scope 속성이 prototype일때
    //3)getBean()을 호출하기 전까지 객체를 생성하지 않는다.
    //getBean()을 호출할때 마다 매번 새객체를 생성하여 리턴한다.
    
   Car p1=(Car) context.getBean("c3");
   Car p2=(Car) context.getBean("c3");
   Car p3=(Car) context.getBean("c3");
   
   //매번 새 객체를 리턴하기 때문에 p1,p2,p3는 다른 객체이다.
   if( p1 == p2) System.out.println("p1 == p2");
   if( p1 == p2) System.out.println("p2== p3");
    
    
  }
  

}

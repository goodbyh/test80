package step33.exam01;
//객체생성 정책(scope)
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//스프링프레임워크사용후
//IoC 컨테이너(빈 컨테이너) 사용 후 
public class Test08 {

  public static void main(String[] args) {
    ApplicationContext context =
        new ClassPathXmlApplicationContext(
            "step33/exam01/application-context08.xml");
    //1)scope 속성을 지정하지 않았을때,
    //객체가 한개만 생성된다.
   Car p1=(Car) context.getBean("c1");
   Car p2=(Car) context.getBean("c1");
   Car p3=(Car) context.getBean("c1");
   if( p1 == p2) System.out.println("p1 == p2");
   if( p1 == p2) System.out.println("p2== p3");
  }
  

}

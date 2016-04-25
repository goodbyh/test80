package step33.exam02;
//생성자의 넘겨주는 값의 순서
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//생성자 호출하기 
public class Test02 {

  public static void main(String[] args) {
    //1) Car 객체 준비하기
    ApplicationContext context =
        new ClassPathXmlApplicationContext(
            "step33/exam02/application-context02.xml");
    System.out.println(context.getBean("c1"));
    System.out.println(context.getBean("c2"));
    System.out.println(context.getBean("c3"));
    //System.out.println(context.getBean("c4"));
    System.out.println(context.getBean("c5"));
    System.out.println(context.getBean("c6"));
  }

}

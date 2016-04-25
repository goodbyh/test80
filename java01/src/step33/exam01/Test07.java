package step33.exam01;
//빈의 이름을 지정하니 않
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//스프링프레임워크사용후
//IoC 컨테이너(빈 컨테이너) 사용 후 
public class Test07 {

  public static void main(String[] args) {
    //1) Car 객체 준비하기
    ApplicationContext context =
        new ClassPathXmlApplicationContext(
            "step33/exam01/application-context07.xml");

    System.out.println("빈의 개수: " +context.getBeanDefinitionCount());
    System.out.println("-----------------------------------------------");
    
    System.out.println("빈의 이름들");
    String[] names =context.getBeanDefinitionNames();
    String[] aliases;
    for (String name : names) {
      System.out.print(name + "," );
      //3)빈의 나머지이름 알아내기
      //=>getAliases(빈의 공식적인 이름)
      System.out.print("    빈의 기타 이름들: ");
      aliases = context.getAliases(name);
      for(String alias : aliases){
        System.out.print(alias + ",");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("-----------------------------------------------");
    
    Car obj1= (Car) context.getBean("step33.exam01.Car#0");
    Car obj2= (Car) context.getBean("step33.exam01.Car");
    
    
    
    
    
  }
  

}

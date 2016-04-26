package step33.exam09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@Autowired 애노테이션을 이용한 의존객체 주입  설정하기
public class Test04 {

  public static void main(String[] args) {
    //1) Car 객체 준비하기
    ApplicationContext context =
        new ClassPathXmlApplicationContext(
            "step33/exam09/application-context4.xml");
    
    printAllObjects(context);
    System.out.println("-------------------------------");
    System.out.println(context.getBean("c1"));
    System.out.println("-------------------------------");
  }
  
  private static void printAllObjects(ApplicationContext ctx) {
    String[] names = ctx.getBeanDefinitionNames(); //빈컨테이너에 객체 두개가들어있다.
    for (String name : names) {
      System.out.println(name + " : " + ctx.getBean(name).getClass().getName());
    }
    
  }
}

/*
스프링은 객체를 자동화 하고 싶을때 사용한다. 웹프로그래밍아니고 자바프로그래밍
application-context.xml은 놓인 위치에 상관없이 객체를 먼저 생성한다.
  
  
  스프링 아이오시 컨테이너new ClassPathXmlApplicationContext(
            "step33/exam09/application-context.xml");
  설정파일 읽어서 내부적으로 객체준비
  의존객체 주입
  도우미객체(ex.프라퍼티에디터(), 빈포트스프로세서() 빈프리프로세스()등)가 있다면
  빈포트스프로세서()가 @Autowired를 관리한다.
 
 */


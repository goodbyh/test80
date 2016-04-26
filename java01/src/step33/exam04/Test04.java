package step33.exam04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//의존객체주입과 객체생성과정 확인
public class Test04 {

  public static void main(String[] args) {
    // 1) Car 객체 준비하기
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "step33/exam04/application-context04.xml");
    
    
  }
}

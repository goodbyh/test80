// 주제: SQL 맵퍼인 mybatis 적용하기 - MemberDao에 적용하기 - insert
package step33.exam11;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberAdd {

  public static void main(String[] args) throws Exception {
    ApplicationContext context =
        new ClassPathXmlApplicationContext(
            "step33/exam11/application-context.xml");//스프링 ioc컨테이너 준비
    
    MemberDao memberDao =(MemberDao)context.getBean("memberDao");
    Member member = new Member();
    member.setName("세종대왕");
    member.setEmail("sae@test.com");
    member.setPassword("1111");
    member.setTel("1111-1111");
    
    memberDao.insert(member);
    System.out.println("입력 성공!");
  }
}

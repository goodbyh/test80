//1) PreparedStatement 적용
//2) DB 연결정보를 외부로부터 받는다.
//   => DBMS 연결 정보가 바뀌더라도 코드를 변경할 필요가 없다.
//3) 커넥션 한 개만 생성하여 공유하기 
//   => 메서드가 호출될 때마다 커넥션을 맺고 실행한 다음 커넥션을 끊으면,
//      실행 속도가 느려진다.
//   => 그래서 DAO를 생성할 때 미리 커넥션을 준비해 두었다가 사용하도록 한다.
//   => 즉, selectList(), insert(), update(), delete()는 커넥션을 공유한다.
package step33.exam12;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




@Repository //DAO처럼 데이터를 처리하는 객체에 붙인다.
public interface MemberDao {
/*mybatis가 이 DAO 구현체를 자동으로 생성할 것이다.
=> 규칙 
1) 메서드의 이름은 반드시 실행할 SQL 아이디와 같아야한다.
2) 메서드의 파라미터는 SQL Mapper에 정의된 parameterType과 같아ㅇㅑ한다.
3)메서드의 리턴 타입은 SQL Mapper에 정의된 resultType과 같아야한다.
4)SQL 맵퍼 파일의 네임스페이스는 인터페이스의 패키지명과 같아야한다.
*
*/
  public List<Member> selectList() throws Exception;
  public int insert(Member member) throws Exception;
  public int update(Member member) throws Exception;
  public int delete(int no) throws Exception;
  
}


























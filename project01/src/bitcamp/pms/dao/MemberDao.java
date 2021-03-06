package bitcamp.pms.dao;

import java.util.List;
import java.util.Map;

import bitcamp.pms.domain.Member;

//MemberMapper.xml에 선언된 SQL에 맞추어 메서드를 변경한다.
//SQL id와 메서드 이림을 같게한다.
//SQL parameterTyper과 메서드의 파라미터 타입을 같게한다.
//sql resultType과 메서드의 리턴타입ㅇ르 같게한다.
//mybatis는 RuntimeException 예외를 던지기 때문에
//각 메서드 선언부에 throws 절을 작성할 필요가 없다.
public interface MemberDao {

  List<Member> selectList();
  Member selectOne(Map<String,Object> paramMap);
  int insert(Member member);
  int update(Member member);
  int delete(int no);
  int isMember(Map<String,Object> paramMap);
}

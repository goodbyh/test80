package bitcamp.pms.dao;

import java.util.List;

import bitcamp.pms.domain.Project;

public interface ProjectDao {

  
  List<Project> selectList() throws Exception;
  Project selectOne(int no) throws Exception;
  int insert(Project project) throws Exception;  
  int update(Project project) throws Exception;  
  int delete(int no) throws Exception;
}

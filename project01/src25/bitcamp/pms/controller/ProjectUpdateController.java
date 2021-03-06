package bitcamp.pms.controller;

import java.sql.Date;
import java.util.Map;
import java.util.Scanner;

import bitcamp.pms.annotation.Component;
import bitcamp.pms.dao.ProjectDao;
import bitcamp.pms.domain.Project;
import bitcamp.pms.util.CommandUtil;

@Component("project/update.do")
public class ProjectUpdateController implements MenuController {
  ProjectDao projectDao = new ProjectDao();
  private Scanner keyScan;
  
  @Override
  public void init() {}

  @Override
  public void service(Map<String,Object> paramMap) {
    keyScan = (Scanner)paramMap.get("stdin");
    
    try {
      System.out.print("변경할 프로젝트 번호?");
      int no = Integer.parseInt(keyScan.nextLine());

      Project oldProject = projectDao.selectOne(no);
      Project project = new Project();

      System.out.printf("프로젝트명(%s)? ", oldProject.getTitle());
      project.setTitle(keyScan.nextLine());
      System.out.printf("시작일(%s)? ", oldProject.getStartDate());
      project.setStartDate(Date.valueOf(keyScan.nextLine()));
      System.out.printf("종료일(%s)? ", oldProject.getEndDate());
      project.setEndDate(Date.valueOf(keyScan.nextLine()));
      System.out.printf("설명(%s)? ", oldProject.getDescription());
      project.setDescription(keyScan.nextLine());

      if (CommandUtil.confirm(keyScan, "변경하시겠습니까?")) {
        projectDao.update(no, project);
        System.out.println("변경하였습니다.");
      } else {
        System.out.println("변경을 취소하였습니다.");
      }
    } catch (IndexOutOfBoundsException e) {
      System.out.println("유효한 번호가 아닙니다.");
    } catch (Exception e) {
      System.out.println("데이터 로딩에 실패했습니다.");
    }
  }

  @Override
  public void destroy() {}

}

package step33.exam07;
//주제:스프링 프레임워크 규칙에 따라 팩토리 클래스 만들기
//factroybean 인터페이스를 구현하면 된다.
//스프링에서 팩토리 클래스로 간주할 것이다.
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {
  //1)객체를 생성할때 
  String model;
  
  
  public void setModel(String model) {
    System.out.println("setModel()...");
    this.model = model;
  }


  public CarFactoryBean() {
    System.out.println("CarFactoryBean()...");
  }
  
  
  //2)팩토리빈 인터페이스를 구현한다.
  @Override
  public boolean isSingleton() {
    System.out.println("isSingleton()...");
    return true;
  }
  
  
  @Override
  public Class<?> getObjectType() {
    System.out.println("getObjectType()...");
    return Car.class;
  }
  
  @Override
  public Car getObject() throws Exception {
    System.out.println("getObject()...");
    Car c = new Car();
    Map<String,Object> specs = new HashMap<>();
    switch (model) {
    case "bitz001" :
      specs.put("sunroof", "yes");
      specs.put("cc", 3000);
      specs.put("valve", 16);
      break;
    case "bitz002" :
      specs.put("sunroof", "yes");
      specs.put("airbag", "quad");
      specs.put("cc", 4200);
      specs.put("valve", 32);
      break;
     default:
       specs.put("sunroof", "no");
       specs.put("cc", 800);
       break;
    }
    
    c.setSpecs(specs);
    return c;
  }

}

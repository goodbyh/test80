package step33.exam07;

import java.util.HashMap;
import java.util.Map;

public class CarFactory2 {
  
  public CarFactory2() {
    System.out.println("CarFactory2()...");
  }

  public Car createCar(String model) { //인스턴스메서드
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

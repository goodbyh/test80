package step33.exam09;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car3 {
  String model;
  String maker;
  Date madeDate;
  
  @Autowired
  @Qualifier("e2") //주입할 객체를 지정한다. 없으면 같은타입을 넣는다. 같은타입여러개면 오류
  Engine engine;
  
  
  public Car3() {
    //System.out.println("Car()..");
  }

  @Override
  public String toString() {
    return "Car [model=" + model + ", maker=" + maker + ", madeDate=" + madeDate + ", engine=" + engine + "]";
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    this.maker = maker;
  }

  public Date getMadeDate() {
    return madeDate;
  }

  public void setMadeDate(Date madeDate) {
    this.madeDate = madeDate;
  }
  
  
  
}

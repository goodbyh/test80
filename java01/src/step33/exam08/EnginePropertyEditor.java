package step33.exam08;

import java.beans.PropertyEditorSupport;

//주제:문자열로 Engine 객체를 생성하는 변환기 만들기
//=> java.beans.PropertyEditor 인터페이스를 구현하면 된다.
//=> 그러나 인터페이스를 구현하는 것은 너무 번거롭다.
//=>PropertyEditor를 미리 구현한 PropertyEditorSupport
public class EnginePropertyEditor extends PropertyEditorSupport {
  
  @Override
  public void setAsText(String text) throws IllegalArgumentException {
    try {
      String[] items = text.split(",");
      if (items ==null || items.length<3)
        throw new Exception("Engine 타입에 맞지 않은 값입니다");
      
      Engine engine = new Engine();
      engine.setCc(Integer.parseInt(items[0]));
      engine.setValve(Integer.parseInt(items[1]));
      engine.setType(items[2]);
      this.setValue(engine);
    }catch (Exception e) {
      throw new IllegalArgumentException(e);
    }
  }
}


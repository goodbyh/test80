/* 주제: JVM 속성 조회하기*/
package step08;

import java.util.Properties;
import java.util.Set;

public class Exam12 {

  public static void main(String[] args) {
    Properties jvmProps = System.getProperties();
    
    System.out.println(System.getProperty("file.separator"));
    Set<?> keySet = jvmProps.keySet();
    for (Object key : keySet) {
      System.out.println(key +" = " + jvmProps.get(key));
    }
    
  }
}



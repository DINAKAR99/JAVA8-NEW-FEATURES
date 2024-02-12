package NashHorn;

import javax.naming.Context;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashHornEx {

  public static void main(String[] args) {
    ScriptEngineManager s1 = new ScriptEngineManager(null);

    // ScriptEngine s2 = s1.getEngineByName("Graal.js");
    System.out.println(s1.getEngineFactories());
    for (String string : args) {
      
    }
    // try {
    //   s2.eval("print('hemlo')");
    // } catch (ScriptException e) {
    //   // TODO Auto-generated catch block
    //   e.printStackTrace();
    // }
  }
}

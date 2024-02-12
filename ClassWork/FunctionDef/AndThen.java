package FunctionDef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class AndThen {

  public static List<String> convertEmpListToNamesList(
    List<Employ> EmployList,
    Function<Employ, String> funcEmpToString
  ) {
    List<String> empNameList = new ArrayList<String>();
    for (Employ emp : EmployList) {
      empNameList.add(funcEmpToString.apply(emp));
    }
    return empNameList;
  }

  public static void main(String[] args) {
    Function<Employ, String> empNameFun = e -> e.getName();
    Function<String, String> initialFunction = s -> s.substring(0, 1);

    List<Employ> EmployList = Arrays.asList(
      new Employ("Tom Jones", 45),
      new Employ("Harry Major", 25),
      new Employ("Ethan Hardy", 65),
      new Employ("Nancy Smith", 15),
      new Employ("Deborah Sprightly", 29)
    );

    List<String> empNameListInitialChar = convertEmpListToNamesList(
      EmployList,
      empNameFun.andThen(initialFunction)
    );
    empNameListInitialChar.forEach(s -> {
      System.out.println(s);
    });
  }
}

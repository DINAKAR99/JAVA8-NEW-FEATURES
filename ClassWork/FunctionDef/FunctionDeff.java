package FunctionDef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDeff {

  public static List<String> convertEmpListToNamesList(
    List<Employ> EmployList,
    Function<Employ, String> funcEmpToString
  ) {
    List<String> empNameList = new ArrayList<String>();
    // for (Employ emp : EmployList) {
    //   empNameList.add(funcEmpToString.apply(emp));
    // }
    EmployList.forEach(e -> empNameList.add(funcEmpToString.apply(e)));

    return empNameList;
  }

  public static void main(String[] args) {
    Function<Employ, String> originalName = Employ::getName;
    Function<Employ, Employ> e2firstname = e -> {
      int index = e.getName().indexOf(" ");
      String firstname = e.getName().substring(0, index);
      e.setName(firstname);
      return e;
    };

    List<Employ> EmployList = Arrays.asList(
      new Employ("Tom Jones", 45),
      new Employ("Harry Major", 25),
      new Employ("Ethan Hardy", 65),
      new Employ("Nancy Smith", 15),
      new Employ("Deborah Sprightly", 29)
    );
    List<String> empFirstNameList = convertEmpListToNamesList(
      EmployList,
      originalName.compose(e2firstname)
    );
    empFirstNameList.forEach(s -> {
      System.out.println(s);
    });
  }
}

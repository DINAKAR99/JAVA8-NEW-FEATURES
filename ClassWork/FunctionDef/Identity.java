package FunctionDef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Identity {

  public static List<Employ> applyIdentityToEmpList(
    List<Employ> EmployList,
    Function<Employ, Employ> funcEmpToEmp
  ) {
    List<Employ> empNameList = new ArrayList<Employ>();
    for (Employ emp : EmployList) {
      empNameList.add(funcEmpToEmp.apply(emp));
    }
    return empNameList;
  }

  public static void main(String[] args) {
    List<Employ> EmployList = Arrays.asList(
      new Employ("Tom Jones", 45),
      new Employ("Harry Major", 25),
      new Employ("Ethan Hardy", 65),
      new Employ("Nancy Smith", 15),
      new Employ("Deborah Sprightly", 29)
    );

    List<Employ> empNameListInitials = applyIdentityToEmpList(
      EmployList,
      Function.identity()
    );
    empNameListInitials.forEach(System.out::println);
  }
}

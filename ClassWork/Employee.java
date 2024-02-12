public class Employee {

  String name;
  int salary;
  String deptname;

  public Employee(String name, int salary, String deptname) {
    this.name = name;
    this.salary = salary;
    this.deptname = deptname;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public String getDeptname() {
    return deptname;
  }

  public void setDeptname(String deptname) {
    this.deptname = deptname;
  }
}

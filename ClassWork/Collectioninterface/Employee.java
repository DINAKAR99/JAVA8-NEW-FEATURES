package Collectioninterface;

public class Employee {

  String name;
  int salary;
  String deptname;

  public Employee(String name, int d, String deptname) {
    this.name = name;
    this.salary = d;
    this.deptname = deptname;
  }

  public Employee(String strins, int i) {
    this.name = strins;
    this.salary = i;
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

  public String getDeptName() {
    return null;
  }

  @Override
  public String toString() {
    return (
      "Employee [name=" +
      name +
      ", salary=" +
      salary +
      ", deptname=" +
      deptname +
      "]"
    );
  }

  public void setSalary(double d) {}
}

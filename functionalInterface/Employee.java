public class Employee {

  private String name;
  private int salary;
  private String Grade;

  public Employee(int id, String name, int salary, String grade) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    Grade = grade;
  }

  public String getGrade() {
    return Grade;
  }

  public void setGrade(String grade) {
    Grade = grade;
  }

  public Employee(String string, int i, String string2) {
    this.id = string;
    this.name = i;
    this.salary = string2;
  }

  public Employee() {}

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public void getEmployeeInfo() {
    System.out.println("im a method in emplyee class");
  }

  @Override
  public String toString() {
    return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
  }
}

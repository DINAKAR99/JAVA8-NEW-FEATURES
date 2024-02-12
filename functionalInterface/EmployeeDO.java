public class EmployeeDO {

  private int id;
  private String name;
  private int salary;

  public EmployeeDO() {}

  public EmployeeDO(int id, String name, int i) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

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

  @Override
  public String toString() {
    return (
      "EmployeeDO [id=" + id + ", name=" + name + ", salary=" + salary + "]"
    );
  }
}

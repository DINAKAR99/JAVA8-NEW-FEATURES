public class Student {

  public String name;
  public int age;

  public Student(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }

  public static void main(String[] args) {}

  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + "]";
  }
}

package Streams.StreamOperations;

public class Stud {

  public String name;
  public int age;

  public Stud(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }

  public static void main(String[] args) {}

  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + "]";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

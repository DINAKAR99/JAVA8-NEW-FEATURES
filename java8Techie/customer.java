import java.util.List;

public class customer {

  public int id;
  public String name;
  public String email;
  public List<String> phNums;

  public customer(int id, String name, String email, List<String> phNums) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.phNums = phNums;
  }

  public customer(int id2, String name2, String email2, int i) {}

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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<String> getPhNums() {
    return phNums;
  }

  public void setPhNums(List<String> phNums) {
    this.phNums = phNums;
  }
}

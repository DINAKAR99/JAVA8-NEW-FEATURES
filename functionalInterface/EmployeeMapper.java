public class EmployeeMapper {

  public EmployeeDO convert(Employee e) {
    EmployeeDO em = new EmployeeDO();
    em.setId(e.getId());
    em.setName(e.getName());
    em.setSalary(e.getSalary());

    return em;
  }
}

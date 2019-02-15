package nbattel.ArrayLists;

import java.util.Objects;

public class Employee {

    private String firstName;
    private String ladstName;
    private int id;

    public Employee(String firstName, String ladstName, int id) {
        this.firstName = firstName;
        this.ladstName = ladstName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLadstName() {
        return ladstName;
    }

    public void setLadstName(String ladstName) {
        this.ladstName = ladstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(ladstName, employee.ladstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, ladstName, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", ladstName='" + ladstName + '\'' +
                ", id=" + id +
                '}';
    }
}

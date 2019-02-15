package nbattel.Vectors;

import java.util.List;
import java.util.Vector;

public class Main
{

    public static void main(String[] args)
    {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        //Adding an employee to the list and printing the meployees
        employeeList.add(4, new Employee("Milos", "Arsik", 8989));
        employeeList.forEach(employee -> System.out.println(employee));

        //calling isEmpty() on the list and noting it then printing it (prints true since it isn't empty)
        System.out.println(!employeeList.isEmpty());

        //Inserting an employee at index 1 and printing the list of employees
        ((Vector<Employee>) employeeList).insertElementAt(new Employee("Nick", "Battel", 27), 1);
        employeeList.forEach(employee -> System.out.println(employee));

    }
}

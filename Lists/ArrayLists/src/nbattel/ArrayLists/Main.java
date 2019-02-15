package nbattel.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        //Printing out all the employees in the list
        employeeList.forEach(employee -> System.out.println(employee));

        //Printing out the employee at index 1
        System.out.println(employeeList.get(1));

        //Checking if the List is empty (returns true or false)
        System.out.println(employeeList.isEmpty());

        //Setting an employee at a certain index (Basically removing whatevers there and adding the new one at that index) and then printing all of the employees in the list
        employeeList.set(1, new Employee("John", "Adams", 4568));
        employeeList.forEach(employee -> System.out.println(employee));

        //Printing the size of the List
        System.out.println(employeeList.size());

        //Adding a new employee at index 3 in the list, any employees currently at index 3 or bigger will be shifted
        employeeList.add(3, new Employee("John", "Doe", 4567));
        employeeList.forEach(employee -> System.out.println(employee));

        //Getting the array and printing it
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee: employeeArray)
        {
            System.out.println(employee);
        }

        //Checking to see if the List contains a certain employee (returns true or false)
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));

        //Checking to see what the index of a certain employee is in the list
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        //Removing an employee at a certain index then printing the list of employees
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));
    }
}

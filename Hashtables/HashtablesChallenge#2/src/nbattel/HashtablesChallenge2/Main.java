/*
- Remove duplicate items from a linked list
- Your solution must use the JDK's LinkedList class
- Your solution must use a HashMap
- Use the starter project in the resources section
 */

package nbattel.HashtablesChallenge2;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(e -> System.out.println(e));

        HashMap<Integer, Employee> employeeTable = new HashMap<>();
        ListIterator<Employee> iterator = employees.listIterator();
        List<Employee> remove = new ArrayList<>();

        while(iterator.hasNext())
        {
            Employee employee = iterator.next();
            if(employeeTable.containsKey(employee.getId()))
            {
                remove.add(employee);
            }
            else
            {
                employeeTable.put(employee.getId(), employee);
            }
        }

        for(Employee employee: remove)
        {
            employees.remove(employee);
        }

        System.out.println("-----------------------------");
    }
}

import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 90000),
                new Employee("Alice", 70000),
                new Employee("Bob", 60000),
                new Employee("Cob", 60000),
                new Employee("David", 50000));

        List<Employee> empl = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
     System.out.println(empl);

        // Sorting in descending order using ternary operator
        List<Employee> sortedEmployees = employees.stream()
                .sorted((e1, e2) -> (e1.getSalary() < e2.getSalary()) ? 1 :
                        (e1.getSalary() > e2.getSalary()) ? -1 : 0)
                .toList(); // Java 16+, otherwise use `.collect(Collectors.toList())`

        System.out.println(sortedEmployees);

        Comparator<Employee> myComp=( I1, I2)->(I1.getSalary()<I2.getSalary())?1:(I1.getSalary()<I2.getSalary())?-1:0;

        List<Employee> sortedEmployeess = employees.stream().sorted(myComp).toList();
        System.out.println("=========================================short by Comprator");
        System.out.println(sortedEmployeess);

        Employee empl33 = employees.stream().sorted(myComp).skip(1).distinct().findFirst().orElse(null);
        System.out.println("=========================================Second Highest salay");
        System.out.println(empl33);

        Optional<Double> empl2 =   employees.stream().map(Employee::getSalary).distinct().sorted((o1, o2) -> o1<o2?1:o1>o2?-1:0).skip(1).findFirst();
        System.out.println(empl2);
        int n=6;
        IntStream.range(0, n) // Outer loop (rows)
                .mapToObj(i -> " ".repeat(n - i - 1) + "* ".repeat(i + 1)) // Spaces + Stars
                .forEach(System.out::println); // Print each row
        System.out.println("========================================================================");
        IntStream.range(0, n) // Outer loop (rows)
                .mapToObj(i ->  "* ".repeat(i + 1)) // Spaces + Stars
                .forEach(System.out::println); // Print each row
//        IntStream.range(n, 0) // Outer loop (rows)
//                .mapToObj(i ->  "* ".repeat(i + 1)) // Spaces + Stars
//                .forEach(System.out::println); // Print each row


        IntStream.iterate(n, i -> i > 0, i -> i - 1)
                .mapToObj("* "::repeat) // Generate stars
                .forEach(System.out::println);


    }
}
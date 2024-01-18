import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByApp {
    public static void main(String[] args) {

    }

    private static List<Employee> getEmployeeList(){
        List<Employee> employees = Arrays.asList(
                new Employee("John", "12345"),
                new Employee("Alice", "12346"),
                new Employee("Mary", "12346"),
                new Employee("Sara", "12346"),
                new Employee("Eli", "12346"),
                new Employee("Lili", "12346"),
                new Employee("Bob", "23456"),
                new Employee("Eva", "23457"),
                new Employee("Mike", "34567"),
                new Employee("Bob", "34568"),
                new Employee("David", "45678"),
                new Employee("Emily", "45679"),
                new Employee("Jane", "45679"),
                new Employee("Peter", "45679"),
                new Employee("Ema", "45679"),
                new Employee("Ana", "45679")
        );
        return employees;
    }

    private static Map<String, List<Employee>> groupEmployeesByPostalCodePrefix(List<Employee> employees, int minGroupSize) {
        return employees.stream()
                .collect(Collectors.groupingBy(
                        employee -> employee.getPostalCode().substring(0, 2)))
                .entrySet().stream()
                .filter(entry -> entry.getValue().size() >= minGroupSize)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

}

package tothenew;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    //data members to store data of object
    String fullName;
    long salary;
    String city;

    //parameterized constructor to initialize data of object
    public Employee(String fullName, long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
}

public class question4 {
    public static void main(String[] args) {
        //creating list to store numbers form 1 to 10
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //collecting all the even numbers in list using stream
        List<Integer> evenNumbers = numbers.stream().filter(
                x -> x % 2 == 0
        ).collect(Collectors.toList());
        System.out.println(evenNumbers);
        //creating list of  objects  and  storing different  objects in a list
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Amit Singh Prajapati", 2000, "Mumbai"));
        employees.add(new Employee("karan Malhotra", 5000, "Banglore"));
        employees.add(new Employee("Arpan Gupta", 3000, "Delhi"));
        employees.add(new Employee("Anand kumar", 4000, "Delhi"));
        employees.add(new Employee("Alok Chauhan", 7000, "Delhi"));
        employees.add(new Employee("Kanika Jain", 2000, "Delhi"));
        employees.add(new Employee("Arpan Mishra", 2000, "Delhi"));
        // Collecting all unique names from list of  objects
        List<String> uniqueNameList = new ArrayList<String>();
        // creating stream to collect all  unique names and collecting it
        List<Employee> filteredEmployees = employees.stream().filter(x -> {
            String[] name = x.fullName.split(" "); // splitting full name into array from space
            String uniqueName = name[0]; // getting first name
            // conditions  to match that employee has unique first name and lives in delhi and has salary < 5000
            if (x.city == "Delhi" && x.salary < 5000) {
                if (uniqueNameList.contains(uniqueName) == false) {
                    uniqueNameList.add(uniqueName);
                    return true;
                }
            }
            return false;
        }).collect(Collectors.toList());
        System.out.println(filteredEmployees.toString());
    }
}
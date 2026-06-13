interface Employee{
    int salary();
}

class AndroidDeveloper implements Employee{
    public int salary(){
        System.out.println("Getting AndriodDeveloper salary");
        return 40000;

    }
    
}

class Webdeveloper implements Employee{
    public int salary(){
        System.out.println("Getting webdeveloper salary");
        return 50000;

    }
    
}
class EmployeeFactory{
    // get the employee
public static Employee getEmployee(String empType) {

    if (empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
        return new AndroidDeveloper();
    } 
    else if (empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
        return new Webdeveloper();
    } 
    else {
        return null;
    }
}


}
public class FactoryDesignPattern {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
System.out.println(employee);

int salary = employee.salary();
System.out.println("Salary : " + salary);

Employee employee2 = EmployeeFactory.getEmployee("WEB DEVELOPER");
System.out.println("Salary : " + employee2.salary());
        
    }
    
}

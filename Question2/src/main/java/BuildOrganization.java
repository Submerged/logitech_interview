/**
 *
 * @author Derek Leblanc
 * @date August 11 / 2019
 * @description Launch point of Question 2. Builds the organizational structure and prints it out
 */

public class BuildOrganization {
    public static void main(String args[]) {
        
        //Top Down approach to organizational structure creation -- Starting with the CEO
        Employee organizationCEO = new Employee(40, "0000-00", "Last", "John", "Canada", "BC", "123 White ST", "V6P 3E9");
        EmployeeRegistry employeeRegistry = new EmployeeRegistry(organizationCEO);
        
        Employee employeeMary = new Employee(56, "0000-01", "Last", "Mary", "Canada", "BC", "123 Brown ST", "V6P 3E9");
        Employee employeePeter = new Employee(70, "0000-02", "Last", "Peter", "Canada", "BC", "123 Yellow ST", "V6P 3E9");
        Employee employeeMichael = new Employee(21, "0000-03", "Last", "Michael", "Canada", "BC", "123 Orange ST", "V6P 3E9");
        
        employeeRegistry.addEmployee(employeeMary, "John");
        employeeRegistry.addEmployee(employeePeter, "John");
        employeeRegistry.addEmployee(employeeMichael, "John");
        
        //Mary Subordinates 
        Employee employeeSam = new Employee(35, "0000-04", "Last", "Sam", "Canada", "BC", "123 Salmon ST", "V6P 3E9");
        Employee employeeWill = new Employee(45, "0000-05", "Last", "Will", "Canada", "BC", "123 Mustard ST", "V6P 3E9");
        
        employeeRegistry.addEmployee(employeeSam, "Mary");
        employeeRegistry.addEmployee(employeeWill, "Mary");
        
        //Will Subordinates
        Employee employeeJackie = new Employee(56, "0000-06", "Last", "Jackie", "Canada", "BC", "123 Blue ST", "V6P 3E9");
        Employee employeeFrank = new Employee(49, "0000-07", "Last", "Frank", "Canada", "BC", "123 Green ST", "V6P 3E9");
        employeeRegistry.addEmployee(employeeJackie, "Will");
        employeeRegistry.addEmployee(employeeFrank, "Will");
        
        //Print entire org structure
        employeeRegistry.printOrganization();
        
        
        employeeRegistry.getEmployeeSharedSuperior(employeeWill, employeeMichael);
    }
}

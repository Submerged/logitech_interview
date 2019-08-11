/**
 *
 * @author Derek Leblanc
 * @date August 11 / 2019
 * @description Employee Registry class which is a mediator for the organizational structure
 */

import java.util.HashMap;
import org.apache.commons.lang.Validate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derekleblanc
 */
public class EmployeeRegistry {
    private HashMap<String, Employee> employees;
    private Employee CEO;
    public EmployeeRegistry(Employee root){        
        Validate.notNull(root, "Root of org structure cannot be null");
        
        this.employees = new HashMap<>();
        this.employees.put(root.getGivenName(), root);
        this.CEO = root;
    }
    
    /**
     * Adds a single employee to the registry and link them to their boss
     * @param newEmployee employee we want to add to organization
     * @param bossFirstName who the boss of this employee is. 
     */
    public void addEmployee(Employee newEmployee, String bossFirstName){
        if(employees.containsKey(newEmployee.getGivenName())){
            throw new IllegalArgumentException ("This implementation is limited and requires a unique given(first) name per employee");
        }
        employees.put(newEmployee.getGivenName(), newEmployee);
        
        Employee boss = this.employees.get(bossFirstName);
        Validate.notNull(boss, String.format("Can't link to boss [ %s ] who doesn't exist", bossFirstName));
        boss.addSubordinate(newEmployee);
    }
    
    /**
     * Retrieves a single employee based on their first name or throws error if key doesn't exist
     * @param givenName AKA first name of a person
     * @return single found employee object
     */
    public Employee getEmployeeByGivenName(String givenName){
        if(!employees.containsKey(givenName)){
            throw new IllegalArgumentException (String.format("There is no employee in the organizational structure named [ %s ]", givenName));
        }
        return this.employees.get(givenName);
    }
    
    /**
     * Return the count of employees in the registry
     * @return employee count
     */
    public int getEmployeeCount(){
        return this.employees.size();
    }
    
    /**
     * Helper function to print the entire organization, starting with the CEO
     */
    public void printOrganization(){
        depthFirstPrintSubordinates(this.CEO, 0);
    }
    
    /**
     * Traverse the hierarchy using DFS and print subordinates at the same time
     * @param employee the employee object (node) in the traversal 
     * @param depth used mostly to indent our hierarchy, but indicates what depth of the travesral we're on
     */
    private void depthFirstPrintSubordinates(Employee employee, int depth) {
        if(employee.getSubordinates().isEmpty()) { // Explicit Stop condition
            return;
        }
        System.out.println();
        System.out.println(String.format("%s--%s %s", "\t".repeat(depth), employee.getGivenName(), employee.getFamilyName()));
        System.out.println(String.format("%sSubordinates:", "\t".repeat(depth)));
        employee.getSubordinates().forEach(subordinate -> {
            System.out.println(String.format("\t%s%s %s", "\t".repeat(depth), subordinate.getGivenName(), subordinate.getFamilyName()));
            depthFirstPrintSubordinates(subordinate, depth+1);
        });
    }
    
}

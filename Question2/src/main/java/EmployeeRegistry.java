
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
    
    public void addEmployee(Employee newEmployee, String bossFirstName){
        if(employees.containsKey(newEmployee.getGivenName())){
            throw new IllegalArgumentException ("This implementation is limited and requires a unique given(first) name per employee");
        }
        employees.put(newEmployee.getGivenName(), newEmployee);
        
        Employee boss = this.employees.get(bossFirstName);
        Validate.notNull(boss, String.format("Can't link to boss [ %s ] who doesn't exist", bossFirstName));
        boss.addSubordinate(newEmployee);
    }
    
    public Employee getEmployeeByGivenName(String givenName){
        if(!employees.containsKey(givenName)){
            throw new IllegalArgumentException (String.format("There is no employee in the organizational structure named [ %s ]", givenName));
        }
        return this.employees.get(givenName);
    }
    
    public int getEmployeeCount(){
        return this.employees.size();
    }
    
    public void printOrganization(){
        //Start with CEO and traverse the org structure using DFS with printing
        depthFirstPrintSubordinates(this.CEO, 0);
    }
    
    private void depthFirstPrintSubordinates(Employee employee, int depth) {
        if(employee.getSubordinates().isEmpty()) {
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

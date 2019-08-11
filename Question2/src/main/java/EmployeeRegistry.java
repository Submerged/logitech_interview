
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
    public EmployeeRegistry(Employee root){        
        Validate.notNull(root, "Root of org structure cannot be null");
        
        this.employees = new HashMap<>();
        this.employees.put(root.getGivenName(), root);
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
    
}

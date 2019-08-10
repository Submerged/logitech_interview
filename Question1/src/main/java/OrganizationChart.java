
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
public class OrganizationChart {
    public OrganizationChart(Employee root){
        Validate.notNull(root, "Root of org structure cannot be null");
    }
    
    public void addEmployee(Employee newEmployee, String boss){
        
    }
    
    public Employee getEmployeeByGivenName(String givenName){
        return new Employee(35, "-", "-", "-", "-", "-", "-", "-", null, null);
    }
    
    public int getEmployeeCount(){
        return 0;
    }
    
}

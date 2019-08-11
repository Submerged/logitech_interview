
import java.util.ArrayList;
import org.apache.commons.lang3.Validate;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derekleblanc
 */
public class Employee {
    private int age;
    private String employeeID;
    private String familyName;
    private String givenName;
    private String country;
    private String geographicRegion;
    private String address;
    private String postalCode;
    private Employee currentBoss;
    private ArrayList<Employee> currentReports = new ArrayList<>();;
    
    public Employee(int age, 
                    String employeeID, 
                    String familyName, 
                    String givenName,
                    String country, 
                    String geographicRegion, 
                    String address,
                    String postalCode){
        
        //Validate fields to make sure we're not passed null or blank values
        Validate.inclusiveBetween(16, 110, age, "Age must be between 16 and 110 -- Inclusive");
        Validate.notNull(employeeID, "Employee ID cann't be null");
        Validate.notNull(familyName);
        Validate.notBlank(familyName, "Family Name cannot be blank");
        Validate.notNull(givenName);
        Validate.notBlank(givenName, "Given Name cannot be blank");
        Validate.notNull(country);
        Validate.notBlank(country, "Country cannot be blank");
        Validate.notNull(geographicRegion);
        Validate.notBlank(geographicRegion, "Geographic Region cannot be blank");
        Validate.notNull(address);
        Validate.notBlank(address, "Address cannot be blank");
        Validate.notNull(postalCode);
        Validate.notBlank(postalCode, "Postal Code cannot be blank");
        
        //Initialize instance variables
        this.age = age;
        this.employeeID = employeeID;
        this.familyName = familyName;
        this.givenName = givenName;
        this.country = country;
        this.geographicRegion = geographicRegion;
        this.address = address;
        this.postalCode = postalCode;
        
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGeographicRegion() {
        return geographicRegion;
    }

    public void setGeographicRegion(String geographicRegion) {
        this.geographicRegion = geographicRegion;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Employee getCurrentBoss() {
        if(currentBoss == null){
            throw new IllegalArgumentException("This individual has no boss...this should be the CEO");
        }
        return currentBoss;
    }

    public void setCurrentBoss(Employee currentBoss) {
        this.currentBoss = currentBoss;
    }

    public ArrayList<Employee> getSubordinates(){
        return this.currentReports;
        
    }
    
    //Adds a single subordinate to this employee
    public void addSubordinate(Employee subordinate){
        Validate.notNull(subordinate, "Cannot add a null subordiante");
        this.currentReports.add(subordinate);
        subordinate.setCurrentBoss(this);
    }
    
    public void addSubordinates(ArrayList<Employee> subordinates) {
        subordinates.forEach(subordinate -> {
            Validate.notNull(subordinate);
            this.currentReports.add(subordinate);
        });
    }
    
    /*
    Helper function to quickly see all the subordinates of this employee
    */
    public void printSubordinates(){
        System.out.println(String.format("Subordinates of %s %s", this.givenName, this.familyName));
        this.currentReports.forEach(subordinate -> System.out.println(subordinate.givenName));
    }
}

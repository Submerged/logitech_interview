/**
 *
 * @author Derek Leblanc
 * @date August 11 / 2019
 * @description Employee class for organization
 */


import java.util.ArrayList;
import org.apache.commons.lang3.Validate;

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
        Validate.notBlank(employeeID, "Employee ID cann't be blank");
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
    
    /**
     * Get the employee's age
     * @return 
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Set the employee's age 
     * @param age employee's age between 16-110 inclusive
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * Get the employee's ID
     * @return 
     */
    public String getEmployeeID() {
        return employeeID;
    }
    
    /**
     * Set the employee's ID
     * @param employeeID String of employee's ID
     */
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    
    /**
     * Get the employee's family name
     * @return AKA last name
     */
    public String getFamilyName() {
        return familyName;
    }
    
    /**
     * Set the employee's family name
     * @param familyName AKA last name
     */
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    
    /**
     * Get the employee's given name
     * @return AKA first name
     */
    public String getGivenName() {
        return givenName;
    }
    
    /**
     * Set the employee's given name
     * @param givenName AKA first name
     */
    private void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    
    /**
     * Get the employee's country
     * @return 
     */
    public String getCountry() {
        return country;
    }
    
    /** 
     * Sets the employee's country
     * @param country 
     */
    public void setCountry(String country) {
        this.country = country;
    }
    /**
     * Get the geographic region of the employee
     * @return geographic return AKA state / province
     */
    public String getGeographicRegion() {
        return geographicRegion;
    }
    
    /**
     * Set the geographic region of the employee
     * @param geographicRegion AKA state / province
     */
    public void setGeographicRegion(String geographicRegion) {
        this.geographicRegion = geographicRegion;
    }

    /**
     * Get the employee's address
     * @return employee's address
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * Sets the employee's address
     * @param address employee's address
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * Gets the postal code of the employee
     * @return postal code
     */
    public String getPostalCode() {
        return postalCode;
    }
    
    /**
     * Set the postal code of the employee
     * @param postalCode The postal code of the employee 
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    /**
     * Get the employees current boss
     * @return employee's boss object
     */
    public Employee getCurrentBoss() {
        if(currentBoss == null){
            throw new IllegalArgumentException("This individual has no boss...this should be the CEO");
        }
        return currentBoss;
    }
    
    /**
     * Set the current boss of this employee
     * @param currentBoss The object of this employee's boss
     */
    public void setCurrentBoss(Employee currentBoss) {
        this.currentBoss = currentBoss;
    }
    
    /**
     * Get all subordinates for this employee
     * @return employee's subordinates
     */
    public ArrayList<Employee> getSubordinates(){
        return this.currentReports;
        
    }
    
    /**
     * Adds a single subordinate (Employee) to this employee
     * @param subordinate The employee object that is the subordinate
     */
    public void addSubordinate(Employee subordinate){
        Validate.notNull(subordinate, "Cannot add a null subordinate");
        this.currentReports.add(subordinate);
        subordinate.setCurrentBoss(this);
    }
    
    /**
     * Adds a multiple subordinates to this employee
     * @param subordinates ArrayList of employee objects that are subordinates
     */
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

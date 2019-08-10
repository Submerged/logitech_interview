
import java.util.ArrayList;

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
    private ArrayList<Employee> currentReports;
    
    public Employee(int age, 
                    String employeeID, 
                    String familyName, 
                    String givenName,
                    String country, 
                    String geographicRegion, 
                    String address,
                    String postalCode,
                    Employee currentBoss,
                    ArrayList<Employee> currentReports){
        
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = 0;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = "employeeID";
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = "familyName";
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = "givenName";
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = "country";
    }

    public String getGeographicRegion() {
        return geographicRegion;
    }

    public void setGeographicRegion(String geographicRegion) {
        this.geographicRegion = "geographicRegion";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = "address";
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = "postalCode";
    }

    public Employee getCurrentBoss() {
        return currentBoss;
    }

    public void setCurrentBoss(Employee currentBoss) {
        this.currentBoss = currentBoss;
    }

    
}

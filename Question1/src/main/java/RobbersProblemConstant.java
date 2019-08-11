
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derekleblanc
 */
public class RobbersProblemConstant {
    
    /**
     * More efficient implementation of trying out every single possible subset of houses and taking the best one
     * in which the condition passes for not trigger an alarm (no two adjacent houses can be robbed)
     * Time complexity is linear time O(n) and requires O(n) space as well to save robbed sums over iteration
     * @param housesAndValues
     * @return 
     */
    public int maximizeThievery(Vector<Integer> housesAndValues) {
       int valueRobbed = 0;
       ArrayList<Integer> robbedValues = new ArrayList<>();
       
       for(int i = 0; i < housesAndValues.size(); i++) {
           if(i == 0){
               // We only have one option here, to Rob house 0
               robbedValues.add(housesAndValues.get(0));
           }else if(i == 1) {
               // We have two choices we can take without setting off the alarm; rob house 0 or 1
               robbedValues.add(Math.max(housesAndValues.get(0), housesAndValues.get(1)));
           }else {
               //Starting at index 2 we decide if robbing the current house and what the sum was two houses back (no alarms set off this way!)
               //outweighs the potential robbed sum right before this house (i-1).
               
               int maxCombinationCanRob = Math.max(robbedValues.get(i-1), housesAndValues.get(i) + robbedValues.get(i-2));
               robbedValues.add(maxCombinationCanRob);
           }
           
       }
       return robbedValues.get(robbedValues.size()-1); // Take last element of array which gives our max potential robbed sum
    }
}

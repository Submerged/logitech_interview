
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
public class RobbersProblemExponential {
     
    /**
     * Accepts a vector of houses and their respective values. The goal here is to maximize the amount
     * of money we steal without robbing two adjacent houses and alerting the police. This is the quickest
     * implementation I could come up with that I knew would work and was helpful in testing the better implementation
     * 
     * Time complexity: O(2^n) <--- 2^n total possible subsets --->
     * Space complexity (2n) 
     * 
     * @param housesAndValues Vector of houses and values
     * @return the maximum amount we can rob without alerting the police
     */
    public int maximizeThievery(Vector<Integer> housesAndValues) {
        if(housesAndValues.stream().anyMatch(i -> i < 0)) {
            throw new IllegalArgumentException("Houses must all be positive integers. We found at least one that is negative");
        }
        
        int n = housesAndValues.size();
        ArrayList<Integer> validTotalCashedRobbedSubsets = new ArrayList<>();
        
        for(int i = 0; i < (1 << n); i++) { //Bit shift by our total houses so we capture all possible subsets
            ArrayList<Integer> housesInSet = new ArrayList<>();
            int totalCashRobbed = 0;
            for(int j = 0; j < n; j++) {
                if((i & (1 << j)) > 0) {
                    housesInSet.add(j);
                    totalCashRobbed += housesAndValues.get(j);
                }
            }
            
            //Make sure this set isn't violating our adjacency rule
            if(validateNonAdjacentHouses(housesInSet)){
                validTotalCashedRobbedSubsets.add(totalCashRobbed);
            }
        }
        return Collections.max(validTotalCashedRobbedSubsets); //Return our best performing subset
    }
    
    /**
     * Quick helper method to check if any members of the set of robbed houses are side by side
     * @param housesRobbed the houses of the set we've robbed
     * @return true if we wont set off any alarms by robbing adjacent houses
     */
    public boolean validateNonAdjacentHouses(ArrayList<Integer> housesRobbed) {
        for(int i = 0; i < housesRobbed.size();i++){
            if(i > 0){
                if(housesRobbed.get(i)-housesRobbed.get(i-1) <= 1) {
                    return false;
                }
            }
        }
        return true;
    }
}

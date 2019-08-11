
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
public class RobbersProblem {
    
    public int maximizeTheftIdeal(Vector<Integer> housesAndValues) {
       return 0;
    }
    
    /**
     * Accepts a vector of houses and their respective values. The goal here is to maximize the amount
     * of money we steal without robbing two adjacent houses and alerting the police
     * 
     * @param housesAndValues Vector of houses and values
     * @return the maximum amount we can rob without alerting the police
     */
    public int maximizeTheft(Vector<Integer> housesAndValues) {
        int n = housesAndValues.size();
        ArrayList<Integer> validTotalCashedRobbedSubsets = new ArrayList<>();
        
        for(int i = 0; i < (1 << n); i++) {
            ArrayList<Integer> housesInSet = new ArrayList<>();
            int totalCashRobbed = 0;
            for(int j = 0; j < n; j++) {
                if((i & (1 << j)) > 0) {
                    housesInSet.add(j);
                    totalCashRobbed += housesAndValues.get(j);
                }
            }
            if(validateNonAdjacentHouses(housesInSet)){
                validTotalCashedRobbedSubsets.add(totalCashRobbed);
            }
        }
        return Collections.max(validTotalCashedRobbedSubsets);
    }
    
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

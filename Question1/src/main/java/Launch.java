
import java.util.Arrays;
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
public class Launch {
    public static void main(String args[]) {
        RobbersProblem robbersProblem = new RobbersProblem();
        Vector<Integer> housesAndValues = new Vector<>(Arrays.asList(1,2,3,1,10,80,80,1000));
        
        int maxTheft = robbersProblem.maximizeTheft(housesAndValues);
        System.out.println(String.format("Max Theft %d", maxTheft));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.codility.main;

import co.com.codility.test.Solution;
import javax.swing.JOptionPane;

/**
 *
 * @author juliansten
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] A = {2,3,1,5,6};//{1,1,1,1,1,6,1,1,1,1,1}||{-1,3,-4,5,1,-6,2,1};
        Solution obj = new Solution();
        int equilibriumNum = obj.tapeEquilibrium(A);
        if (equilibriumNum == -1) {
            System.out.println("There is not a equilibrium number into the array given");
        }else{
            equilibriumNum= equilibriumNum+1;
            System.out.println("The index of first equilibrium number is: "+equilibriumNum);
        } 
        
        int minimalFrogJumps = obj.frogJmp(2,10,1);//5, 50, 10 || 10,85,30 || 2,10,1 
        System.out.println("the minimal number of frog jumps: "+minimalFrogJumps);
        
        obj.permMissingElem(A);
    }
    
}
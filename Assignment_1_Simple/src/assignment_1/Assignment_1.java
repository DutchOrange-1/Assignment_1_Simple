/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;

/**
 *
 * @author Brandon
 */
public class Assignment_1 {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String store1 = "Futuristic",  //Strings for the companies names. 
           store2 = "Dimension",
           store3 = "Mobi Teck",
           store4 = "Robo Teck",
           store5 = "Secure IT",
           store6 = "Info Age",
           store7 = "MobiliITy"; 
    
    int store1Inc = 100000,  // Income of of companies. 
        store2Inc = 89000, 
        store3Inc = 87000,
        store4Inc = 125000,
        store5Inc = 99000,
        store6Inc = 156500,
        store7Inc = 62000; 
    
    int store1Exp = 56000,  //Expenses of companies. 
        store2Exp = 61500,
        store3Exp = 91340,
        store4Exp = 99000,
        store5Exp = 115000,
        store6Exp = 105350,
        store7Exp = 83500; 
    
    int profit;  //Must they be used ? 
    int loss; 
   
        System.out.print("COMPANY \t INCOME \t EXPENSE \t PROFIT \t LOSS \n≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡\n"
                + store1 + " \tR" + store1Inc + "    \t R" + store1Exp + "     \t  " + (store1Inc - store1Exp) +" \n" //Profit
                + store2 + " \tR" + store2Inc + "    \t R" + store2Exp + "     \t  " + (store2Inc - store2Exp) +" \n" //Profit
                + store3 + " \tR" + store3Inc + "    \t R" + store3Exp + "     \t   \t  \t R "+ (store3Exp-store3Inc) +" \n" //Loss
                + store4 + " \tR" + store4Inc + "    \t R" + store4Exp + "     \t  " + (store4Inc - store4Exp) +" \n" //profit
                + store5 + " \tR" + store5Inc + "    \t R" + store5Exp + "     \t   \t  \t R "+ (store5Exp-store5Inc) + " \n" //Loss
                + store6 + " \tR" + store6Inc + "    \t R" + store6Exp + "     \t  " + (store6Inc - store6Exp) +" \n" //Profit
                + store7 + " \tR" + store7Inc + "    \t R" + store7Exp + "     \t   \t  \t R " + (store7Exp-store7Inc) + " \n" //Loss
                + "\nNumber of companies with profits: 4 \nNumber of companies with losses: 3 \n \n");
 
    }
    
}

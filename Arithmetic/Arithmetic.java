//////////////////////////////////////////////
//Keri McGlothlin
//CSE 002-110 
//September 7th 2014
//Arithmetic Java Program
//This progam computes the cot of itms at Walmart including tax 

//define the class
public class Arithmetic{

    //add main method
    public static void main(String[] args) {
        //Define the input data
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        //6% sales tax
        double taxPercent=0.06;
        
        //Item Socks, number of socks, and cost of one pair of socks
        System.out.println("Socks");
        System.out.println("Number of socks = "+nSocks);
        System.out.println("Cost of one pair of socks = $"+sockCost$);
        //Item Glasses, number of glasses, and cost of one glass
        System.out.println("Glasses");
        System.out.println("Number of glasses = "+nGlasses);
        System.out.println("Cost of one glass = $"+glassCost$);
        //Item Envelopes, number of glasses, and cost of 1 envelope
        System.out.println("Envelopes");
        System.out.println("Number of envelopes = "+nEnvelopes);
        System.out.println("Cost of one envelope = $"+envelopeCost$);
        
        //compute the cost of all the socks together
        double tSocksCost=sockCost$*nSocks;
        //compute the cost of sales tax on all the socks
        double socksTax = taxPercent*tSocksCost;
        
        //print out the values of the cost of socks and then its tax separately
        System.out.println("Cost of socks w/ out tax = $"+tSocksCost);
        System.out.printf("Cost of tax on socks = $%.2f \n",socksTax);
        
        //compute the cost of all the glasses together
        double glassesCost=glassCost$*nGlasses;
        //compute the cost of tax on all the glasses
        double glassesTax=taxPercent*glassesCost;
        
        //print out the cost of the glasses and then its tax separately
        System.out.println("Cost of glasses w/ out tax = $"+glassesCost);
        System.out.printf("Cost of tax on socks = $%.2f \n",glassesTax);
        
        //compute the cost of all envelopes
        double envelopesCost=envelopeCost$*nEnvelopes;
        //compute the cost of tax on the envelopes
        double envelopesTax=taxPercent*envelopesCost;
        
        //print out the cost of the envelopes and its tax separately
        System.out.println("Cost of socks w/ out tax = $"+envelopesCost);
        System.out.printf("Cost of tax on socks = $%.2f \n",envelopesTax);
        
        //comute the total of all the items with no tax
        double totalNoTax=envelopesCost+glassesCost+tSocksCost;
        //compute the total of all the taxes
        double totalTax=socksTax+envelopesTax+glassesTax;
        
        //print out the different totals with no tax, only tax, and combined
        System.out.printf("Total before tax = $%.2f \n",totalNoTax);
        System.out.printf("Total tax = $%.2f \n",totalTax);
        System.out.printf("Total including tax = $%.2f \n",(totalTax+totalNoTax));
    }
}
 
        


//////////////////////////////////////////////
//Keri McGlothlin
//CSE 002-110 
//September 3rd 2014
//Cyclometer Java Program
//This progam takes the time and rotation count of each trip 
//to produce the number of minutes and counts as well as
//the distance in miles for each trip and for both trips combined.

//define the class
public class Cyclometer{

    //add main method
    public static void main(String[] args) {
        // define the input data
        int secsTrip1=480; //seconds for trip 1
        int secsTrip2=3220; //seconds for trip 2
        int countsTrip1=1561; //counts for trip 1
        int countsTrip2=9037; //counts for trip 2
        //intermediate variables and output data.
        double wheelDiameter=27.0, //the diameter of the bicycles wheel
        PI=3.14159, //the numberical value of pi
        feetPerMile=5280, //how many feet are in a mile
        inchesPerFoot=12, //how many inches are in one foot
        secondsPerMinute=60; //how many seconds are in a minute
        double distanceTrip1, distanceTrip2,totalDistance; //these distances are
        //going to hold a decimal place.
        
        System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts."); //print out the result values for how long trip
        //1 took in minutes and how many counts there were.
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
        countsTrip2+" counts."); //print out the result values for how long trip
        //2 took in minutes and how many counts there were.
        distanceTrip1=countsTrip1*wheelDiameter*PI;// This will give the
        //distance for trip 1 in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
        //Above will give the distance for trip 2 in miles
        totalDistance=distanceTrip1+distanceTrip2; //This gives both trip1 and 
        //trip2's distances combined

        //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        } //end of main method
} // end of class
import java.io.*;
import java.util.*;

// To fullfill condition that  Passenger class must have function to print detial
interface InnerPassenger {

    void printDetail();
}

public class Passenger implements InnerPassenger{

    final String name;
    final int passengerNumber;
    final String passengerType;
    double balance;//wiill keep zero for premium type
    ArrayList<Activity> signedActivities;

    static int nextpassengerNumber = 0;//to generate passenger number sequencially`

    public Passenger(String name, String passengerType, double balance) {
        this.name = name;
        this.passengerNumber = ++nextpassengerNumber;
        this.passengerType = passengerType;
        this.balance = balance;
        this.signedActivities = new ArrayList<>();
    }

    public void signUpForActivity(Activity activity) 
    {
        signedActivities.add(activity);
    }

    public String getName() 
    {
        return name;
    }

    public int getNumber() 
    {
        return passengerNumber;
    }

    public String getType() 
    {
        return passengerType;
    }


    //Print the details of an individual passenger as asked in task 
    
    public void printDetail() 
    {
        System.out.println("Name of Passenger : " + name);
        System.out.println("Passenger Number  : " + passengerNumber);
        System.out.println("Remaining Balance : " + balance);
        System.out.println("Signed Activities detail is following are " + signedActivities.size());

        for (Activity activity : signedActivities) 
        {
            System.out.print("Activity Name : " + activity.getName()); 
            System.out.print("Destination Name : " + activity.getDestination());
            double costpaid = activity.getCost();
            if(passengerType.equals("gold")) costpaid*=0.9;
            if(passengerType.equals("premium")) costpaid*=0.0;
            
            System.out.print("Price paid by passenger : " + costpaid);
        }
    }
}

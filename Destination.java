import java.io.*;
import java.util.*;

// To fullfill condition that  Passenger class must have function to print detial

interface InnerDestination{

    void printActivities();
    
}

public class Destination implements InnerDestination{

    private final String name;
    private final ArrayList<Activity> activities;

    public Destination(String name, ArrayList<Activity> activities){
        this.name = name;
        this.activities = activities;
    }

    public String getName() 
    {
        return name;
    }

    public ArrayList<Activity> getActivities() 
    {
        return activities;
        
    }
    /*
    This function will print detial of each activity (as per pattern asked in task)
    */
    public void printActivities() 
    {
        System.out.println("Activities at " + name + ":");
        for(Activity activity : activities) 
        {
            System.out.println("Activity Name : " + activity.getName() + "\n" + "Description : "+ activity.getDescription() + "\n" +
                    "(Cost: " + activity.getCost() + ", Capacity: " + activity.getCapacity() + ")");
        }
    }
}

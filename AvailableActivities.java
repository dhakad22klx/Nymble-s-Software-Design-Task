
/**
* This program implemented to make seperate module to print Availavle actitives as asked in task.
* To implement travelPacakge function printAvailableActitives seperately,
* so that it can be modified seperately
*/

import java.util.*;
import java.io.*;

public class AvailableActivities {
    
    public static void printDetail(ArrayList<Destination> itinerary)
    {
        System.out.println("Activities that still have space available" + " :");
        for(Destination destination : itinerary)
        {
            for(Activity activity : destination.getActivities())
            {
                if(activity.getCapacity() > 0)
                {
                    System.out.println("Name of activity is " + activity.getName() 
                     + ", and available spaces are " + activity.getCapacity());
                }
            }
        }
    }
}
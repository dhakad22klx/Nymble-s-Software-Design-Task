
/**
* This program implemented to make seperate module to print Itinerary as asked in task.
* To implement travelPacakge function printItinerary seperately,
* so that it can be modified seperately
*/


import java.util.*;
import java.io.*;

public class Itinerary{
    

    public static void printDetail(String packageName, ArrayList<Destination> itinerary)
    {
        System.out.println("TravelPackage Name : " + packageName);
        for(Destination destination : itinerary)
        {
            System.out.println("Name of destination : " + destination.getName());
            destination.printActivities();
        }
    }
}
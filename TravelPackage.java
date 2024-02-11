/**
* This program implements an Travel package modules
* It contains all the member and functions as mentioned in task
* It is the mail entry file
*
* @author  dhakad22klx
* @since   2024-02-10
*/

import java.io.*;
import java.util.*;

public class TravelPackage {

    final String name;
    final int passengerCapacity;
    final ArrayList<Destination> itinerary;
    final ArrayList<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity, ArrayList<Destination> itinerary) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = itinerary;
        this.passengers = new ArrayList<>(); 
    }

    //this method is printing itinerary of module in detail as asked in task
    public void printItinerary() {
        Itinerary.printDetail(name, itinerary);
    }

    //this method is printing all the detail about passengers as asked in task
    public void printPassengerList() {
        PassengerList.printDetail(name, passengerCapacity, passengers);
    }

    //this method is printing all the detail about available actitivies  as asked  in task
    public void printAvailableActivities() 
    {
        AvailableActivities.printDetail(itinerary);
    }
}

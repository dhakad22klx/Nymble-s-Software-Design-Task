
/**
* This program implemented to make seperate module to print Passenger list  as asked in task.
* To implement travelPacakge function printPassengerList seperately,
* so that it can be modified seperately
*/

import java.io.*;
import java.util.*;

public class PassengerList {

    public static void printDetail(String packgeName , int passengerCapacity, ArrayList<Passenger> passengers)
    {
        System.out.println("TravelPackage Name : " + packgeName);
        System.out.println("Passenger Capacity of package : " + passengerCapacity);
        System.out.println(passengers.size() + "number of passengers curretly enrolled and their deatil is following");
        for(Passenger passenger : passengers)
        {
            System.out.println("Passenger name is " + passenger.getName() + ", and corresponding passenger <number is " + passenger.getNumber());
        }
    }
}

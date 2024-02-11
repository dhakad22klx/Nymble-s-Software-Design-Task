import java.io.*;
import java.util.*;

public class Activity 
{
    private final String name;
    private final String description;
    private final double cost;
    // private final int capacity;
    private  int  ReamainingCapacity;
    private final Destination destination;

    public Activity(String name, String description, double cost, int capacity, Destination destination) 
    {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.ReamainingCapacity = capacity;
        this.destination = destination;
    }

    public String getName() 
    {
        return name;
    }

    public String getDescription() 
    {
        return description;
    }

    public double getCost() 
    {
        return cost;
    }

    public int getCapacity() 
    {
        return ReamainingCapacity;
    }

    public Destination getDestination() 
    {
        return destination;
    }

}

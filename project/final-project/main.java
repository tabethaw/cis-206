/*
 File: main.java
 Description: This is a program that stores different mountain details
 Created: Saturday June 11, 2023 
 Author: Tabetha Watson
 email: tabethw4923@student.vvc.edu
*/


import java.util.ArrayList;
import java.util.List;

class Mountain {
    private String name;
    private String country;
    private int elevation;
    
    public Mountain(String name, String country, int elevation) {
        this.name = name;
        this.country = country;
        this.elevation = elevation;
    }

    public String set_name() {
        return name;
    }

    public String set_country() {
        return country;
    }

    public int set_elevation() {
        return elevation;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void set_country(String country) {
        this.country = country;
    }

    public void set_elevation(int elevation) {
        this.elevation = elevation;
    }

    public double toMeters() {
        return elevation / 3.2808;
    }
}

public class main {
    public static Mountain findMinElevation(List<Mountain> mountains) {
        int minElevaiton = Integer.MAX_VALUE;
        Mountain minMountain = null;
        for (Mountain mountain : mountains){
            if(mountain.set_elevation() < minElevaiton){
                minElevaiton = mountain.set_elevation();
                minMountain = mountain;
            }
        }
        return minMountain;
    }


public static void main(String[] args) {
    
    // This block of code is used to list Mountain Data
    List<Mountain> mountains = new ArrayList<>();
    mountains.add(new Mountain("Chimborazo", "Ecuador", 20549));
    mountains.add(new Mountain("Matterhorr", "Switzerland", 14692));
    mountains.add(new Mountain("Olympus", "Greece (Macedonia)", 9573));
    mountains.add(new Mountain("Everest", "Nepal", 29029));
    mountains.add(new Mountain("Mount Marcy - Adirondacks", "United States", 5344));
    mountains.add(new Mountain("Mount Mitchell - Blue Ridge", "United States", 6684));
    mountains.add(new Mountain("Zugspitze", "Switzerland", 9719));

    // This block of code is used for iteration and printing statements
    for (Mountain mountain : mountains) {
        double elevationMeters = mountain.toMeters();
        System.out.println("Mountain: " + mountain.set_name());
        System.out.println("Country: " + mountain.set_country());
        System.out.println("Elevation (ft): " + mountain.set_elevation());
        System.out.println("Elevation (m): " + elevationMeters + "\n");
    }

    // Finding the smalles mountain
    Mountain smallestMountain = findMinElevation(mountains);
    System.out.println("Name of the shortest mountain: " + smallestMountain.set_name());
    System.out.println("Elevation: " + smallestMountain.set_elevation() + " ft");


}
}
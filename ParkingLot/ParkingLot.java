package DesignPattern.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<ParkingFloor> parkingFloorsList;
    String name;

    public void ParkingLot(String name){
        this.name=name;
        parkingFloorsList=new ArrayList<>();
    }
    public void addFloor(String floorName) {
        parkingFloorsList.add(new ParkingFloor(floorName));
    }
    public void removeFloor(String name){
        parkingFloorsList.remove(name);
    }


}

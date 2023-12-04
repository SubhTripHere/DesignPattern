package DesignPattern.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloor{
    String name;
    Map<ParkingSlotType,ParkingSlot> parkingSlotMap;
    ParkingFloor(String name){
        this.name=name;
        parkingSlotMap=new HashMap<>();
    }
    public void addSpotOnFloor(){

    }

    private ParkingSlotType pickCorrectSlot(VehicleType vehicleCategory) {
        if(vehicleCategory.equals(VehicleType.TWO_WHEELER)) return ParkingSlotType.TWO_WHEELER;
        else if(vehicleCategory.equals(VehicleType.HATCH_BACK) || vehicleCategory.equals(VehicleType.SEDAN)) return ParkingSlotType.COMPACT;
        else if(vehicleCategory.equals(VehicleType.SUV)) return ParkingSlotType.SUV;
        else if(vehicleCategory.equals(VehicleType.LARGE_VEHICLE)) return ParkingSlotType.LARGE;

        return null;
    }
}

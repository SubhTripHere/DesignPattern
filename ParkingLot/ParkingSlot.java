package DesignPattern.ParkingLot;

public class ParkingSlot {
    ParkingSlotType parkingSlotType;
    boolean isAvailable;
    String name;
    Vehicle vehicle;

    ParkingSlot(String name,ParkingSlotType parkingSlotType){
        this.name=name;
        this.parkingSlotType=parkingSlotType;
        this.isAvailable=true;
    }

    public void bookSlot(Vehicle vehicle){
        this.vehicle=vehicle;
        isAvailable=false;
    }

    public void releaseSpot(Vehicle vehicle){
        this.vehicle=null;
        isAvailable=true;
    }
}

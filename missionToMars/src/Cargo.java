package com.company;

public class Cargo {
    private int cargoId;
    private String cargoName;
    private String cargoType;
    private double quantityAvailable;
    public Cargo(int cargoId,String cargoName,String cargoType, double quantityAvailable){
    this.cargoId=cargoId;
    this.cargoName = cargoName;
    this.cargoType = cargoType;
    this.quantityAvailable = quantityAvailable;


    }

    public void setCargoId(int cargoId) {
        this.cargoId = cargoId;
    }

    public int getCargoId(){
        return cargoId;
    }



    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }


    public String getCargoName(){
        return cargoName;
    }


    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }


    public String getCargoType(){
        return cargoType;
    }


    public void setQuantityAvailable(double quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public double getQuantityAvailable() {
        return quantityAvailable;
    }
}

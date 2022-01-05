package com.company;

public class Building {
    private int numbersOfFloors;
    private String address;
    private NameOfCompany nameOfCompany;
    private Color color;

    public Building(int numbersOfFloors, String address, NameOfCompany nameOfCompany, Color color) {
        this.address = address;
        this.nameOfCompany = nameOfCompany;
        this.color = color;
        this.numbersOfFloors = numbersOfFloors;
    }

    public int getNumbersOfFloors() {
        return numbersOfFloors;
    }

    public String getAddress() {
        return address;
    }

    public NameOfCompany getNameOfCompany() {
        return nameOfCompany;
    }

    public Color getColor() {
        return color;
    }
}

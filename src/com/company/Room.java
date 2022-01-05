package com.company;

public final class Room extends House {
    private int numbersOfMebel;
    private String ownerName;

    public Room(int numbersOfFloors, String address, NameOfCompany nameOfCompany, Color color,
                int houseNumber, int numbersOfWindow, int numbersOfMebel, String ownerName) {
        super(numbersOfFloors, address, nameOfCompany, color, houseNumber, numbersOfWindow);
        this.numbersOfMebel = numbersOfMebel;
        this.ownerName = ownerName;
    }

    public int getNumbersOfMebel() {
        return numbersOfMebel;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Number Of Mebel: " + numbersOfMebel + " Owner Name: " + ownerName);
    }
}

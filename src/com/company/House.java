package com.company;

public class House extends Building {
    private int houseNumber;
    private int numbersOfWindow;

    public House(int numbersOfFloors, String address, NameOfCompany nameOfCompany, Color color,
                 int houseNumber, int numbersOfWindow) {
        super(numbersOfFloors, address, nameOfCompany, color);
        this.houseNumber = houseNumber;
        this.numbersOfWindow = numbersOfWindow;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getNumbersOfWindow() {
        return numbersOfWindow;
    }

    public final void getInfo(int houseNumber, int numbersOfWindow) {
        System.out.println("House number: " + houseNumber + " Number Of Window: " + numbersOfWindow);
    }

    public void getInfo() {
        System.out.println("\nNumbers of Floors: " + numbersOfWindow + " Address: " + getAddress() +
                " Name of Company: " + getNameOfCompany().getNameOfCompany() + " Registration Number: " +
                getNameOfCompany().getRegistrationNumber() + " Color Of Building: " + getColor() +
                " House Number: " + getHouseNumber() + " Number of Window: " + getNumbersOfWindow());
    }
}

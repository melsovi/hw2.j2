package com.company;

public class Main {

    public static void main(String[] args) {
        NameOfCompany nameOfCompany = new NameOfCompany("Elite House", 012003);
        House objectA = new House(10, "Chyi, 13", nameOfCompany, Color.WHITE, 45,
                8);
        objectA.getInfo();
        objectA.getInfo(45, 8);
        Room objectB = new Room(2, "Ankara, 2", new NameOfCompany("Ihlas",
                1874), Color.BLACK, 4, 4, 18, "Islam");
        objectB.getInfo();
        objectB.getInfo(4, 4);
        Room objectC = new Room(1, "Auezova, 6", new NameOfCompany("AalamStroy",
                6484), Color.BLUE, 6, 8, 11, "Adilet");
        objectC.getInfo();
        objectC.getInfo(6, 8);
    }
}
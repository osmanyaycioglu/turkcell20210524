package com.training.turkcell.basic.inheritance2;


public class AnimalData {


    private final int type;

    public AnimalData(final int typeParam) {
        this.type = typeParam;
    }

    public void eat() {
        switch (this.type) {
            case 1:
                System.out.println("Bird eating.");
                break;
            case 2:
                System.out.println("Cat eating.");
                break;
            case 3:
                System.out.println("Dog eating.");
                break;
            default:
                System.out.println("Animal eating.");
                break;
        }
    }

    public void move() {
        switch (this.type) {
            case 1:
                System.out.println("Bird flying.");
                break;
            case 2:
                System.out.println("Cat 4 moving.");
                break;
            case 3:
                System.out.println("Dog 4 moving.");
                break;
            default:
                System.out.println("Animal moving.");
                break;
        }
    }

    public void talk() {
        switch (this.type) {
            case 1:
                System.out.println("Cik cik.");
                break;
            case 2:
                System.out.println("Miyav miyav.");
                break;
            case 3:
                System.out.println("Hav hav.");
                break;
            default:
                System.out.println("Animal talking.");
                break;
        }
    }

}

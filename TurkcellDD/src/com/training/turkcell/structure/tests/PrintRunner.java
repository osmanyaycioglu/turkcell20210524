package com.training.turkcell.structure.tests;


public class PrintRunner {

    public static void main(final String[] args) {
        PrintSystem printSystemLoc = new PrintSystem();
        Customer customerLoc = new Customer();
        customerLoc.setName("osman");
        customerLoc.setSurname("yay");
        customerLoc.setGender("erkek");
        printSystemLoc.print(customerLoc);

        Musteri musteriLoc = new Musteri();
        musteriLoc.setIsim("ali");
        musteriLoc.setSoyisim("veli");
        musteriLoc.setCinsiyet("erkek");
        musteriLoc.setDogum("1980");

        MusteriCutomerAdapter adapterLoc = new MusteriCutomerAdapter(musteriLoc);
        printSystemLoc.print(adapterLoc);

    }
}

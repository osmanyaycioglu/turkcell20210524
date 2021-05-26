package com.training.turkcell.structure.tests;

import com.training.turkcell.structure.tests.adapter.MusteriCutomerAdapter;
import com.training.turkcell.structure.tests.facade.CustomerProvisionFactory;
import com.training.turkcell.structure.tests.facade.ICustomerProvision;

public class PrintRunner {

    public static void main(final String[] args) {
        Customer customerLoc = new Customer();
        customerLoc.setName("osman");
        customerLoc.setSurname("yay");
        customerLoc.setGender("erkek");


        ICustomerProvision customerProvisionFacadeLoc = CustomerProvisionFactory.createCustomerProvision();
        customerProvisionFacadeLoc.createCustomer(customerLoc);
        Musteri musteriLoc = new Musteri();
        musteriLoc.setIsim("ali");
        musteriLoc.setSoyisim("veli");
        musteriLoc.setCinsiyet("erkek");
        musteriLoc.setDogum("1980");

        MusteriCutomerAdapter adapterLoc = new MusteriCutomerAdapter(musteriLoc);
        customerProvisionFacadeLoc.createCustomer(adapterLoc);

    }
}

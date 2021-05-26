package com.training.turkcell.structure.tests.facade;

import com.training.turkcell.structure.tests.Customer;
import com.training.turkcell.structure.tests.CustomerDAO;
import com.training.turkcell.structure.tests.CustomerProvisionWS;
import com.training.turkcell.structure.tests.IPrintSystem;
import com.training.turkcell.structure.tests.Lib1;
import com.training.turkcell.structure.tests.PrintSystemFactory;

public class CustomerProvisionFacade implements ICustomerProvision {

    CustomerProvisionWS provisionWSLoc = new CustomerProvisionWS();
    CustomerDAO         customerDAOLoc = new CustomerDAO();
    LocalLib1Proxy      lib1Loc        = new LocalLib1Proxy(new Lib1());

    @Override
    public void createCustomer(final Customer customerParam) {
        if (this.provisionWSLoc.add(customerParam)) {
            this.customerDAOLoc.add(customerParam);
            this.lib1Loc.doSomething();
        }
        IPrintSystem printSystemLoc = PrintSystemFactory.createPrintSystem();

        printSystemLoc.print(customerParam);

    }

}

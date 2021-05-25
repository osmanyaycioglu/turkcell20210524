
package com.training.turkcell.dp.creation.builder2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.training.turkcell.dp.creation.builder2.Customer.Phone.PhoneBuilder;

public class Customer {

    private final String      namne;
    private final String      surname;
    private final LocalDate   birthdate;
    private final List<Phone> phones;
    private final Address     address;

    private Customer(final String namne,
                     final String surname,
                     final LocalDate birthdate,
                     final List<Phone> phones,
                     final Address address) {

        this.namne = namne;
        this.surname = surname;
        this.birthdate = birthdate;
        this.phones = phones;
        this.address = address;
    }

    public String getNamne() {
        return this.namne;
    }

    public String getSurname() {
        return this.surname;
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    public List<Phone> getPhones() {
        return this.phones;
    }

    public Address getAddress() {
        return this.address;
    }


    public static CustomerBuilder getBuilder() {
        return new CustomerBuilder();
    }

    public static class Phone {

        private String name;
        private int    number;

        public Phone() {
        }

        public String getName() {
            return this.name;
        }

        public int getNumber() {
            return this.number;
        }

        public static PhoneBuilder getBuilder(final CustomerBuilder customerParam) {
            return new PhoneBuilder(customerParam);
        }

        public static class PhoneBuilder {

            private final Phone           phone = new Phone();
            private final CustomerBuilder customer;

            public PhoneBuilder(final CustomerBuilder customerParam) {
                super();
                this.customer = customerParam;
            }

            public String getName() {
                return this.phone.name;
            }

            public PhoneBuilder withPhoneName(final String nameParam) {
                this.phone.name = nameParam;
                return this;
            }

            public int getNumber() {
                return this.phone.number;
            }

            public PhoneBuilder withPhoneNumber(final int numberParam) {
                this.phone.number = numberParam;
                return this;
            }

            public CustomerBuilder add() {
                this.customer.addPhone(this.phone);
                return this.customer;
            }
        }
    }

    public static class Address {

        private String address;
        private String city;

        public String getAddress() {
            return this.address;
        }

        public String getCity() {
            return this.city;
        }

    }

    public static class CustomerBuilder {

        private String            name;
        private String            surname;
        private LocalDate         birthdate;
        private final List<Phone> phones = new ArrayList<>();
        private Address           address;

        private CustomerBuilder() {
        }

        public String getName() {
            return this.name;
        }

        public CustomerBuilder withName(final String namne) {
            this.name = namne;
            return this;

        }

        public String getSurname() {
            return this.surname;
        }

        public CustomerBuilder withSurname(final String surname) {
            this.surname = surname;
            return this;
        }

        public LocalDate getBirthdate() {
            return this.birthdate;
        }

        public CustomerBuilder withBirthdate(final LocalDate birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public List<Phone> getPhones() {
            return this.phones;
        }

        public PhoneBuilder withPhone() {
            return Phone.getBuilder(this);
        }

        public Phone withPhoneName(final String name) {
            return new Phone();
        }


        public Address getAddress() {
            return this.address;
        }

        public CustomerBuilder withAddress(final String addr) {
            if (this.address == null) {
                this.address = new Address();
            }
            this.address.address = addr;
            return this;

        }

        public CustomerBuilder withCity(final String city) {
            if (this.address == null) {
                this.address = new Address();
            }
            this.address.city = city;
            return this;

        }

        private void addPhone(final Phone phoneParam) {

        }

        public Customer build() {
            Customer customer = new Customer(this.name,
                                             this.surname,
                                             this.birthdate,
                                             this.phones,
                                             this.address);
            return customer;
        }


    }


}


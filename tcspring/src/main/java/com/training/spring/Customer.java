package com.training.spring;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Customer {

    @NotEmpty
    @Size(min = 3, max = 20)
    private String name;
    @NotEmpty
    @Size(min = 3, max = 20)
    private String surname;
    @NotEmpty
    @Size(min = 3, max = 3)
    private String gender;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(final String genderParam) {
        this.gender = genderParam;
    }


}

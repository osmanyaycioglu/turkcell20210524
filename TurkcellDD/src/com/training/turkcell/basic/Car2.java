package com.training.turkcell.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Car2 {

    private Integer       maxSpeed;
    private final Integer doorCount;
    private List<String>  strs = Collections.unmodifiableList(new ArrayList<>());
    private final SubCar  subCar;

    public Car2(final int doorCount) {
        this.doorCount = doorCount;
        this.subCar = new SubCar();
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(final Integer maxSpeedParam) {
        this.maxSpeed = maxSpeedParam;
    }

    public Integer getDoorCount() {
        return this.doorCount;
    }

    public List<String> getStrs() {
        return new ArrayList<>(this.strs);
    }

    public void setStrs(final List<String> strsParam) {
        this.strs = strsParam;
    }

    public SubCar getSubCar() {
        return this.subCar;
    }


}

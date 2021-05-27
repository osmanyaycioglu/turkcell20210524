package com.training.turkcell.basic.inheritance.trans;

import com.training.turkcell.basic.inheritance.yakit.Yakit;

public class Trans {

    private ETransType  type;
    private int         gear;
    private final Yakit yakit;


    public Trans(final Yakit yakitParam,
                 final ETransType type) {
        super();
        this.yakit = yakitParam;
        this.type = type;
    }

    public int changeGear() {
        this.gear++;
        switch (this.gear) {
            case 1:
                return this.getYakit().devirDegistir(1000);
            case 2:
                return this.getYakit().devirDegistir(2000);
            case 3:
                return this.getYakit().devirDegistir(4000);
            default:
                return this.getYakit().devirDegistir(4000);
        }
    }

    public ETransType getType() {
        return this.type;
    }

    public void setType(final ETransType typeParam) {
        this.type = typeParam;
    }

    public int getGear() {
        return this.gear;
    }

    public void setGear(final int gearParam) {
        this.gear = gearParam;
    }

    public Yakit getYakit() {
        return yakit;
    }


}

package com.training.turkcell.behavior.state;


public class StateRun {

    public static void main(final String[] args) {
        ICaseState caseStateLoc = new StateSession();
        caseStateLoc.print("osman");

        caseStateLoc.upper();
        caseStateLoc.print("osman");
        caseStateLoc.upper();
        caseStateLoc.print("osman");
        caseStateLoc.lower();
        caseStateLoc.print("osman");
        caseStateLoc.lower();
        caseStateLoc.print("osman");
        caseStateLoc.upper();
        caseStateLoc.print("osman");

    }
}

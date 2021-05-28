package com.training.turkcell.behavior.memento;


public class MementoRunnert {

    public static void main(final String[] args) {
        CareTaker careTakerLoc = new CareTaker();
        DocObj docObjLoc = new DocObj();
        docObjLoc.setDescription("my document");
        docObjLoc.setName("docname1");

        docObjLoc.setText("osman");
        careTakerLoc.addHistory(docObjLoc);

        docObjLoc.setText("osman yay");
        careTakerLoc.addHistory(docObjLoc);

        docObjLoc.setText("osman yaycı");
        careTakerLoc.addHistory(docObjLoc);

        docObjLoc.setText("osman yaycıp");
        careTakerLoc.addHistory(docObjLoc);

        docObjLoc = careTakerLoc.undo();
        System.out.println(docObjLoc.getText());

        docObjLoc.setText("osman yaycıoğlu");
        careTakerLoc.addHistory(docObjLoc);

        careTakerLoc.showHistory();
    }
}

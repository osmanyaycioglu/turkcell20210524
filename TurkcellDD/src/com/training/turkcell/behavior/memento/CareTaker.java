package com.training.turkcell.behavior.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private final List<DocMemento> history = new ArrayList<>();

    public void addHistory(final DocObj docObjParam) {
        this.history.add(new DocMemento(docObjParam));
    }

    public DocObj undo() {
        if (!this.history.isEmpty()) {
            this.history.remove(this.history.size() - 1);
            return this.history.get(this.history.size() - 1)
                               .getDocObj();
        }
        return null;
    }

    public DocObj history(final int index) {
        if ((index > -1) && (index < this.history.size())) {
            DocObj docObjLoc = this.history.get(index)
                                           .getDocObj();
            int sizeLoc = this.history.size();
            for (int iLoc = index; iLoc < sizeLoc; iLoc++) {
                this.history.remove(this.history.size() - 1);
            }
            return docObjLoc;
        }
        return null;
    }

    public void showHistory() {
        int index = 1;
        for (DocMemento docMementoLoc : this.history) {
            System.out.println(index
                               + "-"
                               + docMementoLoc.getDocObj()
                                              .getText());
            index++;
        }
    }

}

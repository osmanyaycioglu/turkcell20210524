package com.training.turkcell.behavior.memento;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HistoryManager {

    private final Map<String, CareTaker> historyMap = new ConcurrentHashMap<>();


    public void addHistory(final DocObj docObjParam) {
        CareTaker careTakerLoc = this.historyMap.get(docObjParam.getName());
        careTakerLoc.addHistory(docObjParam);
    }


}

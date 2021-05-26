package com.training.turkcell.structure.tests.flyweight;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {

    private final Map<String, MyObject>              objectMap     = new ConcurrentHashMap<>(120_000_000,
                                                                                             0.9F,
                                                                                             10_000);
    private final EnumMap<EObjectType, MyObjectType> objectTypeMap = new EnumMap<>(EObjectType.class);

    public void addObject(final MyObject objectParam,
                          final EObjectType typeParam) {
        MyObjectType myObjectTypeLoc = this.objectTypeMap.get(typeParam);
        if (myObjectTypeLoc == null) {
            // Get from DB
            this.objectTypeMap.put(typeParam,
                                   myObjectTypeLoc);
        }
        objectParam.setMyObjectType(myObjectTypeLoc);
        this.objectMap.put(objectParam.getName(),
                           objectParam);
    }

}

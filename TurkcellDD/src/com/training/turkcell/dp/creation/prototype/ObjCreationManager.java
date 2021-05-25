package com.training.turkcell.dp.creation.prototype;

import java.util.EnumMap;

public class ObjCreationManager {

    private final EnumMap<EObjectType, MyObject> prototypEnumMap = new EnumMap<>(EObjectType.class);

    //    public MyObject clone(final MyObject myObjectParam) {
    //        MyObject myObjectLoc = this.prototypEnumMap.get(myObjectParam.getObjType());
    //        if (myObjectLoc == null) {
    //            myObjectLoc = myObjectParam;
    //            this.prototypEnumMap.put(myObjectParam.getObjType(),
    //                           myObjectParam);
    //        }
    //        return myObjectLoc.cloneMe();
    //    }

    public MyObject clone(final EObjectType typeParam) {
        MyObject myObjectLoc = this.prototypEnumMap.get(typeParam);
        if (myObjectLoc == null) {
            MyObject objectLoc = new MyObject();
            // Initialize from DB
            objectLoc.setObjType(typeParam);
            myObjectLoc = objectLoc;
            this.prototypEnumMap.put(typeParam,
                                     objectLoc);
        }
        return myObjectLoc.cloneMe();
    }


}

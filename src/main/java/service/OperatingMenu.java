package service;

import service.array.ArraySearcherManager;
import service.pow.NumberGenericManager;
import service.stack.CustomStackManager;
import service.wrapper.AnyTypeWrapperManager;

public enum OperatingMenu {

    ARRAY("Find in array", ArraySearcherManager.class),
    WRAP("Wrap any type", AnyTypeWrapperManager.class),
    POW("Pow a number", NumberGenericManager.class),
    STACK("Play with stack", CustomStackManager.class);


    private final String name;
    private final Class<? extends RunStrategy> aClass;

    OperatingMenu(String name, Class<? extends RunStrategy> aClass) {
        this.name = name;
        this.aClass = aClass;
    }

    public String getName() {
        return name;
    }

    public Class<? extends RunStrategy> getAClass() {
        return aClass;
    }
}
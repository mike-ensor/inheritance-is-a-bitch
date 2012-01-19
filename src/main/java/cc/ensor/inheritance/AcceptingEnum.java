package cc.ensor.inheritance;

public enum AcceptingEnum {
    
    VALUE(MarkerInterface.class, "Marker");

    private Class<? extends CommonInterface<?>> clazz;
    private String name;

    private AcceptingEnum(Class<? extends CommonInterface<?>> clazz, String name) {
        this.clazz = clazz;
        this.name = name;
    }

    public Class<? extends CommonInterface<?>> getClazz() {
        return clazz;
    }

    public String getName() {
        return name;
    }
}

package cc.ensor.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyBaseClass<T> implements CommonInterface<T> {

    private static final Logger LOG = LoggerFactory.getLogger(MyBaseClass.class);

    private final T someObject;
    
    public MyBaseClass(T something) {
        someObject = something;
    }

    public T getSomeObject() {
        return someObject;
    }

    @Override
    public String getSomeValue() {
        LOG.debug("getSomeValue was run");
        return "Who Cares?";
    }

    @Override
    public String anotherMethod() {
        LOG.debug("Another Method was run");
        return "Dummy Method";
    }
}

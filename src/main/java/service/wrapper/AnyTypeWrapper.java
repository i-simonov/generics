package service.wrapper;


public class AnyTypeWrapper<T>{
    private T valueToWrap;

    public AnyTypeWrapper() {
    }

    public AnyTypeWrapper(T valueToWrap) {
        this.valueToWrap = valueToWrap;
    }

    public T get() {
        return valueToWrap;
    }

    public void set(T valueToWrap) throws IllegalArgumentException {

        if (valueToWrap==this){
            throw new IllegalArgumentException("You shouldn't do that.");
        }
        this.valueToWrap = valueToWrap;
    }

    @Override
    public String toString() {
        return valueToWrap.toString();
    }

    public boolean isNull(){
        return this.valueToWrap == null;
    }
}
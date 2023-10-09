package service.array;

import java.util.NoSuchElementException;

public class ArraySearcher<T> {

    T[] array;

    public ArraySearcher(T[] array) {
        this.array = array;
    }

    public T find(T value){

        for (T element: array
        ) {
            if (element.equals(value)){
                return element;
            }

        }
        throw new NoSuchElementException("Value not found");
    }


}
package service.wrapper;

import service.RunStrategy;

import java.io.IOException;
import java.util.Scanner;

public class AnyTypeWrapperManager implements RunStrategy {

    @Override
    public void run(Scanner scanner){

        System.out.println("Wrapping integer");
        AnyTypeWrapper<Integer> integerWrapper = new AnyTypeWrapper();
        System.out.printf("Is wrapper a null? %b \n", integerWrapper.isNull());

        integerWrapper.set(Integer.valueOf(5));
        System.out.printf("Now wrapper is: %s \n", integerWrapper);
        System.out.printf("And how about null now? %b \n", integerWrapper.isNull());

        System.out.println("Wrapping String");
        AnyTypeWrapper<String> stringWrapper = new AnyTypeWrapper("Hi! How are you?");
        System.out.printf("Is wrapper a null? %b \n", stringWrapper.isNull());
        System.out.println(stringWrapper);

        System.out.println("Wrapping self");
        AnyTypeWrapper<AnyTypeWrapper> anyTypeWrapper = new AnyTypeWrapper<>();

        try {
            anyTypeWrapper.set(anyTypeWrapper);

            System.out.println("That's strange... who are you?");
            System.out.println(anyTypeWrapper);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    };

}
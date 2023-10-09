package service.pow;

import service.RunStrategy;

import java.util.Scanner;

public class NumberGenericManager implements RunStrategy {

    @Override
    public void run(Scanner in){

        System.out.print("Input value to pow: ");
        double number = in.nextDouble();

        System.out.print("Input rate of pow: ");
        double rate = in.nextDouble();

        NumberGeneric numberGeneric = new NumberGeneric();
        System.out.printf("Pow of the input is: %f\n", numberGeneric.pow(number, rate));

    }
}
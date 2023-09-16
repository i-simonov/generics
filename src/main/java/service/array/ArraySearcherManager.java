package service.array;

import service.RunStrategy;

import java.io.IOException;
import java.util.Scanner;

public class ArraySearcherManager implements RunStrategy {

    @Override
    public void run(Scanner scanner){

        System.out.print("Enter the size of the array: ");
        Integer size = scanner.nextInt();

        Integer[] array = new Integer[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to find:");

        Integer value = scanner.nextInt();

        ArraySearcher<Integer> arraySearcher = new ArraySearcher<>(array);

        try {

            System.out.printf("Value %d found!\n",arraySearcher.find(value));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
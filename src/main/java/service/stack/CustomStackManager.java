package service.stack;

import service.RunStrategy;
import service.array.ArraySearcher;

import java.util.Scanner;

public class CustomStackManager implements RunStrategy {

    @Override
    public void run(Scanner scanner) {

        System.out.print("Enter the size of the stack: ");

        Integer size = scanner.nextInt();

        Integer[] array = new Integer[size];

        System.out.println("Enter the elements of the stack:");

        CustomStack<Integer> stack = new CustomStack<>();

        for (int i = 0; i < size; i++) {
            stack.add(scanner.nextInt());
        }

        System.out.printf("The size of your stack is: %d\n", stack.size());

        System.out.printf("Your stack is: %s\n", stack);

        System.out.print("Enter value to find:");

        Integer valueToFind = scanner.nextInt();

        try {

            System.out.printf("First appearance value %d found in %s\n", valueToFind, stack.find(valueToFind));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Enter value to delete:");

        Integer valueToDelete = scanner.nextInt();

        try {
            stack.del(valueToDelete);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("Your current stack is: %s\n",stack);

    }

}
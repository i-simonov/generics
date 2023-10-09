package service.pow;

import service.RunStrategy;

import java.util.Scanner;

public class NumberGeneric<T extends Number>{


    public Double pow(T number, double rate) {

        return Math.pow((double) number, rate);

    }
}
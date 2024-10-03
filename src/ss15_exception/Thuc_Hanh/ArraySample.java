package ss15_exception.Thuc_Hanh;

import java.util.Random;
import java.util.Scanner;

public class ArraySample {
    public static void main(String[] args) {
        ArraySample arraySample = new ArraySample();
        Integer[] arr = arraySample.createRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index: ");
        int i = Integer.parseInt(sc.nextLine());
        try {
            System.out.println("Value at " + i + ": " + arr[i]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index Out Of Bounds Of Array");
        }

    }

    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = rd.nextInt(100);
        }
        return arr;
    }
}

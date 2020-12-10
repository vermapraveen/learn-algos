package com.pkv.learn.ds;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // int sizeOfArr = 10;
        // int initWith = -1;

        // App sut = new App();
        // int[] arr = sut.createAndInit(sizeOfArr, initWith);

        // int[] updatedArr = sut.addAtIndex(arr, 5, 2);
    }

    public int[] createAndInit(int size, int initWith) {
        int[] anArr = new int[size];

        for (int i = 0; i < size; i++) {
            anArr[i] = initWith;
        }

        return anArr;
    }

    public int[] addAtIndex(int[] arr, int elToAdd, int index) {
        int[] newArr = new int[arr.length + 1];

        for (int newArrCounter = 0, originalArrCounter = 0; newArrCounter < newArr.length; newArrCounter++) {
            if (newArrCounter == index) {
                newArr[newArrCounter] = elToAdd;
            } else {
                newArr[newArrCounter] = arr[originalArrCounter];
                originalArrCounter++;
            }
        }

        return newArr;
    }

    public int[] reverse(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[newArr.length - i - 1];
        }

        return newArr;
    }
}

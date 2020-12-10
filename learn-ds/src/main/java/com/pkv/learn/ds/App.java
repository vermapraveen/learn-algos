package com.pkv.learn.ds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public int[] createAndInit(int size, int initWith) {
        int[] anArr = new int[size];

        for (int i = 0; i < size; i++) {
            anArr[i] = initWith;
        }

        return anArr;
    }
}

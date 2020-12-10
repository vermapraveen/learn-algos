package com.pkv.learn.ds;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ArrayTests {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAbleToCreateArrayWithLenghth5() {
        int sizeOfArr = 5;
        int initWith = -2;

        int[] arr = new App().createAndInit(sizeOfArr, initWith);

        assertThat(arr.length).isEqualTo(sizeOfArr);
        for (int i = 0; i < sizeOfArr; i++) {

            assertThat(arr[i]).isEqualTo(initWith);
        }
    }

    @Test
    public void shouldAbleToCreateArrayWithLenghth10() {
        int sizeOfArr = 10;
        int initWith = -1;

        int[] arr = new App().createAndInit(sizeOfArr, initWith);

        assertThat(arr.length).isEqualTo(sizeOfArr);
        for (int i = 0; i < sizeOfArr; i++) {

            assertThat(arr[i]).isEqualTo(initWith);
        }
    }

    @Test
    public void givenArrayOfLength10_shouldAbleToAdd5AtIndex2() {
        int sizeOfArr = 10;
        int initWith = -1;

        App sut = new App();
        int[] arr = sut.createAndInit(sizeOfArr, initWith);

        int[] updatedArr = sut.addAtIndex(arr, 5, 2);
        assertThat(updatedArr.length).isEqualTo(sizeOfArr + 1);

        assertThat(updatedArr[2]).isEqualTo(5);
    }

    @Test
    public void givenArrayOf10Elements_ShouldAbleToReverse() {

        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        App sut = new App();
        int[] arr_rev = sut.reverse(arr);

        assertThat(arr_rev.length).isEqualTo(10);
        for (int i = 0; i < arr_rev.length; i++) {
            assertThat(arr_rev[i]).isEqualTo(arr[arr.length - i - 1]);
        }

    }
}

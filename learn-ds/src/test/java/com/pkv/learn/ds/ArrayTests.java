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
}

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
        assertThat("The Lord of the Rings").isNotNull()   
                                       .startsWith("The") 
                                       .contains("Lord") 
                                       .endsWith("Rings"); 
    }

    @Test
    public void shouldAbleToCreateArrayWithLenghth10() {
        assertThat(new App().someMethod()).isEqualTo(10);
    }
}

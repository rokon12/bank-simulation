package com.bazlur.unittesting;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author Bazlur Rahman Rokon
 * @since 7/26/16.
 */
public class ScoreCollectionTest {
    @org.junit.Test
    public void testAdd() throws Exception {

    }

    @org.junit.Test
    public void testArithmeticMean() throws Exception {
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        int actualResult = collection.arithmeticMean();
        assertThat(actualResult, equalTo(6));
    }

}
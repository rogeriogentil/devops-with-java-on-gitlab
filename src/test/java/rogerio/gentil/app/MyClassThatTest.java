package rogerio.gentil.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyClassThatTest {

    private MyClassUnderTest myClassUnderTest;

    @Before
    public void setUp() {
        myClassUnderTest = new MyClassUnderTest();
    }

    @Test
    public void shouldReturnTrueWhenNumberIsEven() {
        final boolean even = myClassUnderTest.isEven(2);
        assertTrue(even);
    }

    @Test
    public void shouldReturnFalseWhenNumberIsNotEven() {
        final boolean even = myClassUnderTest.isEven(1);
        assertFalse(even);
    }
}

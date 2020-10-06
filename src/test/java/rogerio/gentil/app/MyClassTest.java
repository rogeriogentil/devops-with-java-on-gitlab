package rogerio.gentil.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyClassTest {

    private MyClass myClass;

    @Before
    public void setUp() {
        myClass = new MyClass();
    }

    @Test
    public void shouldReturnTrueWhenNumberIsEven() {
        final boolean even = myClass.isEven(2);
        assertTrue(even);
    }

    @Test
    public void shouldReturnFalseWhenNumberIsNotEven() {
        final boolean even = myClass.isEven(1);
        assertFalse(even);
    }
}

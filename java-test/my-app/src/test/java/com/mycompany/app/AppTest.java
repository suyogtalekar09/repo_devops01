package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testAddWithZero() {
        App app = new App();
        assertEquals(5, app.add(5, 0));
    }

    @Test
    public void testSubtract() {
        App app = new App();
        assertEquals(2, app.subtract(5, 3));
    }

    @Test
    public void testSubtractNegative() {
        App app = new App();
        assertEquals(-1, app.subtract(2, 3));
    }
}

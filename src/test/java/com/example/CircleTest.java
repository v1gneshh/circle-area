package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    void areaOfRadiusZero() {
        assertEquals(0.0, Circle.area(0), 0.0001);
    }

    @Test
    void areaOfRadiusOne() {
        assertEquals(Math.PI, Circle.area(1), 0.0001);
    }

    @Test
    void areaOfRadiusFive() {
        assertEquals(78.5398, Circle.area(5), 0.001);
    }

    @Test
    void negativeRadiusThrowsError() {
        assertThrows(IllegalArgumentException.class, () -> Circle.area(-3));
    }
}
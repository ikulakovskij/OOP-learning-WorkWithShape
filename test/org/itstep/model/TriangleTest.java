package org.itstep.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void getArea() {

        Triangle triangle = new Triangle();
        triangle.setBase(10);
        triangle.setHeigth(16);
<<<<<<< HEAD
        Assertions.assertEquals(80,triangle.getArea());
=======
        Assertions.assertEquals(80, triangle.getArea());

>>>>>>> 34ccca6a14bf585b5be44ff696bf926caeba842f
    }
}
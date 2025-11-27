package ru.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BoxTest {
    @Test
    void whenVertex0ThenSphere() {
        Box box = new Box(0, 1);
        String result = box.whatsThis();
        assertThat(result).isNotNull()
                .isNotEmpty()
                .isEqualTo("Sphere");
    }

    @Test
    void whenVertex4ThenTetrahedron() {
        Box box = new Box(4, 1);
        String result = box.whatsThis();
        assertThat(result).isNotNull()
                .isNotEmpty()
                .isEqualTo("Tetrahedron");
    }

    @Test
    void whenVertex8ThenCube() {
        Box box = new Box(8, 1);
        String result = box.whatsThis();
        assertThat(result).isNotNull()
                .isNotEmpty()
                .isEqualTo("Cube");
    }

    @Test
    void whenVertexInvalidThenUnknown() {
        Box box = new Box(1, 1);
        String result = box.whatsThis();
        assertThat(result).isEqualTo("Unknown object");
    }

    @Test
    void whenValidVertexThenReturnVertex() {
        Box box = new Box(4, 2);
        int result = box.getNumberOfVertices();
        assertThat(result).isNotZero()
                .isPositive()
                .isEven()
                .isEqualTo(4);
    }

    @Test
    void whenInvalidVertexThenReturnMinusOne() {
        Box box = new Box(1, 1);
        int result = box.getNumberOfVertices();
        assertThat(result).isNotZero()
                .isNegative()
                .isOdd()
                .isEqualTo(-1);
    }

    @Test
    void whenEdgeZeroOrNegativeThenReturnMinusOne() {
        Box box = new Box(0, 0);
        int result = box.getNumberOfVertices();
        assertThat(result).isNotZero()
                .isNegative()
                .isOdd()
                .isEqualTo(-1);
    }

    @Test
    void whenValidBoxThenTrue() {
        Box box = new Box(0, 1);
        boolean result = box.isExist();
        assertThat(result).isTrue();
    }

    @Test
    void whenInvalidVertexThenFalse() {
        Box box = new Box(1, 1);
        boolean result = box.isExist();
        assertThat(result).isFalse();
    }

    @Test
    void whenInvalidEdgeThenFalse() {
        Box box = new Box(1, 0);
        boolean result = box.isExist();
        assertThat(result).isFalse();
    }

    @Test
    void whenSphereThenCalculateArea() {
        Box box = new Box(0, 1);
        double result = box.getArea();
        assertThat(result).isPositive()
                .isGreaterThan(12.0d)
                .isLessThan(13.0d)
                .isEqualTo(12.56d, withPrecision(0.01d));
    }

    @Test
    void whenTetrahedronThenCalculateArea() {
        Box box = new Box(4, 1);
        double result = box.getArea();
        assertThat(result).isPositive()
                .isGreaterThan(1.3d)
                .isLessThan(2.3d)
                .isEqualTo(1.73d, withPrecision(0.01d));
    }

    @Test
    void whenCubeThenCalculateArea() {
        Box box = new Box(8, 2);
        double result = box.getArea();
        assertThat(result).isPositive()
                .isGreaterThan(23.3d)
                .isLessThan(25.3d)
                .isEqualTo(24.0d, withPrecision(0.1d));
    }

    @Test
    void whenInvalidThenZero() {
        Box box = new Box(1, 1);
        double result = box.getArea();
        assertThat(result).isZero()
                .isEqualTo(0);
    }
}
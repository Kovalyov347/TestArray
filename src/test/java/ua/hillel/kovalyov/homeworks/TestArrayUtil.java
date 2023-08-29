package ua.hillel.kovalyov.homeworks;


import org.junit.jupiter.api.*;
import ua.hillel.kovalyov.homeworks.ArrayUtil;

import static org.junit.jupiter.api.Assertions.*;

public class TestArrayUtil {

    static int[] array;

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
        array = new int[]{1, 2, 3, 4, 5};
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach ");
    }

    @Test
    void testMethod1() {
        System.out.println("testMethod1");
//        int indexElement = ArrayUtil.getIndexElement(array, 2);
//        Assertions.assertEquals(1, indexElement);
        assertEquals(1, ArrayUtil.getIndexElement(array, 2));
    }

    @Test
    void testMethod2() {
        System.out.println("testMethod2");
        int[] array = {};
        assertEquals(-2, ArrayUtil.getIndexElement(array, 2));
    }

    @Test
    @Disabled("it will be fix soon")
    void testMethod3() {
        assertEquals(-1, ArrayUtil.getIndexElement(null, 2));
    }


    @Test
    void testMethod4() {
        System.out.println("testMethod4");
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(-1, ArrayUtil.getIndexElement(array, 11));
    }

    @Test
    public void testMethod5() {
        System.out.println("testMethod5");
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3, ArrayUtil.calculateAverage(array), 1e-10);
    }

    @Test
    public void testMethod6() {
        System.out.println("testMethod6");
        int[][] array = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        assertFalse(ArrayUtil.isSquareMatrix(array));
    }

    @Test
    public void testMethod7() {
        System.out.println("testMethod7");
        int[][] array = {{1, 2, 3 }, {1, 2, 3}, {1, 2, 3}};
        assertTrue(ArrayUtil.isSquareMatrix(array));
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach ");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
        array = null;
    }
}

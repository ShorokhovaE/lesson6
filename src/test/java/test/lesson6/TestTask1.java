package test.lesson6;

import lesson6.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class TestTask1 {

    Task1 test;

    @BeforeEach
    public void init(){
        test = new Task1();
    }

    @Test
    public void testPullFromArray1(){
        Assertions.assertEquals(Arrays.toString(new int[] {5,6}),
                Arrays.toString(test.pullFromArray(new int[] {1,2,3,4,5,6})));
    }

    @Test
    public void testPullFromArray2(){
        Assertions.assertEquals(Arrays.toString(new int[] {1,7,5,3,2}),
                Arrays.toString(test.pullFromArray(new int[] {1,2,4,1,7,5,3,2})));
    }

    @Test
    public void testPullFromArray3(){
        Assertions.assertThrows(RuntimeException.class, ()-> test.pullFromArray(new int[] {1,2,5,6}));
    }

    @Test
    public void testPullFromArray4(){
        Assertions.assertEquals(Arrays.toString(new int[] {}),
                Arrays.toString(test.pullFromArray(new int[] {1,2,4})));
    }



}

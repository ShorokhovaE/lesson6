package test.lesson6;

import lesson6.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestTask2 {

    Task2 test;

    @BeforeEach
    public void init(){
        test = new Task2();
    }


    @ParameterizedTest
    @MethodSource("dataForCheckArray")
    public void massTestCheckArray(boolean a, int[] b){
        Assertions.assertEquals(a,test.checkArray(b));
    }


    public static Stream<Arguments> dataForCheckArray(){
        List<Arguments> list = new ArrayList<>();

        list.add(Arguments.arguments(true,
                new int[] {1,1,1,4,4,4,1,4,1,4}));

        list.add(Arguments.arguments(false,
                new int[] {1,1,1,1,1,1,1,1}));

        list.add(Arguments.arguments(false,
                new int[] {4,4,4,4,4}));

        list.add(Arguments.arguments(false,
                new int[] {1,4,4,1,3,1,4,1,1,4}));

        list.add(Arguments.arguments(false,
                new int[] {11,44,14,11,41}));

        return list.stream();

    }


}

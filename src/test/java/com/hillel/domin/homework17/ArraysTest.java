package com.hillel.domin.homework17;

import com.hillel.domin.homeworks.homework17.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysTest {


    @Test
    public void test1(){
        Assertions.assertTrue(Main.getAveregeArray(new int[]{1,2,3,4}) != 0);

    }

    @Test
    public void test2(){
        Assertions.assertFalse(Main.compareArrays(1,2));
    }

    @Test
    public void test3(){
        Assertions.assertTrue(Main.compareArrays(2,2));
    }






}

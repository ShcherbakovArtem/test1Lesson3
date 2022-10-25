package com.demoqa;

import org.junit.jupiter.api.*;

public class JUnitDemoTest {

    @BeforeAll
    static void setUp(){
        System.out.println("### @Beforall");
    }
    @AfterAll
    static void clearnDb(){
        System.out.println("### DB is Clean");
    }
    @BeforeEach
    void BeforEachTest(){
        System.out.println("###     open Sbermarket");
    }
    @AfterEach
    void AfterEachTest(){
        System.out.println("###     close Sbermarket");
    }

    @Test
    void SimpleTestFirst() {
        System.out.println("###         @Test SimpleTestFirst");
        Assertions.assertTrue(3>2);
    }
    @Test
    void SimpleTestSecound() {
        System.out.println("###         @Test SimpleTestSecound");
        Assertions.assertTrue(3>2);
    }

}

package com.tws.refactoring;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PoliceTest {
    @Test
    //given
    public void should_return_treu_when_input_is_18(){
    Driver driver=new Driver(20);
    //int age =driver.getAge();
    //when
    Police police=new Police();
    boolean c=police.checkDriver(driver);
    //then
    assertEquals("true",c);
    }
}

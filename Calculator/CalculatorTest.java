package com.softwaretesting.verfificaevalidazione;

import org.junit.*;

import com.softwaretesting.verfificaevalidazione.Calculator;

import static org.junit.Assert.*;

import java.io.File;




//Arrange-Act-Assert pattern

public class CalculatorTest {
    
private Calculator objCalcUnderTest, objCalcUnderTest2;

public CalculatorTest(){}


@Before
public void setUp() {
//Arrange
objCalcUnderTest = new Calculator();
objCalcUnderTest2 = new Calculator();
}

@Test
public void testAssertionRoultette() {
    int a = 15; int b = 20;
    int expectedResultAdd = 35;
    int expectedResultSub = 5;
    //Act
    long resultAdd = objCalcUnderTest.add(a, b);
    long resultSub = objCalcUnderTest.subtract(b, a);
    //Assert
    assertEquals(expectedResultAdd, resultAdd);
    assertEquals(expectedResultSub, resultSub);
}

@Test
public void testRedundantAssertion() {

    int a = 15; int b = 20;
    long result = objCalcUnderTest.add(a, b);
    //Assert
    assertEquals(result, result);
}

@Test
public void testMagicNumberTest() {
int a = 56; int b = 10; 
double expectedResult = 5.6; 
double result = objCalcUnderTest2.divide(a, b);
assertEquals(expectedResult, result,0.00005); 
}

@Test
public void testConditionalTestLogic() {
    int a = 25; int b = 20;
    int expectedResult = 5;
    if(a > b)
    {
    long result = objCalcUnderTest.subtract(a, b);
    assertEquals(expectedResult, result);
}
}


//TODO: Default test

@Test
public void testDuplicateAssert() {
    int a = 15; int b = 20;
    int expectedResult = 35;
    //Act
    long result = objCalcUnderTest.add(a, b);
    //Assert
    assertEquals("Duplicate one", expectedResult, result);

    a = 20; b = 20;
    expectedResult = 40;
    result = objCalcUnderTest.add(a, b);
    assertEquals("Duplicate two", expectedResult, result);
 
 
}

@Test
public void testEagerTest() {
    int a = 7; int b = 5;
    int expectedResult = 24;
    //Act
    int resultAdd = objCalcUnderTest.add(a, b);
    int resultSub = objCalcUnderTest.subtract(a, b);
    long resultMul = objCalcUnderTest.multiply(resultAdd, resultSub);
    //Assert
    assertEquals(expectedResult, resultMul);
 
}

@Test
public void testEmptyTest() {

    //commented out statements
 
}

@Test
public void testExceptionHandling(){
    int a = 10; int b = 5;
    double expectedResult = 2; double result, delta = 0.005;
    try{
        result = objCalcUnderTest.divide(a, b);
        assertEquals("Exception handling", expectedResult, result, delta);
    }
    catch(Exception e){
        fail("fail exception handling");
    }
}

@Ignore
@Test
public void testIgnoredTest() {
    int a = 7; int b = 5;
    int expectedResult = 12;
    //Act
    int resultAdd = objCalcUnderTest.add(a, b);
    //Assert
    assertEquals(expectedResult, resultAdd);
 
}



//TODO: da capire lazy test

@Test
public void testMysteryGuest() {
    File file_open=new File(".\\NewTextFile.txt");
    boolean fileExists = file_open.exists();   
    assertFalse(fileExists);
}

public void testRedundantPrint() {
    int a = 7; int b = 5;
    int expectedResult = 12;
    //Act
    int resultAdd = objCalcUnderTest.add(a, b);
    //Assert
    System.out.print("Redundant print");
    assertEquals(expectedResult, resultAdd);
 
}

@Test
public void testSensitiveEquality() {
    String obj1 = objCalcUnderTest.toString(), obj2 = objCalcUnderTest2.toString();
    assertNotEquals(obj1, obj2);
}


@Test
public void testResourceOptimism() {
    File file_open=new File(".\\NewTextFile.txt");
    assertNotNull(file_open);
}

@Test
public void testSleepyTest() throws InterruptedException{
    int a = 7; int b = 5;
    int expectedResult = 12;
    //Act
    int resultAdd = objCalcUnderTest.add(a, b);
    Thread.sleep(10);
    //Assert
    assertEquals(expectedResult, resultAdd);
 
}

@Test
public void testUnknownTest() {
    int a = 7; int b = 5;
    int expectedResult = 12;
    //Act
    int resultAdd = objCalcUnderTest.add(a, b);
    //Assert;
 
}

@Test
public void testMultiply() {
int a = 10; int b = 25;
long expectedResult = 250;
long result = objCalcUnderTest.multiply(a, b);
assertEquals(expectedResult, result);
}

/* 
@Test(expected = IllegalArgumentException.class)
public void testDivideByZero() { 
int a = 15; int b = 0;
objCalcUnderTest.divide(a, b);
} 
*/
}

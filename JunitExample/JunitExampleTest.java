package com.dariotintore.tesi;

import org.junit.*;
import static org.junit.Assert.*;

public class JunitExampleTest {

    JunitExample obj = new JunitExample();

    public JunitExampleTest() {} 

    @Test
    public void testAdd() {
        obj.add("Emma");
        int n=1;
        assertEquals(n, obj.sizeOfStudent());
    }

    @Test
    public void testSize() {
        obj.add("Emma");
        obj.add("Ronan");
        obj.add("Antonio");
        int n=3;
        assertEquals(n, obj.sizeOfStudent());
    }

    @Test
    public void testRemove() {
        obj.add("Antonio");
        obj.add("Paul");
        obj.remove("Paul");
        int n=1;
        assertEquals(n, obj.sizeOfStudent());
    }

    @Test
    public void removeAll() {
        obj.removeAll();
        int n=0;
        assertEquals(n,obj.sizeOfStudent())
    }

    @Test
    public void testAssertionRoulette(){
        obj.add("Emma");
        int n1=1;
	  	int n2=2;
        assertEquals(n1, obj.sizeOfStudent());
        obj.add("Emma2");
        assertEquals(n2, obj.sizeOfStudent());
    }

    @Test
    public void testCondTestLogic(){
        obj.add("Emma");
        int n1=1;
        if(obj.sizeOfStudent() == n1){
	  	    int n2=2;
            assertEquals(n1, obj.sizeOfStudent());
            obj.add("Emma2");
            if(obj.sizeOfStudent() == n2){
            assertEquals(n2, obj.sizeOfStudent());}}
    }

    @Test
    public void testDuplicateAssert(){
        obj.add("prova");
        int n1=1;
        assertEquals(n1, obj.sizeOfStudent());
        assertEquals(n1, obj.sizeOfStudent());
    }
    @Test

    @Test

    @Test

    @Test

    @Test

    @Test

    @Test

    @Test

    @Test

    @Test

    @Test

    @Test

    @Test

    @Test

    @Test

    @Test

    @Test

    @Test

}  

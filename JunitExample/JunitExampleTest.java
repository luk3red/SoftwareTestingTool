package com.dariotintore.tesi;

import org.junit.*;
import java.io.File;
import static org.junit.Assert.*;

public class JunitExampleTest {
    JunitExample obj;
	
    @Before		
    public void setUp(){
    obj = new JunitExample();
    }
    

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
        assertEquals(n,obj.sizeOfStudent());
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
    public void testEagerTest(){
        obj.add("Emma");
        obj.remove("Emma");
        int n=0;
        assertEquals(n,obj.sizeOfStudent());
        } //non riconosciuto

    @Test
    public void testEmptyTest(){
        
        } 

    @Test
    public void testExceptionHandling(){
        try {
        obj.removeAll();
    	} catch (Exception e) {
        Assert.fail(e.getMessage());
    }
	    
    } //non riconosciuto

   @Test
   public void testGeneralFixture(){
	   
   }

   @Ignore("questo test è ignorato per testare il tool di test smells")
   @Test
   public void testIgnoreTest() {
        obj.add("Emma");
        int n=1;
        assertEquals(n, obj.sizeOfStudent());
    }

   @Test
   public void testMagicNumberTest() {
        obj.add("Emma");
        assertEquals(1, obj.sizeOfStudent());
    }

   @Test
   public void testMysteryGuest() {
        File tempFile = new File(".\\NewTextFile.txt");
        boolean fileExists = tempFile.exists();   
    	assertFalse(fileExists);
    }
	
}  


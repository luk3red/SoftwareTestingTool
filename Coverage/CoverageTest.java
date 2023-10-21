package com.dariotintore.tesi;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

public class CoverageTest {
     Coverage<String> obj;
    
     @Before		
     public void setUp(){
     obj = new Coverage<>();
     }
    
    @Test
    public void emptyTest(){

    //assertTrue(obj.readAll() instanceof List<String>);
    
    }
    
    @Ignore("test ignorato, che aumenta coverage")
    @Test
    public void ignoredTest(){
    assertTrue(obj.create("nuovoItem"));
    }
    
    @Test
    public void unknownTest(){
    int n1=0;
    //assertEquals("test sulla size",n1,obj.size());
    }
    
    @Test
    public void eagerTest(){
    assertFalse("p", obj.delete(0));
    assertTrue("s", obj.isEmpty()); 
    }
    
    
    }

package com.tathastusoftware.gitdemo;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
    }
    
    public static void addMethodToTest()
    {
        System.out.println( "Call addMethodToTest() " );
        
    }
    
    public static void addMethodToTest1()
    {
        System.out.println( "Call addMethodToTest1() " );
        
        Employee e = new Employee();
        
        e.setEmpId(101);
        e.setEmpName("Sanket Khandre");
        
      //  System.out.println( "Print  e :: "+e);
        
    }
}

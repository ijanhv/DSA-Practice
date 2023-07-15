package com.janhavi.Practice;


/*package whatever //do not write package name here */

import java.util.ArrayList;

public class Base
{
    public void getDetails(String temp)
    {
        System.out.println("Derived class " + temp);
        ArrayList<Integer> arr = new ArrayList<>();
    }


}

class Test extends Base  {
    public void getDetails(String temp)
    {
        System.out.println("Test class " + temp);
    }
    public static void main(String[] args)
    {
        Test obj = new Test();
        obj.getDetails("GFG");
    }
}
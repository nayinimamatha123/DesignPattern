package com.abc.CreationalPattern;

import com.phone.Android;
import com.phone.OS;
import com.phone.OperatingSystemFactory;
import com.phone.Windows;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	OperatingSystemFactory osf=new OperatingSystemFactory();
        OS obj=osf.getInstance("closed");
        obj.spec();
    }
}

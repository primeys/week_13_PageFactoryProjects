package com_Quickfit.loadproperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {

    // both inbuilt java class
    static FileInputStream fileInputStream; // Object created
    static Properties properties;//object created

    //reusable method for to get property from config.properties file
    public String getProperty(String key)
    {
        properties = new Properties();
        try {
            fileInputStream = new FileInputStream("src\\test\\Resources\\config.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }












}

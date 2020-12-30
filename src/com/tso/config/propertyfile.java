package com.tso.config;

import java.io.FileInputStream;
import java.util.Properties;

public class propertyfile 
{
	public String fetch(String key) throws Exception
	{	
	Properties p=new Properties();
	p.load(new FileInputStream("./src/com/tso/config/data.properties"));
	String s=p.getProperty(key);
	return s;
	}
}

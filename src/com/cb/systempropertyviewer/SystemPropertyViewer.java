package com.cb.systempropertyviewer;

import java.util.Enumeration;
import java.util.Properties;

public class SystemPropertyViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prontProp();
		
	}

	private static void prontProp() {
		Properties p = System.getProperties();
		Enumeration<Object> e = p.keys();
		while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			System.out.println(String.format("%s=%s", key, p.getProperty(key)));
		}
	}

}

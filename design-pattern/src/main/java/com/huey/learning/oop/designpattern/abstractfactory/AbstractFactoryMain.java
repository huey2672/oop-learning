package com.huey.learning.oop.designpattern.abstractfactory;

import com.huey.learning.oop.designpattern.abstractfactory.factory.PhoneFactory;
import com.huey.learning.oop.designpattern.abstractfactory.factory.impl.AppleFactory;
import com.huey.learning.oop.designpattern.abstractfactory.factory.impl.XiaomiFactory;
import com.huey.learning.oop.designpattern.abstractfactory.product.Color;
import com.huey.learning.oop.designpattern.abstractfactory.product.Earphones;
import com.huey.learning.oop.designpattern.abstractfactory.product.Phone;

/**
 * a case of factory method pattern
 *
 * @author huey
 */
public class AbstractFactoryMain {
	
	public static void main(String[] args) {
		
		// checks the arguments the parses them(factory's type, version and color)
		if (args == null || args.length < 3) {
			throw new IllegalArgumentException("Failed to parse the arguments.");
		}
		String factoryType = args[0];
		String version = args[1];
		Color color = Color.get(args[2]);
		
		// creates the phone factory by type
		PhoneFactory phoneFactory;
		if ("Apple".equalsIgnoreCase(factoryType)) {
			phoneFactory = new AppleFactory();
		} else if ("Xiaomi".equalsIgnoreCase(factoryType)) {
			phoneFactory = new XiaomiFactory();
		} else {
			throw new IllegalArgumentException("Unknown Phone Factory.");
		}
		
		// creates phone by phone factory
		Phone phone = phoneFactory.createPhone(version, color);
		// creates earphones by phone factory
		Earphones earphones = phoneFactory.createEarphones(color);
		// assembles the phone with earphones
		phoneFactory.assemblePhone(phone, earphones);
		
		// displays the phone information
		phone.display();

	}
	
}

package org.spring.course.cars;

import org.spring.course.interfaces.Car;
import org.springframework.stereotype.Component;

@Component("corolla")
public class Corolla implements Car {

	public String getSpec() {
		return "Sedan by Toyota";
	}

}

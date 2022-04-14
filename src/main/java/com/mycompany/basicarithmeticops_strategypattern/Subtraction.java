package com.mycompany.basicarithmeticops_strategypattern;

public class Subtraction  implements Strategy{

	@Override
	public float calculation(float a, float b) {
		return a-b;
	}

}

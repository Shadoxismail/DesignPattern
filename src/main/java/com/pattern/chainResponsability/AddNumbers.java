package com.pattern.chainResponsability;

import com.pattern.chainResponsability.entities.Numbers;

public class AddNumbers implements Chain{
	
	private Chain nextInChain;

	@Override
	public void setNetChain(Chain nextChain) {
	  this.nextInChain=nextChain;
		
	}

	@Override
	public void calculate(Numbers request) {
		if(request.getCalculationWanted()=="add") {
			System.out.println(request.getNumber1()+"+"+request.getNumber2()+"="+Math.addExact(request.getNumber1(), request.getNumber2()));
		}else {
			nextInChain.calculate(request);
		}
		
	}

}

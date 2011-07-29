/*
 * Copyright (c) 2011 Ayan Dave http://www.linkedin.com/in/daveayan
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and 
 * associated documentation files (the "Software"), to deal in the Software without restriction, including 
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
 * copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the 
 * following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial 
 * portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING 
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE 
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package testrj.sample.controller;

import java.math.BigDecimal;

import testrj.sample.domain.Account;
import testrj.sample.domain.Person;

public class SomeComplexController {

	private BigDecimal interestRate = BigDecimal.valueOf(5.34332);

	public Person someComplexMethod(Person p, Account a) {
		System.out.println("IN CONTROLLER");
		p.addAccount(a);
		a.setBalance(500);
		interestRate = interestRate.add(BigDecimal.valueOf(2.44));
		return p;
	}

	public Integer add(Integer a, Integer b) {
		return a + b;
	}

	public Integer add(Integer a, Integer b, Integer c) {
		return a + b + c;
	}

	public Float add(Integer a, Account b) {
		return a + b.getBalance();
	}

	public void save(Person p) {
	}

	public boolean getMessage() {
		return true;
	}

	public boolean getMessage(String name) {
		if (name.trim().equalsIgnoreCase("Ayan"))
			return true;
		return false;
	}
}
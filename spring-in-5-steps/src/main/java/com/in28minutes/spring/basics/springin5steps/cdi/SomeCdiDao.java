package com.in28minutes.spring.basics.springin5steps.cdi;

import org.springframework.stereotype.Repository;

@Repository
public class SomeCdiDao {

	public int[] getData() {
		return new int[] { 5, 89, 100 };
	}
}

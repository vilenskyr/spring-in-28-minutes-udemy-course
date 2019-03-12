package com.in28minutes.spring.basics.springin5steps.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomeCdiBusiness {

	@Autowired
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCDIDAO() {
		return someCdiDao;
	}

	public void setSomeCDIDAO(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}

	public int findGreatest() {

		int greatest = Integer.MIN_VALUE;
		int[] data = someCdiDao.getData();

		for (int value : data) {

			if (value > greatest) {

				greatest = value;
			}
		}

		return greatest;
	}
}

package com.in28minutes.spring.basics.springin5steps.cdi;

//@Named
public class SomeCdiBusiness {

	// @Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCDIDAO() {
		return someCdiDao;
	}

	public void setSomeCDIDAO(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
}

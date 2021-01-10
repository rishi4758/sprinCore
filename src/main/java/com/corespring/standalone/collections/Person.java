package com.corespring.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	private List <String> friends;
	private Map <String , Integer>feeStructure;
	private Properties myProperties;



	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}


	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Properties getMyProperties() {
		return myProperties;
	}

	public void setMyProperties(Properties myProperties) {
		this.myProperties = myProperties;
	}



}

package br.com.gabiroba.adapter.hexagonal.application;

import java.util.Map;

public class UserRest {
	
	public UserRest() {
	}

	public Integer post(Map<String, String> values) {
		return 201;
	}
	
	public Integer get() {
		return 200;
	}
}

package com.feiyue.util;


import java.util.List;

public class MyData<T> {
	
	private List<T> data;

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

}

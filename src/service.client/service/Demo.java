package service;

import service.framework.Repository;
import service.framework.Service;

public class Demo {
	public static void main(String[] args) {
		for (Service s : new Repository().getAvailable()) {
			s.serv("Hello World!");
		}
	}
}

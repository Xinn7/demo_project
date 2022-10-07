package com.example.demo_project.service.impl;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.PersonService;

public class PersonServiceImpl implements PersonService{

	@Override
	public Person getPersonInfo(String id) {
		Person per = new Person();
		per.setId(id);
		per.setAge(10);
		per.setCity("Tainan");
		per.setName("Tina");
		return per;
	}
	public void printPersonInfo(Person person) {
		System.out.println(person.getId());
		System.out.println(person.getAge());
		System.out.println(person.getCity());
		System.out.println(person.getName());
	}
}

package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Bird;
import com.example.demo_project.service.ifs.Active;
@Service
public class ActiveImpl implements Active{

	@Override
	public Bird fly(String name, int age) {
		Bird bird = new Bird();
		System.out.println("���~ "+ age + " ��");
		System.out.println(name + " ���b��");
//		bird.setAge(age);
//		bird.setName(name);
		return bird;
	}
//	public void printBird(Bird bird) {
//		System.out.println("���~ "+ bird.getAge() + " ��");
//		System.out.println(bird.getName() + " ���b��");
//	}
}

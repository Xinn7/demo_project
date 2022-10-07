package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Bird;
import com.example.demo_project.service.ifs.Active;
@Service
public class ActiveImpl implements Active{

	@Override
	public Bird fly(String name, int age) {
		Bird bird = new Bird();
		System.out.println("今年 "+ age + " 歲");
		System.out.println(name + " 正在飛");
//		bird.setAge(age);
//		bird.setName(name);
		return bird;
	}
//	public void printBird(Bird bird) {
//		System.out.println("今年 "+ bird.getAge() + " 歲");
//		System.out.println(bird.getName() + " 正在飛");
//	}
}

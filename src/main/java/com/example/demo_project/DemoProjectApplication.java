package com.example.demo_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo_project.entity.Bird;
import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.PersonService;
import com.example.demo_project.service.impl.ActiveImpl;
import com.example.demo_project.service.impl.PersonServiceImpl;

@SpringBootApplication
public class DemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
//		PersonServiceImpl personservice = new PersonServiceImpl();
//		Person per = personservice.getPersonInfo("xxx");
//		personservice.printPersonInfo(per);
//		
//		System.out.println("==================");
//
//		ActiveImpl active = new ActiveImpl();
////		Bird bi = active.fly("YYY", 2);
////		active.printBird(bi);
//		active.fly("YYY", 2);
	}
}

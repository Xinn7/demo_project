package com.example.demo_project.service.ifs;

import com.example.demo_project.entity.Person;

public interface PersonService {
	//介面裡定義一個方法getPersonInfo
	//參數為id
	//回傳型態是Person
	public Person getPersonInfo(String id); //可取得Person中定義的多個屬性
	
}

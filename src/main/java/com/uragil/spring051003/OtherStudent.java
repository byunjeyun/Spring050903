package com.uragil.spring051003;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class OtherStudent {

	private String name;
	private int age;
	
	
	
	
	
	public OtherStudent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	@PostConstruct
	
	
	public void initMethod()  { //빈 초기화단계에서 호출
		System.out.println("initmethod 메서드 호출됨");
		
	}
	
	
	@PreDestroy
	
	public void destroyMethod() { //빈 소멸단계에서 호출
		System.out.println("destroymethod 메서드 호출됨");	
	}
	
}

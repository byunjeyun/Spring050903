package com.uragil.spring051003;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();//컨테이너 ctx 생성
	
	
	ctx.load("classpath:applicationCTX.xml");// 컨테이너 설정단계
	ctx.refresh();
	
	Student stu1=ctx.getBean("student1", Student.class); //
	System.out.println(stu1.getName()); //컨테이너 사용
	
	
	OtherStudent otherStu1 = ctx.getBean("OtherStudent", OtherStudent.class);
	System.out.println(otherStu1.getName()); //컨테이너 사용
	
	ctx.close(); // 컨테이너 ctx 종료
	}	
}

package com.fullstack.ex1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//프레임워크에게 이클래스가 컨트롤러 역할을 한다고 등록해야 합니다
@RestController
public class SampleController {
	
	//클래스를 컨트롤러에 등록했으니 서블릿에서처럼 doSomething 메서드처럼 어떤 요청이 오면
	//어떤 메서드가 요청처리를 할지 지정해야합니다
	//이때 URL Pattern 맵핑을 하는 어노테이션이 @GetMapping([{"","",""}])입니다
	
	//아래의 메서드는 뷰어 지정을 따로 하지않고 메세지만 전달하도록 정의합니다
	//이때 리턴타입이 명시되어야 합니다. 즉 뷰어 없는 컨트롤러입니다
	@GetMapping("/hello")
	public String[] sayhello() {
		return new String[] {"hello","SpringBoot"};
	}
}

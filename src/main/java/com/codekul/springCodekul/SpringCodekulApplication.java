package com.codekul.springCodekul;

import com.codekul.springCodekul.di.Company;
import com.codekul.springCodekul.ioc.Jio;
import com.codekul.springCodekul.ioc.Vodafone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCodekulApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringCodekulApplication.class, args);

//		Vodafone obj =context.getBean(Vodafone.class);
//		obj.calling();
//
//		Jio obj1 = context.getBean(Jio.class);
//		obj1.calling();

		Company company = context.getBean(Company.class);
		company.display();
	}

	@GetMapping("hi")
	public String hellowmsg(){
		return "Hello Tejas";
	}

}

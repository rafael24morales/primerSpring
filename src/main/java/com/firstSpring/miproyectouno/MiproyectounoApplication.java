package com.firstSpring.miproyectouno;

import com.firstSpring.miproyectouno.pojito.Pojo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MiproyectounoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(MiproyectounoApplication.class, args);

		String[] beanNombres = run.getBeanDefinitionNames();

		Arrays.sort(beanNombres);

		System.out.println("---------------------------------------");
		for(String bean : beanNombres){
			System.out.println(bean);
		}


		Pojo jshdkajshd = (Pojo)run.getBean("miPojito");

		System.out.println(jshdkajshd);
	}

}


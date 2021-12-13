package br.com.pan.bluebank;

import br.com.pan.bluebank.utils.AppListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlueBankPanAcademyApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BlueBankPanAcademyApplication.class);
		//SpringApplication.run(BlueBankPanAcademyApplication.class, args);
		app.addListeners(new AppListener());
		app.run(args);
	}

}

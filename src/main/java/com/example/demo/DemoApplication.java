//-----------SERVER-----------
//postgres sto intelliJ: name: xristina@localhost, database: user
//psql: server: localhost, username: postgres

package com.example.demo;

import com.example.demo.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

}

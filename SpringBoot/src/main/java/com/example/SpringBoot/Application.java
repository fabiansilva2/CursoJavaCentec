package com.example.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

//para listar as portas caso apresente erro de porta já usada
//no prompt de comando digitar netstat -a -n -o | findstr 8080
//pegar o numeto do PID e para a execução pelo gerenciador de tarefas

package com.poo.introducao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroducaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoApplication.class, args);

		Lista02 lista = new Lista02();
		lista.ex01();
	}

	// static void limpa_windows() {
	// 	try {
    //         if (System.getProperty("os.name").contains("Windows")) {
    //             new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    //         } else {
    //             System.out.println("Este comando só funciona no Windows.");
    //         }
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
	// }

	// static void finaliza() {
	// 	System.out.println("\n\n\n\n");
	// }
}

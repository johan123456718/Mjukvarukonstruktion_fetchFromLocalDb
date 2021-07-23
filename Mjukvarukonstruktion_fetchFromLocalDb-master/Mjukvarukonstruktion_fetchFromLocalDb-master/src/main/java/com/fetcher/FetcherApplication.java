package com.fetcher;

import data.MyDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class FetcherApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter dbType (1=mysql, 2=mongodb): ");
		int dbType = scan.nextInt();
		System.out.print("Enter db port: ");
		int port = scan.nextInt();
		MyDatabase.DatabaseConfig(dbType, port, "testuser", "testpassword");
		SpringApplication.run(FetcherApplication.class, args);
	}

}

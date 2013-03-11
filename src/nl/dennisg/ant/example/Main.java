package nl.dennisg.ant.example;

import java.util.concurrent.CountDownLatch;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("Running on port: " + System.getenv("PORT"));
		new CountDownLatch(1).await();
	}
}

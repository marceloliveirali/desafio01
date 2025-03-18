package com.DevSuperiorDesafioI.desafio01;

import com.DevSuperiorDesafioI.desafio01.entities.Order;
import com.DevSuperiorDesafioI.desafio01.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner
{
	@Autowired
	private OrderService orderService;

    public static void main(String[] args)
	{
		SpringApplication.run(Desafio01Application.class, args);
		Locale.setDefault(Locale.US);
	}

	@Override
	public void run(String... args) throws Exception
	{
		Order order1 = new Order(1034, 150.0, 20.0);
		System.out.println("Pedido código " + order1.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order1));
		System.out.println(" ");

		Order order2 = new Order(2282, 800.0, 10.0);
		System.out.println("Pedido código " + order2.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order2));
		System.out.println(" ");

		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código " + order3.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order3));
		System.out.println(" ");
	}
}

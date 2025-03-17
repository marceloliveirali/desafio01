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
		Order order = new Order(1309, 95.90, 0.0);

		String value = String.valueOf(order.getCode());

		System.out.println("Pedido código " + value);
		System.out.printf("Valor total: R$ %.2f", orderService.total(order));
	}
}

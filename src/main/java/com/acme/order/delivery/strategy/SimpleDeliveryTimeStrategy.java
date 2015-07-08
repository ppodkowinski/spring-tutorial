package com.acme.order.delivery.strategy;

import org.springframework.stereotype.Component;

import com.acme.order.Customer;
import com.acme.order.pizza.PizzaType;

public class SimpleDeliveryTimeStrategy implements DeliveryTimeStrategy {

	@Override
	public int provideDeliveryMinutesOffset(Customer customer, PizzaType pizzaType) {
		return 30;
	}
}

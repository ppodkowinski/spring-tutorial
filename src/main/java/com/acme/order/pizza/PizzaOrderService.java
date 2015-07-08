package com.acme.order.pizza;

import java.util.List;

import org.springframework.stereotype.Component;

import com.acme.order.Customer;

@Component
public interface PizzaOrderService {

	String createOrder(Customer customer, PizzaType type);

	void cancelOrder(String pizzaOrderId);

	void deliverOrder(String pizzaOrderId);

	List<PizzaOrder> fetchOrders();

	List<PizzaOrder> fetchDelivered();

	List<PizzaOrder> fetchUnprocessed();

	List<PizzaOrder> fetchCancelled();

}

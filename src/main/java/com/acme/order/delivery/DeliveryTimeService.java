package com.acme.order.delivery;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.acme.order.Customer;
import com.acme.order.pizza.PizzaType;
@Component
public interface DeliveryTimeService {

	Date getTime(Customer customer, PizzaType type);

}

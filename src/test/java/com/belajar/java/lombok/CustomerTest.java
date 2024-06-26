package com.belajar.java.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void testCustomer() {
        var customer = new Customer();
        customer.setId("100");
        customer.setName("Arbi");
        System.out.println(customer.getId());
        System.out.println(customer.getName());
    }

    @Test
    void testCustomerConstructor() {
        var customer = new Customer("ID", "NAME");
        Assertions.assertEquals("ID", customer.getId());
        Assertions.assertEquals("NAME", customer.getName());
    }

    @Test
    void testEquals() {
        var customer = new Customer("ID", "NAME 1");
        var customer2 = new Customer("ID", "NAME 2");

        Assertions.assertEquals(customer, customer2);
        Assertions.assertEquals(customer.hashCode(), customer2.hashCode());
    }
}

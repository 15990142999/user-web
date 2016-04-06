package com.walter.myopensource.web.service;

import com.walter.myopensource.web.model.Customer;
import org.junit.Before;
import org.junit.Test;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by wangdongliang on 16/4/6.
 */
public class CustomerServceTest {

    private final CustomerService customerService;

    public CustomerServceTest(){
        customerService = new CustomerService();
    }

    @Before
    public void init(){

    }

    @Test
    public void getCustomerListTest() throws Exception{
        List<Customer> customerList = customerService.getCustomerList();

        assertEquals(1, customerList.size());

    }
}

package com.deloitte.ecommerce.service;

import com.deloitte.ecommerce.entities.Customer;


public interface Service {
	Customer getUserByMobileno(String mobileno);

    boolean credentialsCorrect(String mobileno, String password);

}

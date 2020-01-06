
package com.deloitte.ecommerce.dao;

import com.deloitte.ecommerce.entities.Customer;



public interface Dao {
	public Customer getUserByMobileno(String mobileno);

   public boolean credentialsCorrect(String mobileno, String password) throws MobileNotFoundException;
}

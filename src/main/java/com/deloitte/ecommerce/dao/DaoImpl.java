package com.deloitte.ecommerce.dao;
import java.util.HashMap;
import java.util.Map;

import com.deloitte.ecommerce.entities.Customer;

import com.deloitte.ecommerce.dao.MobileNotFoundException;
//import exceptions.CustomerNotFoundException;

//import com.deloitte.ecommerce.entities.Customer;



public class DaoImpl implements Dao{
	private Map<String, Customer> store = new HashMap<>();

    public DaoImpl() {
        Customer user1 = new Customer("1234", "Divya",210,"1234");
        store.put("1234", user1);
        Customer user2 = new Customer("56789", "harika",210,"56789");
        store.put("56789", user2);
        
    }
    
 @Override
    public boolean credentialsCorrect(String mobileno, String password)  {
        Customer user = store.get(mobileno);
        if (user == null) {
        	
    			try {
					throw new MobileNotFoundException("employee not found for id=" + mobileno);
				} catch (MobileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			return false;
    	
        }
        else
        	return user.getPassword().equals(password);
		
    }

 @Override
    public Customer getUserByMobileno(String mobileno) {
        Customer user = store.get(mobileno);
        return user;
    }

	
	
}

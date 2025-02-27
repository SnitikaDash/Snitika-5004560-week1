package service;

import repository.CustomerRepository;

public class CustomerService
{
	private CustomerRepository customerRepository;

    // Constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String getCustomerById(String id) {
        return customerRepository.findCustomerById(id);
    }

}

package lk.ijse.final_project.service.impl;

import com.example.demo.dto.CustomDTO;
import com.example.demo.dto.CustomerDTO;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


public interface CustomerService {

    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CustomerDTO updateCustomer(CustomerDTO customerDTO);
    boolean deleteCustomer(String id);
    List<CustomerDTO> getAllCustomers();
    List<CustomerDTO> searchCustomer(String name);

    @ResponseBody
    CustomDTO customerIdGenerate();
}

package lk.ijse.final_project.service.impl;

import com.example.demo.dto.CustomDTO;
import com.example.demo.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public interface EmployeeService {

    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO );
    EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);
    boolean deleteEmployee(String id);
    List<EmployeeDTO> getAllEmployee();
    List<EmployeeDTO> searchEmployee(String name);

    @ResponseBody
    CustomDTO employeeIdGenerate();
}

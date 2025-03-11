package lk.ijse.final_project.service.impl;

import com.example.demo.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {

    UserDetailsService userDetailService();
    UserDTO searchUser(String id);
}

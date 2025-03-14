package lk.ijse.final_project.service.impl;

import com.example.demo.auth.request.SignInRequest;
import com.example.demo.auth.request.SignUpRequest;
import com.example.demo.auth.response.JwtAuthResponse;

public interface AuthenticationService {

    JwtAuthResponse signIn(SignInRequest signInRequest);
    JwtAuthResponse signUp(SignUpRequest signUpRequest);
}

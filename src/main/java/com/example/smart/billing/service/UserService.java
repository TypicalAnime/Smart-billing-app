package com.example.smart.billing.service;

import com.example.smart.billing.io.UserRequest;
import com.example.smart.billing.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);




}

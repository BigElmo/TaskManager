package com.bigelmo.taskmanager.services;

import com.bigelmo.taskmanager.security.SystemUser;
import com.bigelmo.taskmanager.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByUserName(String username);
    boolean save(SystemUser systemUser);
}

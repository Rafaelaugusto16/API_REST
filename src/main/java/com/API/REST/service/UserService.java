package com.API.REST.service;

import com.API.REST.Model.User;

public interface UserService {
    
    User findById (long id);
    User create(User userToCreate);

}

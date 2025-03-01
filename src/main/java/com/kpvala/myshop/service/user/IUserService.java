package com.kpvala.myshop.service.user;

import com.kpvala.myshop.dto.UserDto;
import com.kpvala.myshop.model.User;
import com.kpvala.myshop.request.CreateUserRequest;
import com.kpvala.myshop.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}

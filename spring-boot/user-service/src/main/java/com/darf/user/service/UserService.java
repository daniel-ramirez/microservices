package com.darf.user.service;

import java.util.List;

import com.darf.user.dto.UserDTO;

public interface UserService {

	List<User> findAll();

	User save(User user);

	UserDTO findById(Long id);

}

package kh.edu.istad.api_mvc.mvc.service;

import kh.edu.istad.api_mvc.mvc.domain.User;
import kh.edu.istad.api_mvc.mvc.dto.UserRequest;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> getAll () ;
    User getById(UUID id) ;
    User deletedById (UUID id) ;
    User createdUser (UserRequest userRequest) ;
}

package kh.edu.istad.api_mvc.mvc.service.impl;

import kh.edu.istad.api_mvc.mvc.domain.User;
import kh.edu.istad.api_mvc.mvc.dto.UserRequest;
import kh.edu.istad.api_mvc.mvc.repository.UserRepository;
import kh.edu.istad.api_mvc.mvc.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository ;
    @Override
    public List<User> getAll() {
        return userRepository.selectAll();
    }

    @Override
    public User getById(UUID id) {
        return userRepository.selectById(id).orElse(null);
    }

    @Override
    public User deletedById(UUID id) {
         userRepository.deletedById(id);
        return  null ;
    }

    @Override
    public User createdUser(UserRequest userRequest) {
        return userRepository.insert(userRequest);
    }
}

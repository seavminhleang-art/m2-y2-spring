package kh.edu.istad.api_mvc.mvc.web.controller;


import kh.edu.istad.api_mvc.mvc.domain.User;
import kh.edu.istad.api_mvc.mvc.dto.UserRequest;
import kh.edu.istad.api_mvc.mvc.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    //
    private final UserService userService;

    @GetMapping
    public List<User> getAllUser() {
        return userService.getAll();
    }

    @GetMapping("{id}")
    public User getUserById(UUID id) {
        return userService.getById(id);
    }
    @DeleteMapping("{id}")
    public User deleteById( @PathVariable  UUID id) {
        return userService.deletedById(id);
    }

    @PostMapping
    public User insert ( @RequestBody  UserRequest userRequest  ) {
        return userService.createdUser(userRequest) ;
    }

}
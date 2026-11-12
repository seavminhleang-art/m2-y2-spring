package kh.edu.istad.api_mvc.mvc.repository;

import kh.edu.istad.api_mvc.mvc.domain.User;
import kh.edu.istad.api_mvc.mvc.dto.UserRequest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepository {
    private List <User> users ;
    public  UserRepository() {
        users = new ArrayList<>() ;
        User adminUser  = new User() ;
        adminUser.setId(UUID.randomUUID());
        adminUser.setName("Admin");
        adminUser.setPassword("@Admin123");
        adminUser.setIsActive(Boolean.TRUE);


        User editorUser  = new User() ;
        editorUser.setId(UUID.randomUUID());
        editorUser.setName("editor");
        editorUser.setPassword("@editor123");
        editorUser.setIsActive(Boolean.TRUE);

        User customUser = new User() ;
        customUser.setId(UUID.randomUUID());
        customUser.setName("editor");
        customUser.setPassword("@editor123");
        customUser.setIsActive(Boolean.TRUE);

        users.add(adminUser);
        users.add(editorUser) ;
        users.add(customUser);




    }
    public  List<User> selectAll () {
        return  users ;
    }
    public Optional<User> selectById(UUID id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }
    public User insert (UserRequest userRequest) {
          User newUser = new User();
          newUser.setId(userRequest.id());
          newUser.setName(userRequest.name());
          newUser.setPassword(userRequest.password());
          newUser.setIsActive(userRequest.isActive());
          users.add(newUser);
          return  newUser ;
    }

    public void deletedById (UUID id ) {
        users.removeIf(user -> user.getId().equals(id)) ;
    }

}

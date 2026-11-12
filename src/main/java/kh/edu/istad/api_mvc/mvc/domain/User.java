package kh.edu.istad.api_mvc.mvc.domain;

import kh.edu.istad.api_mvc.mvc.dto.UserRequest;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
public class User {
    private UUID id ;
    private String name ;
    private String password ;
    private Boolean isActive ;


}

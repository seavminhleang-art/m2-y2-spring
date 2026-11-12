package kh.edu.istad.api_mvc.mvc.dto;

import java.util.UUID;

public record UserRequest (
        UUID id ,
        String name ,

        String password ,
        Boolean isActive
){
}

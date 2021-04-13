package com.example.todolist.web.dto;

import com.example.todolist.domain.user.User;
import com.example.todolist.exception.EntityRelatedException;
import com.example.todolist.exception.ErrorMessage;
import lombok.Setter;
import lombok.ToString;

@ToString(exclude = "password")
@Setter
public class RequestSignInUserDto {

    private String userId;

    private String password;

    private String name;

    private String email;

    public User toEntity() {
        if (userId == null || password == null || name == null || email == null) {
            throw new EntityRelatedException(ErrorMessage.ENTITY_NOT_CREATE);
        }
        return new User(userId, password, name, email);
    }

}

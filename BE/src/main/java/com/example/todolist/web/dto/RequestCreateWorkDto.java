package com.example.todolist.web.dto;

import com.example.todolist.domain.work.Work;
import com.example.todolist.exception.EntityRelatedException;
import com.example.todolist.exception.ErrorMessage;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class RequestCreateWorkDto {

    private String title;

    private String content;

    private int status;

    public Work toEntity() {
        if (title == null || content == null || status == 0) {
            throw new EntityRelatedException(ErrorMessage.ENTITY_NOT_CREATE);
        }
        return new Work(title, content, status);
    }

}

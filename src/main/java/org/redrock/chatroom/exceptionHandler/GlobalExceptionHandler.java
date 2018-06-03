package org.redrock.chatroom.exceptionHandler;

import org.redrock.chatroom.dto.ResponseEntity;
import org.redrock.chatroom.exception.ParameterException;
import org.redrock.chatroom.exception.ResourceNotFoundException;
import org.redrock.chatroom.exception.ServerException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ParameterException.class)
    public ResponseEntity<Object> handlerParameterException(ParameterException e){
        return new ResponseEntity<>(400, e.getMessage(), e.getStackTrace());
    }

    @ExceptionHandler(ServerException.class)
    public ResponseEntity<Object> handlerServerException(ServerException e){
        return new ResponseEntity<>(500, e.getMessage(), e.getStackTrace());
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Object> handlerResourceNotFoundException(ResourceNotFoundException e){
        return new ResponseEntity<>(404, e.getMessage(), e.getStackTrace());
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<Object> handlerNullPointerException(NullPointerException e){
        return new ResponseEntity<>(404, "访问的资源不存在", e.getStackTrace());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handlerException(Exception e){
        e.printStackTrace();
        return new ResponseEntity<>(500, "未知错误", e.getStackTrace());
    }

}

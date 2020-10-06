package com.wine.to.up.notification.service.controller.advices;

import com.wine.to.up.notification.service.exceptions.NotificationNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class NotificationNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(NotificationNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String notificationNotFoundHandler(NotificationNotFoundException e) {
        return e.getMessage();
    }
}

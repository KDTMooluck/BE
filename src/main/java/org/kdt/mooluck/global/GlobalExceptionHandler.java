package org.kdt.mooluck.global;

import org.kdt.mooluck.domain.elder.exception.ElderNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(ElderNotFoundException.class)
    public ResponseEntity<Void> handleElderNotFoundException(ElderNotFoundException ex) {
        System.out.println("로그: " + ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}

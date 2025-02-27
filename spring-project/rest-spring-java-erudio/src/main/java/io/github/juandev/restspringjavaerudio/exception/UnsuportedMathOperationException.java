package io.github.juandev.restspringjavaerudio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1L;

    public UnsuportedMathOperationException(String message) {
        super(message);
    }
}

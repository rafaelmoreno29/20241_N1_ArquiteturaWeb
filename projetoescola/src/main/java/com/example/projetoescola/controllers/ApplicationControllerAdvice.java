package com.example.projetoescola.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.projetoescola.dtos.ApiErrorDTO;
import com.example.projetoescola.exceptions.RegraNegocioException;

@RestControllerAdvice
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ApplicationControllerAdvice {

    @ExceptionHandler(RegraNegocioException.class)
    public ApiErrorDTO handleRegraNegocioException(RegraNegocioException ex) {
        return new ApiErrorDTO(ex.getMessage());
    }
}

package org.example.adapter.controller;

import org.example.adapter.dto.AlertDto;
import org.springframework.beans.BeanInstantiationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public AlertDto exception (Exception ex) {
        return new AlertDto("Server error");
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public AlertDto missingServletRequestParameterException (Exception ex) {
        return new AlertDto("Введите запрос в формате: /calculator/арифметическая операция (add, subtract, multiply, divide)/?intA=целое число&intB=целое число");
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public AlertDto methodArgumentTypeMismatchException (Exception ex) {
        return new AlertDto("Параметры запроса intA, intB принимают только целые числа (в диапазоне от -2 147 483 648 до 2 147 483 647)");
    }

    @ExceptionHandler(ArithmeticException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public AlertDto arithmeticException (Exception ex) {
        return new AlertDto("Параметр intB не может быть равен 0");
    }

    @ExceptionHandler(BeanInstantiationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public AlertDto beanInstantiationException(Exception ex) {
        return new AlertDto(ex.getCause().getMessage());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public AlertDto illegalArgumentException(Exception ex) {
        return new AlertDto(ex.getMessage());
    }
}

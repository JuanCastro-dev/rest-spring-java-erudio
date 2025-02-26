package io.github.juandev.restspringjavaerudio.controller;

import io.github.juandev.restspringjavaerudio.exception.UnsuportedMathOperationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

import static io.github.juandev.restspringjavaerudio.utils.MathUtils.convertToDouble;
import static io.github.juandev.restspringjavaerudio.utils.MathUtils.isNumeric;

@RestController
public class MathController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/sum/{number1}/{number2}")
    public Double sum(@PathVariable(value = "number1") String number1, @PathVariable(value = "number2") String number2)
            throws UnsuportedMathOperationException {
        if (!isNumeric(number1) || !isNumeric(number2) ) {
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        return convertToDouble(number1)+convertToDouble(number2);
    }

    @GetMapping("/sub/{number1}/{number2}")
    public Double sub(@PathVariable(value = "number1") String number1, @PathVariable(value = "number2") String number2)
            throws UnsuportedMathOperationException {
        if (!isNumeric(number1) || !isNumeric(number2) ) {
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        return convertToDouble(number1)-convertToDouble(number2);
    }

    @GetMapping("/mult/{number1}/{number2}")
    public Double mult(@PathVariable(value = "number1") String number1, @PathVariable(value = "number2") String number2)
            throws UnsuportedMathOperationException {
        if (!isNumeric(number1) || !isNumeric(number2) ) {
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        return convertToDouble(number1)*convertToDouble(number2);
    }

    @GetMapping("/div/{number1}/{number2}")
    public Double div(@PathVariable(value = "number1") String number1, @PathVariable(value = "number2") String number2)
            throws UnsuportedMathOperationException {
        if (!isNumeric(number1) || !isNumeric(number2) ) {
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        return convertToDouble(number1)/convertToDouble(number2);
    }

    @GetMapping("/square/{number}")
    public Double square(@PathVariable(value = "number") String number)
            throws UnsuportedMathOperationException {
        if (!isNumeric(number)) {
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }
        return Math.sqrt(convertToDouble(number));
    }
}

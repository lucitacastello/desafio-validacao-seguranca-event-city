package com.devsuperior.demo.controllers.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

    private List<FieldMessage> errors = new ArrayList<>();

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String messagem){
        errors.add(new FieldMessage(fieldName, messagem));
    }
}

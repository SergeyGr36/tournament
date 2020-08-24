package com.task.test.validation;

import org.springframework.stereotype.Service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
@Service
public class MultipleOfEightValidator implements ConstraintValidator<MultipleOfEight, Integer> {
    private final int MULTIPLE_BY_EIGHT = 8;
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (value % MULTIPLE_BY_EIGHT == 0) {
            for (int i = value/MULTIPLE_BY_EIGHT; i>=2; ) {
                if (i%2!=0){
                    return false;
                }
                i = i/2;
            }
            return true;
        } else return false;
    }
}

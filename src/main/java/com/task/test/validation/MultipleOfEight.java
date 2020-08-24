package com.task.test.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MultipleOfEightValidator.class)
public @interface MultipleOfEight {
    String message() default "Count of participants must be divided by eight";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

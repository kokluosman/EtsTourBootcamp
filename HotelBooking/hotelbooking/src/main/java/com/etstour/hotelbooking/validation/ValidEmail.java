package com.etstour.hotelbooking.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = EmailValidator.class)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidEmail {
    //custom annotation for get email with custom regex pattern

    String message() default  "Invalid";
    Class<?>[] groups() default  {};
    Class<? extends Payload>[] payload() default {};

}

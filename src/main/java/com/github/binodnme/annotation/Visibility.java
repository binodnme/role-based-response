package com.github.binodnme.annotation;

import com.github.binodnme.enums.Role;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 5/26/17.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface Visibility {

    Role[] value();

}

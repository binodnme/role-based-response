package com.github.binodnme.util;

import com.github.binodnme.annotation.Visibility;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 5/26/17.
 */
public class ResponseUtil {

    private ResponseUtil() {
    }

    public static Object filterFieldByRole(Object object, String role) {
        Arrays.stream(object.getClass().getDeclaredFields()).forEach(field -> {
            field.setAccessible(true);
            if (isNotAllowed(field, role)) {
                try {
                    field.set(object, null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });

        return object;
    }

    private static boolean isNotAllowed(Field field, String role) {
        Visibility visibility = field.getAnnotation(Visibility.class);
        return visibility != null && Arrays.stream(visibility.value()).noneMatch(role1 -> role1.getValue().equalsIgnoreCase(role));

    }
}

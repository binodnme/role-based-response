package com.github.binodnme.util;

import com.github.binodnme.annotation.Visibility;
import com.github.binodnme.dto.demo1.Customer;
import com.github.binodnme.dto.demo1.UserResponse;
import org.reflections.Reflections;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 5/26/17.
 */
public class ObjectUtil {

    public static Class getTypeByRole(Class parentClass, String role) {
        Reflections reflections = new Reflections(parentClass.getPackage().getName());

        Set<Class<? extends UserResponse>> subTypes = reflections.getSubTypesOf(UserResponse.class);

        subTypes.forEach(subType -> System.out.println(subType.getName()));

        Optional<Class<? extends UserResponse>> resultClass = subTypes.stream().filter(subType -> hasRole(subType, role))
                .findFirst();

        return resultClass.orElse(Customer.class);
    }

    private static boolean hasRole(Class type, String role) {
        Visibility visibility = (Visibility) type.getAnnotation(Visibility.class);
        return Arrays.stream(visibility.value()).anyMatch(role1 -> role1.getValue().equalsIgnoreCase(role));
    }


    public static void main(String[] args) {
//        System.out.println(getTypeByRole(UserResponse.class, "customer").getClass().newInstance());
    }

}

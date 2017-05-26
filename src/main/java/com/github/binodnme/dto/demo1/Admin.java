package com.github.binodnme.dto.demo1;

import com.github.binodnme.enums.Role;
import com.github.binodnme.annotation.Visibility;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 5/26/17.
 */
@Visibility(Role.ADMIN)
public class Admin extends UserResponse {
    private String value1;

    private String value2;


    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                '}';
    }
}

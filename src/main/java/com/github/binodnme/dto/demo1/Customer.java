package com.github.binodnme.dto.demo1;

import com.github.binodnme.enums.Role;
import com.github.binodnme.annotation.Visibility;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 5/26/17.
 */
@Visibility(Role.CUSTOMER)
public class Customer extends UserResponse {
    private String value3;

    private String value4;

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public String getValue4() {
        return value4;
    }

    public void setValue4(String value4) {
        this.value4 = value4;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "value3='" + value3 + '\'' +
                ", value4='" + value4 + '\'' +
                '}';
    }
}

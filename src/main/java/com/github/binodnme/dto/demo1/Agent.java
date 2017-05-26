package com.github.binodnme.dto.demo1;

import com.github.binodnme.enums.Role;
import com.github.binodnme.annotation.Visibility;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 5/26/17.
 */
@Visibility(Role.AGENT)
public class Agent extends UserResponse {
    private String value3;

    private String value2;

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }
}

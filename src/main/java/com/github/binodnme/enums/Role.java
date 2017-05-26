package com.github.binodnme.enums;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 5/26/17.
 */
public enum Role {
    ADMIN("admin"), CUSTOMER("customer"), AGENT("agent");

    private String value;



    Role(String role) {
        this.value = role;
    }

    public String getValue() {
        return value;
    }
}

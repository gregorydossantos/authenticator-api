package com.gregory.authenticatorapi.infra.db.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum RoleType {

    ADMIN(0, "Admin"),
    USER(1, "User");

    private final int code;
    private final String role;

    RoleType(int code, String role) {
        this.code = code;
        this.role = role;
    }

    public static String getRoleByCode(int code) {
        return Arrays.stream(RoleType.values())
                .filter(d -> d.getCode() == code)
                .map(RoleType::getRole)
                .findFirst()
                .orElse(USER.getRole());
    }
}

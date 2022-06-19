package com.OOP.Enumeration;

public class TestEnum {
    public static void main(String[] args) {
        System.out.println(RoleUsers.ROLE_ADMIN.name());

        for(RoleUsers role: RoleUsers.values()){
            System.out.println(role);
        }
    }
}

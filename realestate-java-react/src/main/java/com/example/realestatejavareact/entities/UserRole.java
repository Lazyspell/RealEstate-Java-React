package com.example.realestatejavareact.entities;



public enum UserRole {

    ADMIN("Admin"), USER("User"), LOCKED("Locked");

    private final String roleName;

    UserRole(String name){
        this.roleName = name;
    }

    public static UserRole getByName(String name){
        for (UserRole role: UserRole.values()){
            if(role.roleName.equals(name)){
                return role;
            }
        }
        return LOCKED;
    }

    public static UserRole getById(int id){
        for (UserRole role: UserRole.values()){
            if(role.ordinal() == id){
                return role;
            }
        }
        return LOCKED;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "roleName='" + roleName + '\'' +
                '}';
    }
}

package com.udemy;

public class Login {
    private String currentUsername;
    private String currentPassword;
    private String msg;
    private boolean isLoggedIn;

    public void setUserInDataBase(String username, String password) {
        this.currentUsername = username;
        this.currentPassword = password;
    }

    public void logIn(String userName, String password) {
        if (userName.equals(currentUsername) && (password.equals(currentPassword))) {
            this.msg = "You have successfully logged in";
            this.isLoggedIn = true;
        } else {
            this.msg = "You can't logged in to app";
            this.isLoggedIn = false;
        }
    }

    public String getMsg() {
        return msg;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public String getCurrentUsername() {
        return currentUsername;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }
}

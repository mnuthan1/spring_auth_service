package com.vilma.auth.security;

public class User {
    private Integer id;
        private String username, password;
        private String role;
        private boolean enabled;
    
    public User(Integer id, String username, String password, String role,boolean enabled) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.role = role;
            this.enabled = enabled;
        }
    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }
    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }
    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }
    /**
     * @param enabled the enabled to set
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public boolean getEnabled() {
        return this.enabled;
    }
}
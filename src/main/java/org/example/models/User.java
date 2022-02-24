package org.example.models;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User extends AbstractEntity {

    @NotNull
    private String username;

    @NotNull
    private String pwHash;

    @ManyToMany
    private List<Smoothies> favorites;

    public User() {}

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public User(String username, String password) {
        this.username=username;
        this.pwHash=encoder.encode(password);
    }
    public String getUsername() { return username; }

    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwHash);
    }

    public List<Smoothies> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Smoothies> favorites) {
        this.favorites = favorites;
    }
}
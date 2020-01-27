package com.hello.zernil.Hibernate;


import org.springframework.data.domain.Pageable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class UsersEntity {


    @Id
    @Column(name = "idusers")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "users")
    private String username;

    @Column(name = "passwords")
    private String password;

    @Column(name = "date_created")
    private LocalDateTime date_created;


    public Long getId() {
        return id;
    }

    public LocalDateTime getDate_created() {
        return date_created;
    }

    public void setDate_created(LocalDateTime date_created) {
        this.date_created = date_created;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UsersEntity [id = " + id + ", username = " +  username + ", password = " + password +
                ", date created = " + date_created + "]";
    }
}

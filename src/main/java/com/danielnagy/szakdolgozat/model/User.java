package com.danielnagy.szakdolgozat.model;

import com.danielnagy.szakdolgozat.model.enums.UserRole;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Column(unique = true, nullable = false, length = 30)
    @Getter
    @Setter
    private String username;

    @Column(nullable = false)
    @Setter
    @Getter
    private String password;

    @Column(nullable = false)
    @Getter
    @Setter
    private String firstName;

    @Column(nullable = false)
    @Getter
    @Setter
    private String lastName;

    @Column(unique = true, nullable = false, length = 100)
    @Getter
    @Setter
    private String email;

    @Column(nullable = false)
    @Getter
    @Setter
    private LocalDate dateOfBirth;

    @Column(nullable = false)
    @Getter
    @Setter
    private String address;

    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private UserRole role;

    @Transient
    @Getter
    @Setter
    private String token;

    @Column(name = "create_time", nullable = false)
    @Getter
    @Setter
    private LocalDateTime createTime;

}

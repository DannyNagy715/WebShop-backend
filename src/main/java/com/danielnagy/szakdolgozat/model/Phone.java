package com.danielnagy.szakdolgozat.model;

import com.danielnagy.szakdolgozat.model.enums.PhoneType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "phones")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "serial", nullable = false)
    @Getter
    @Setter
    private String serialNumber;

    @Column
    @Getter
    @Setter
    private String make;

    @Column(nullable = false)
    @Getter
    @Setter
    private String name;

    @Column(nullable = false)
    @Getter
    @Setter
    private double screenSize;

    @Column(name = "picture", nullable = false, length = 20)
    @Getter
    @Setter
    private String pictureName;

    @Column(length = 1000)
    @Getter
    @Setter
    private String description;

    @Column
    @Getter
    @Setter
    private int price;

    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private PhoneType phoneType;

    @Column(name = "network")
    @Getter
    @Setter
    private boolean is5GEnabled;

    @Column(name = "release", nullable = false)
    @Getter
    @Setter
    private LocalDate releaseDate;
}

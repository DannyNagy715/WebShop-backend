package com.danielnagy.szakdolgozat.model;

import com.danielnagy.szakdolgozat.model.enums.HeadphoneType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "headphones")
public class Headphone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "serial", nullable = false, length = 50)
    @Getter
    @Setter
    private String serialNumber;

    @Column
    @Getter
    @Setter
    private String make;

    @Column(nullable = false, length = 20)
    @Getter
    @Setter
    private String name;

    @Column(length = 1000)
    @Getter
    @Setter
    private String description;

    @Column(name = "picture", nullable = false, length = 20)
    @Getter
    @Setter
    private String pictureName;

    @Column
    @Getter
    @Setter
    private int price;

    @Column(nullable = false)
    @Getter
    @Setter
    private String color;

    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private HeadphoneType headphoneType;
}

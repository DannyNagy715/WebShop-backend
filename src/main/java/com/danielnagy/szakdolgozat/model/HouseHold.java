package com.danielnagy.szakdolgozat.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "houseHoldItems")
public class HouseHold {

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

    @Column
    @Getter
    @Setter
    private int powerOutput;

    @Column
    @Getter
    @Setter
    private int weight;

    @Column
    @Getter
    @Setter
    private double cableLength;
}

package com.danielnagy.szakdolgozat.model;

import com.danielnagy.szakdolgozat.model.enums.CameraType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

public class Camera {

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

    @Column(name = "sensor")
    @Getter
    @Setter
    private String sensorType;

    @Column(name = "fileFormat")
    @Getter
    @Setter
    private String fileFormat;

    @Column
    @Getter
    @Setter
    private String memoryCard;

    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private CameraType cameraType;
}

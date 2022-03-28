package com.example.ssmdemo.pojo.model;

import lombok.Data;

import java.util.Date;

@Data
public class Device {
    String id;
    String title;
    String mac;
    String status;
    String user_id;
    Date created;
    Date update;
    String deviceimg;
    String description;
}

package com.example.ssmdemo.service;

import com.example.ssmdemo.model.Device;

import java.util.List;

public interface DeviceService {
    List<Device> selectDevice(Device device);
}

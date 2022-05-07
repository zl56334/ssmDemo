package com.example.ssmdemo.module.sys.service;

import com.example.ssmdemo.module.sys.pojo.model.Device;

import java.util.List;

public interface DeviceService {
    List<Device> selectDevice(Device device);
}

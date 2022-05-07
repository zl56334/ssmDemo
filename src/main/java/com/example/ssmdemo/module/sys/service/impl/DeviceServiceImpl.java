package com.example.ssmdemo.module.sys.service.impl;

import com.example.ssmdemo.module.sys.dao.DeviceDao;
import com.example.ssmdemo.module.sys.pojo.model.Device;
import com.example.ssmdemo.module.sys.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "deviceService")
public class DeviceServiceImpl implements DeviceService {
    @Autowired(required = false)
    private DeviceDao deviceDao;
    @Override
    public List<Device> selectDevice(Device device) {
        List<Device> reList = deviceDao.selectDevice(device);
        return reList;
    }
}

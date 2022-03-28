package com.example.ssmdemo.dao;

import com.example.ssmdemo.pojo.model.Device;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeviceDao {
    int insertDevice(Device device);
    int deleteDevice(Device device);
    int updateDevice(Device device);
    List<Device> selectDevice(Device device);
}

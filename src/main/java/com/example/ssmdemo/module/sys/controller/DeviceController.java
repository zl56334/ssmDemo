package com.example.ssmdemo.module.sys.controller;

import com.example.ssmdemo.module.sys.pojo.model.Device;
import com.example.ssmdemo.module.sys.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("device")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;

    @RequestMapping("/getdevicelist")
    @ResponseBody
    public String getDeviceList(
            @RequestParam(value = "id", required = false) String id) throws Exception {
        Device device = new Device();
        device.setId(id);
        String reStr = deviceService.selectDevice(device).toString();

        return reStr;
    }
}


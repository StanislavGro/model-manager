package ru.youngstanis.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.youngstanis.dto.RawDeviceInfo;

@RestController("/api/v1")
public class ModelController {

    @PostMapping("/createNewModel")
    public String createNewModel(@RequestBody RawDeviceInfo rawDeviceInfo) {
        return rawDeviceInfo.toString();
    }
}

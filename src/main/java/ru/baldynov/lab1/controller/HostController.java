package ru.baldynov.lab1.controller;

import org.springframework.web.bind.annotation.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping(value = "host")
public class HostController {

    @GetMapping()
    String get() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostName();
    }

}

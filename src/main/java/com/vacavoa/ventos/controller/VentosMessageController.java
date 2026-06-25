package com.vacavoa.ventos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vacavoa.ventos.service.VentosMessageService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class VentosMessageController {
    
    private final VentosMessageService messageService;

    public VentosMessageController(VentosMessageService messageService)
    {
        this.messageService = messageService;
    }

    @GetMapping("/message")
    public String bringMessage() {
        return messageService.ObtainMessage();
    }
    
}

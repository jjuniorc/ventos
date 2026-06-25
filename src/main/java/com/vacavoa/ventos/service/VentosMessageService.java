package com.vacavoa.ventos.service;

import org.springframework.stereotype.Service;

import com.vacavoa.ventos.repository.VentosMessageRepository;

@Service
public class VentosMessageService {
    private final VentosMessageRepository messageRepository;
    
    public VentosMessageService(VentosMessageRepository messageRepository)
    {
        this.messageRepository = messageRepository;
    }
    
    public String ObtainMessage()
    {
        return messageRepository.ObtainMessage();
    }
}

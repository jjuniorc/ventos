package com.vacavoa.ventos.service;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vacavoa.ventos.repository.VentosMessageRepository;

@Service
public class VentosMessageService {
    // @Autowired
    // private VentosMessageRepository messageRepository;
    
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

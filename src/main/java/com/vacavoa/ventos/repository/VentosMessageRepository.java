package com.vacavoa.ventos.repository;

import org.springframework.stereotype.Repository;

@Repository
public class VentosMessageRepository {
    
    public String ObtainMessage()
    {
        return "Hello from Repository";
    }

}

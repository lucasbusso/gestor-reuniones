package com.reuniones.reuniones.services;

import com.reuniones.reuniones.models.Reunion;
import com.reuniones.reuniones.repository.ReunionRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ReunionService {

    private final ReunionRepository reunionRepository;

    public ReunionService(ReunionRepository reunionRepository) {
        this.reunionRepository = reunionRepository;
    }

    public List<Reunion> getAllReuniones(){
        return reunionRepository.findAll();
    }
}

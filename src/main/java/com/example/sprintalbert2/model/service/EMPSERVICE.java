package com.example.sprintalbert2.model.service;

import com.example.sprintalbert2.model.entity.Empleado;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EMPSERVICE {
    List<Empleado> findAll();

    Empleado findById(int id);
    void save(Empleado empleado);
    void delete(int id);
}

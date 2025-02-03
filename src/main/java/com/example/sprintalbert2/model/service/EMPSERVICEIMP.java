package com.example.sprintalbert2.model.service;

import com.example.sprintalbert2.model.dao.EmpDAO;
import com.example.sprintalbert2.model.entity.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class EMPSERVICEIMP implements EMPSERVICE {

    @Autowired
    private EmpDAO empleadoRepository;

    @GetMapping("/empleado")
    @Override
    public List<Empleado> findAll() {
        return (List<Empleado>) empleadoRepository.findAll();
    }

    @Override
    public Empleado findById(int id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Empleado empleado) {
        empleadoRepository.save(empleado);
    }

    @Override
    public void delete(int id) {
        empleadoRepository.deleteById(id);
    }
}

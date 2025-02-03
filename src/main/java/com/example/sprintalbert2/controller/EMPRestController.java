package com.example.sprintalbert2.controller;

import com.example.sprintalbert2.model.entity.Empleado;
import com.example.sprintalbert2.model.service.EMPSERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class EMPRestController {

    @Autowired
    private EMPSERVICE empleadoServices;

    @GetMapping("/empleados")
    public List<Empleado> getAllEmpleados() {
        return empleadoServices.findAll();
    }

    @GetMapping("/empleado/{id}")
    public ResponseEntity<Empleado> getEmpleadoById(@PathVariable int id) {
        Empleado empleado = empleadoServices.findById(id);
        if (empleado != null) {
            return ResponseEntity.ok(empleado);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @PostMapping("/empleado")
    public ResponseEntity<Empleado> createEmpleado(@RequestBody Empleado empleado) {
        empleadoServices.save(empleado);
        return new ResponseEntity<>(empleado, HttpStatus.CREATED);
    }

    @PutMapping("/empleado/{id}")
    public ResponseEntity<Empleado> updateEmpleado(@PathVariable int id, @RequestBody Empleado empleadoDetails) {
        Empleado empleado = empleadoServices.findById(id);
        if (empleado != null) {
            empleado.setApellido(empleadoDetails.getApellido());
            empleado.setSalario(empleadoDetails.getSalario());
            empleadoServices.save(empleado);
            return ResponseEntity.ok(empleado);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @DeleteMapping("/empleado/{id}")
    public ResponseEntity<Void> deleteEmpleado(@PathVariable int id) {
        Empleado empleado = empleadoServices.findById(id);
        if (empleado != null) {
            empleadoServices.delete(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}

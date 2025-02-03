package com.example.sprintalbert2.model.dao;

import com.example.sprintalbert2.model.entity.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface EmpDAO extends CrudRepository<Empleado,Integer> {
}

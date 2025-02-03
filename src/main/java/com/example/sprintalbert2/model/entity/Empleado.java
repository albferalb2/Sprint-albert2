package com.example.sprintalbert2.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @Column(name = "Emp_NO", nullable = false)
    private Integer id;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "oficio")
    private String oficio;

    @Column(name = "dir")
    private Integer dir;

    @Column(name = "fecha_alta")
    private LocalDate fechaAlta;

    @Column(name = "salario")
    private Float salario;

    @Column(name = "comision")
    private Float comision;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_NO")
    private Departamento deptNo;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "dept_num")
    private Integer deptNum;

    @Column(name = "dep_NO")
    private Integer depNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public Integer getDir() {
        return dir;
    }

    public void setDir(Integer dir) {
        this.dir = dir;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Float getComision() {
        return comision;
    }

    public void setComision(Float comision) {
        this.comision = comision;
    }

    public Departamento getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Departamento deptNo) {
        this.deptNo = deptNo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getDeptNum() {
        return deptNum;
    }

    public void setDeptNum(Integer deptNum) {
        this.deptNum = deptNum;
    }

    public Integer getDepNo() {
        return depNo;
    }

    public void setDepNo(Integer depNo) {
        this.depNo = depNo;
    }

}
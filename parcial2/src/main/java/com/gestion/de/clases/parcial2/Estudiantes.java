package com.gestion.de.clases.parcial2;

import jakarta.persistence.*;

@Entity
@Table(name = "Estudiantes")
public class Estudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nombre", length = 60, nullable = false)
    private String nombre;
    @Column(name = "apellido", length = 60, nullable = false)
    private String apellido;
    @Column(name = "semestre", length = 1, nullable = false, unique = true)
    private String semestre;
    @Column(name = "clase", length = 60, nullable = false, unique = true)
    private String clase;


    public Estudiantes(long id, String nombre, String apellido, String semestre, String clase) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.semestre = semestre;
        this.clase = clase;

    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
}





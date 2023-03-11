package com.example.backendstudentspotapp.entities;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "classe")
public class ClasseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_classe", nullable = false, length = 10)
    private long id;
    private String nom_classe;

    @Column(name = "id_ecole")
    private long ecole;
}

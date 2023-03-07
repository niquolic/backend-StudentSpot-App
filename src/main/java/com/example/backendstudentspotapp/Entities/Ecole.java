package com.example.backendstudentspotapp.Entities;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ecole")
public class Ecole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ecole", nullable = false, length = 10)
    private Long id;
    private String nom_ecole;
    private String ville_ecole;
    private String adresse_ecole;
    private Long id_groupe;
}

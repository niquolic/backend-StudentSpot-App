package com.example.backendstudentspotapp.Entities;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "utilisateur")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_utilisateur", nullable = false, length = 10)
    private Long id;

    private String login;
    private String password;
    private String nom;
    private String prenom;
    private Long id_role;
    private Long id_groupe;
    private Long id_ecole;
    private Long id_classe;

}
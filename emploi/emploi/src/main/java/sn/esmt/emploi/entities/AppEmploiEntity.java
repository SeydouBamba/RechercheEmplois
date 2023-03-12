package sn.esmt.emploi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "appcv")
public class AppEmploiEntity {
    @Id//Jpa ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 150, nullable = false)
    private String nom;
    @Column(length = 200, nullable = false)
    private String prenom;
    @Column(length = 11, nullable = false)
    private int age;
    @Column(length = 200, nullable = false)
    private String adresse;
    @Column(length = 150, nullable = false, unique = true)
    private String email;
    @Column(length = 15, nullable = false)
    private int telephone;
    @Column(length = 150, nullable = false)
    private String specialite;
    @Column(length = 150, nullable = false)
    private String niveauEtude;
    @Column(length = 150, nullable = false)
    private String experienceProfessionnelle;
}

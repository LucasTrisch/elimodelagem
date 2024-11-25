package com.senai.eli.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "grupos")
@Entity
@Getter
@Setter
public class Grupos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NomeDoGrupo", nullable = false)
    private String NomeDoGrupo;

    @Column(name = "Responsavel")
    private String Responsavel;

    @Column(name = "Email")
    private String Email;
   

}

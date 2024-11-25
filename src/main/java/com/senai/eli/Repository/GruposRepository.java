package com.senai.eli.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.eli.Model.Grupos;

@Repository
public interface GruposRepository extends JpaRepository<Grupos, Long> {

}

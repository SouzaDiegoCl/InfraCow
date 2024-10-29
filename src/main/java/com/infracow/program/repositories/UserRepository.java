package com.infracow.program.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infracow.program.models.Usuario;
@Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {}

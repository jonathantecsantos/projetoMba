package com.portalmba.mba.repositories;


import com.portalmba.mba.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}

package com.portalmba.mba.repositories;

import com.portalmba.mba.models.AnoLetivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnoLetivoRepository extends JpaRepository<AnoLetivo, Long> {
}

package com.springboot.database.respository;

import com.springboot.database.entity.ConversionPot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversionPotRespository extends JpaRepository<ConversionPot, Long> {
}

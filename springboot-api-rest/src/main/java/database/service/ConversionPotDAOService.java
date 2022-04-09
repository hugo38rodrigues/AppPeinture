package database.service;

import database.entity.ConversionPot;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class ConversionPotDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(ConversionPot conversionPot){
        entityManager.persist(conversionPot);
        return conversionPot.getId();
    }
}

package com.dubovskiy.dao;

import com.dubovskiy.coreoracle.entity.Region;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Misha on 18.07.2015.
 */
@Repository
@Transactional
public class DaoImpl implements Dao {

    @PersistenceContext
    EntityManager entityManager;


    protected Session getCurrentSession() {
        return entityManager.unwrap(Session.class);
    }

    public List<Region> findAllRegion() {
        return getCurrentSession().createCriteria(Region.class).list();
    }
}

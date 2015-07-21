package com.dubovskiy;

import com.dubovskiy.coreoracle.entity.Region;
import com.dubovskiy.dao.Dao;
import com.dubovskiy.dao.DaoImpl;
import configs.JpaDatabaseConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Misha on 18.07.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JpaDatabaseConfig.class, DaoImpl.class})
@TransactionConfiguration(defaultRollback = false)
public class DaoTest {

    @Autowired
    Dao dao;

    @Test
    @Transactional
    public void findAllTest() {
        List<Region> list = dao.findAllRegion();
        list.forEach(i -> System.out.println(i));

        org.junit.Assert.assertEquals(list.size(), 4);
    }

}

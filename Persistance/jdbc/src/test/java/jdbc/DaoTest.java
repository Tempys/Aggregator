package jdbc;

import com.jdbc.dao.Dao;
import com.jdbc.entity.Item;
import com.jdbc.entity.Language;
import com.jdbc.entity.Topic;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Misha on 30.06.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:Spring-Datasource.xml"})
@TransactionConfiguration(defaultRollback =true)
public class DaoTest {
    @Autowired
    Dao dao;

    @Test
    public void getAllTest() throws SQLException {
        List<Item> list = dao.getAll();
        System.out.println(list.size());
        Assert.assertNotEquals(list,null);
        Assert.assertNotEquals(list.size(),0);
    }

    @Test
    @Transactional
    public void save() throws SQLException {
        Item item = new Item();
        item.setId(12);
        item.setHtmlTitle("test");
        item.setFavourite(0);
        item.setLanguage(Language.ENG);
        item.setLink("link");
        item.setSnippet("snippet");
        item.setTopic(Topic.NEUROINTERFACE);

        dao.save(item);

    }

    @Test
    @Transactional
    public void remove()throws SQLException{
        dao.delete(12);
    }


}

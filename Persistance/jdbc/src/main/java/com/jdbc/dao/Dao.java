package com.jdbc.dao;

import com.jdbc.entity.Item;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Misha on 26.06.2015.
 */
public interface Dao {
    public List<Item> getAll() throws SQLException;
    public void save(Item item) throws SQLException;
    public void delete(int id)throws SQLException;
}

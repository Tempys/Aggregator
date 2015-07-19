package com.dubovkiy.jdbc.dao;

import com.dubovskiy.jdbc.entity.Item;
import com.dubovskiy.jdbc.entity.Topic;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Misha on 26.06.2015.
 */
@Repository
public class DaoImlp implements Dao {
    private final String ALL_DATA = "SELECT * FROM data";
    private final String INSERT_ITEM="INSERT INTO data(id, favourite, html_title, language, link ,snippet, topic) values(CORE_USERS_SEQ.NEXTVAL, :email, :login, :password)";

    private javax.sql.DataSource dataSource;

    public DaoImlp() {
    }

    public void setDataSource(javax.sql.DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private Statement createStatement()throws SQLException{
        Connection connection = dataSource.getConnection();
        return connection.createStatement();
    }

    private ResultSet getData(String select) throws SQLException{
        Connection connection = null;

        ResultSet resultSet = null;
        try {
            Statement statement = createStatement() ;
            resultSet = statement.executeQuery(select);
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error with connecting to server");
        }
    }

    public List<Item> getAll() throws SQLException{
        ResultSet resultSet = getData(ALL_DATA);
        System.out.println(resultSet.first());
        List<Item> list = new ArrayList<Item>();

         while (resultSet.next()){
           Item item = new Item();

             item.setId(resultSet.getLong("id"));
             item.setFavourite(resultSet.getInt("favourite"));
             item.setHtmlTitle(resultSet.getString("html_title"));
             item.setLink(resultSet.getString("language"));
             item.setLink(resultSet.getString("link"));
             item.setSnippet(resultSet.getString("snippet"));
             item.setTopic(Topic.valueOf(resultSet.getString("topic")));

             list.add(item);
         }

        return  list;
    }

    public void save(Item item) throws SQLException {

        String saveData = String.format("INSERT INTO data (id, favourite, html_title, language, link ,snippet, topic) values ( %d , %d ,'%s' , '%s' , '%s' , '%s' , '%s' )",item.getId(),item.getFavourite(), item.getHtmlTitle(), item.getLanguage().name(), item.getLink(), item.getSnippet(), item.getTopic());
        Statement statement = createStatement();
        statement.executeUpdate(saveData);


    }

    public void delete(int id)throws SQLException{
        String removeItem = String.format("DELETE from data where id=%d",id);
        Statement statement = createStatement();
        statement.executeUpdate(removeItem);
    }
}

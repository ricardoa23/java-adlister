package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;
import dao.Config;

import java.sql.*;

public class MySQLUsersDao implements Users{
    private Connection connection = null;


    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public User findByUsername(String username) throws SQLException {

        String query = "SELECT userName FROM users WHERE userName = ? ";
        PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS) ;
        stmt.setString(1, username);
        ResultSet rs = stmt.getResultSet();
        while(rs.next()) {

            if(username.equalsIgnoreCase(rs.getString("userName"))) {
                  return new User(
                        rs.getLong(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );


            }
        }
        return null;
    }

    @Override
    public Long insert(User user) {
        try {
            String query = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
            String username =  user.getUsername();
            String email = user.getEmail();
            String password = user.getPassword();
            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, username);
            stmt.setString(2, email);
            stmt.setString(3, password);
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                rs.getLong(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


    @Override
    public String createInsertQuery(User user) {
        return "INSERT INTO users (user_id, title, description) VALUES "
                + "(" + user.getUsername() + ", "
                + "'" + user.getEmail() +"', "
                + "'" + user.getPassword() + "')";
    }
}

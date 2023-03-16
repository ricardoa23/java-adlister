package dao;

import models.Ad;
import models.Ads;
import models.Config;

import java.sql.*;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao(Connection connection, Config config) throws SQLException {

        config = new Config();
        connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
        );
    }


    @Override
    public List<Ad> all() throws SQLException {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}


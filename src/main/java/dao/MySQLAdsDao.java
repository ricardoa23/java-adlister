package dao;

import models.Ad;
import com.mysql.cj.jdbc.Driver;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao() {
        try {
            Config config = new Config();
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        String query = "SELECT * FROM ads";
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            Ad ad = new Ad(
                    rs.getLong("user_id"),
                    rs.getString("title"),
                    rs.getString("description")
            );
            ads.add(ad);
        }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        try {
            String query = "INSERT INTO ads (user_id, title, description) VALUES (?, ?, ?)";
            String userId =  String.valueOf(ad.getUserId());
            String title = ad.getTitle();
            String description = ad.getDescription();
            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, userId);
            stmt.setString(2, title);
            stmt.setString(3, description);
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
}


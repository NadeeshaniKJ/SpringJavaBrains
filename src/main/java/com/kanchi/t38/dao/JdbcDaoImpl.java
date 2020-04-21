package com.kanchi.t38.dao;

import com.kanchi.t38.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;

@Component
public class JdbcDaoImpl {

    @Autowired
    private DataSource dataSource;

    public Circle getCircle(int circleId) {
        Circle circle=null;
        Connection connection=null;

        try {

            connection = dataSource.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM circle WHERE id=?");
            preparedStatement.setInt(1, circleId);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                circle = new Circle(circleId, resultSet.getString("name"));
            }

            resultSet.close();
            preparedStatement.close();

        }   catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return circle;
    }
}

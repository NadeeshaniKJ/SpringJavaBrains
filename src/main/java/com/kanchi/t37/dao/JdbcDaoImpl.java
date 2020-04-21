package com.kanchi.t37.dao;

import com.kanchi.t37.model.Circle;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class JdbcDaoImpl {

    public Circle getCircle(int circleId) {
        Circle circle=null;
        Connection connection=null;

        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3307/springt37db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        try {
            Class.forName(driver).newInstance();
            connection = DriverManager.getConnection(url, user, password);

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM circle WHERE id=?");
            preparedStatement.setInt(1, circleId);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                circle = new Circle(circleId, resultSet.getString("name"));
            }

            resultSet.close();
            preparedStatement.close();

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return circle;
    }
}

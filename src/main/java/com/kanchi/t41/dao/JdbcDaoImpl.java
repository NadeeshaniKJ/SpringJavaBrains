package com.kanchi.t41.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class JdbcDaoImpl {

//    @Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate =new JdbcTemplate();

    public DataSource getDataSource() {
        return dataSource;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
//        this.dataSource=dataSource;
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int getCircleCount(){
        String sql = "SELECT COUNT(*) FROM CIRCLE";
//        jdbcTemplate.setDataSource(getDataSource());
        return  jdbcTemplate.queryForObject(sql,Integer.class);
    }

    public String getCircleName(int circleId){
        String sql = "SELECT NAME FROM CIRCLE WHERE ID =?";
        return  jdbcTemplate.queryForObject(sql,new Object[]{circleId},String.class);
    }


    /*
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
    }*/
}

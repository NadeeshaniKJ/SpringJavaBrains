package com.kanchi.t46.dao;

import com.kanchi.t46.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class JdbcDaoImpl {

//    @Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParametersJdbcTemplate;

    public DataSource getDataSource() {
        return dataSource;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
//        this.dataSource=dataSource;
        this.jdbcTemplate=new JdbcTemplate(dataSource);
        this.namedParametersJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
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

    public Circle getCircleforId(int circleId){
        String sql = "SELECT * FROM CIRCLE WHERE id=?";
        return  jdbcTemplate.queryForObject(sql,new Object[]{circleId},new CircleMapper());
    }

    public List<Circle> getAllCircles(){
        String sql = "SELECT * FROM CIRCLE";
        return jdbcTemplate.query(sql,new CircleMapper());
    }

    public void insertCircle(Circle circle){
        String sql ="INSERT INTO CIRCLE (ID,NAME)VALUES  (:id, :name )";
        SqlParameterSource namedParameters =new MapSqlParameterSource("id",circle.getId())
                .addValue("name",circle.getName());
        namedParametersJdbcTemplate.update(sql,namedParameters );
    }

    public void createTriangleTable(){
        String sql ="CREATE TABLE TRIANGLE (ID INTEGER ,NAME VARCHAR(50))";
        jdbcTemplate.execute(sql);
    }
    private static final class CircleMapper implements RowMapper<Circle>{

        @Nullable
        @Override
        public Circle mapRow(ResultSet resultSet, int i) throws SQLException {
            Circle circle=new Circle();
            circle.setId(resultSet.getInt("id"));
            circle.setName(resultSet.getString("name"));
            return circle;
        }
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

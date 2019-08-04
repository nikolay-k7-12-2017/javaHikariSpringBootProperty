package daoConnectData;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import personTable.Person;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.sql.DataSource;
import java.util.List;

@Component
public class ReadDatesMsSql {

    private JdbcTemplate jdbcTemplateObject;
    @Autowired
    private static EntityManager em ;

    public void setDataSource() {
  //     this.jdbcTemplateObject = new JdbcTemplate(dataSource);

    }


    public static void main(String[] args) {
        ReadDatesMsSql readDatesMsSql =new ReadDatesMsSql();
        readDatesMsSql.setDataSource();

        Query query = em.createNativeQuery("SELECT * FROM client");
        List<Person> result = query.getResultList();
        System.out.println(result);
    }


}

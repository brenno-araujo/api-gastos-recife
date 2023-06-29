package database;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.gastosrecife.apigastosrecife.model.ExpenseModel;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class HibernateConfig {

    @Bean
    public SessionFactory sessionFactory() {
        Configuration configuration = new Configuration();

        // Configurações do banco de dados
        configuration.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/despesas_2017");
        configuration.setProperty("hibernate.connection.username", "brenno");
        configuration.setProperty("hibernate.connection.password", "eloquent");

        // Mapeamento de entidades (models)
        configuration.addAnnotatedClass(ExpenseModel.class);
        // Adicione outras classes de modelo aqui, se necessário

        return configuration.buildSessionFactory();
    }
}

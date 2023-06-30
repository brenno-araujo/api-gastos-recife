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

        // Mapeamento de entidades (models)
        configuration.addAnnotatedClass(ExpenseModel.class);
        // Adicione outras classes de modelo aqui, se necessário

        return configuration.buildSessionFactory();
    }
}

/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.config;

import java.util.Properties;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author jparis
 */
@Configuration
//@ComponentScan(basePackages = "com.curso.spring.tarjetaFidelizacion.persistence")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.curso.spring.tarjetaFidelizacion.persistence")
public class PersistenceConfig {
	
	// RUTA DE ENTIDADES
	private static final String PATH_ENTITIES = "com.curso.spring.tarjetaFidelizacion.persistence.entities";
	
	/*** DATA JPA ***/
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
		return new JpaTransactionManager(emf);
	}

	@Bean
	@Autowired
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean localEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();

		localEntityManagerFactoryBean.setDataSource(dataSource);
		localEntityManagerFactoryBean.setPackagesToScan(PATH_ENTITIES);
		localEntityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		Properties jpaProperties = new Properties();

		jpaProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.DerbyDialect");
		jpaProperties.setProperty("hibernate.show_sql", "true");
		jpaProperties.setProperty("hibernate.format_sql", "true");
		jpaProperties.setProperty("hibernate.hbm2ddl.auto", "create"); // validate | update | create | create-drop

		localEntityManagerFactoryBean.setJpaProperties(jpaProperties);

		return localEntityManagerFactoryBean;
	}

	
	/*** HIBERNATE ***/
	/*
	@Bean
	public HibernateTransactionManager transactionManager (SessionFactory sessionFactory) {
		return new HibernateTransactionManager(sessionFactory);
	}
	
	@Bean
	@Autowired
	public LocalSessionFactoryBean sessionFactory (DataSource dataSource) {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		
		localSessionFactoryBean.setDataSource(dataSource);
		//localSessionFactoryBean.setAnnotatedPackages(PATH_ENTITIES);
		localSessionFactoryBean.setPackagesToScan(PATH_ENTITIES);
		
		Properties hibernateProperties = new Properties();
		
		//hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect"); // BBDD MySQL
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.DerbyDialect"); // BBDD Derby
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		hibernateProperties.setProperty("hibernate.format_sql", "true");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "create"); // validate (default) | update | create | create-drop
		
		localSessionFactoryBean.setHibernateProperties(hibernateProperties);
		
		return localSessionFactoryBean;
	}
	*/
	
	/*
	// Gestionado por la propia aplicación de SPRING
	@Bean
	public DataSource dataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl("jdbc:derby://localhost:1527/jndi");
		basicDataSource.setUsername("root");
		basicDataSource.setPassword("root");
		basicDataSource.setDriverClassName("org.apache.derby.jdbc.ClientDriver"); // BBDD Derby
		
		return basicDataSource;
	}
	*/
	
	/**
	 * Busca en el árbol de recursos JNDI un recurso con path = jdbc/MyLocalDB y lo introducimos como bean de Spring
	 * 
	 * @param jndiName
	 * @return
	 */
	@Bean
	@Resource(name="jdbc/MyLocalDB")
	//public DataSource dataSource(@Value("${db.jndi}") String jndiName) {
	public DataSource dataSource() {
		JndiDataSourceLookup lookup = new JndiDataSourceLookup();
		lookup.setResourceRef(true);
		return lookup.getDataSource("jdbc/MyLocalDB");
		//return lookup.getDataSource("jdbc:mysql://localhost:3306/tarjeta_fidelizacion");
	}
	

}
package guru.springframework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;

@Configuration()
public class PropertyConfig {

	@Value("${guru.username}")
	String user;
	
	@Value("${guru.password}")
	String password;
	
	@Value("${guru.dburl}")
	String url;
	
	@Value("${guru.jms.username}")
	String jmsUsername;
	
	@Value("${guru.jms.password}")
	String jmsPassword;
	
	@Value("${guru.jms.url}")
	String jmsUrl;
	
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource source = new FakeDataSource();
		source.setUser(user);
		source.setPassword(password);
		source.setUrl(url);
		
		return source;
	}
	
	@Bean
	public FakeJmsBroker fakeJmsBroker() {
		FakeJmsBroker broker = new FakeJmsBroker(); 
		broker.setUsername(jmsUsername);
		broker.setPassword(jmsPassword);
		broker.setUrl(jmsUrl);
		
		return broker;
	}

}

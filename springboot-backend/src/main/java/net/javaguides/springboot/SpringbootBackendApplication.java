package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception { 
		this.userRepository.save(new User("Ramesh", "Fadatare", "ramesh@gmail.com"));
		this.userRepository.save(new User("Sunil", "Fero", "sunil@gmail.com"));
		this.userRepository.save(new User("Aasha", "Bosh", "aasha@gmail.com"));
		this.userRepository.save(new User("Deepika", "Ravi", "deepika@gmail.com"));
		this.userRepository.save(new User("Sonu", "Fada", "sonu@gmail.com"));
		this.userRepository.save(new User("Aish", "F", "aish@gmail.com"));
		this.userRepository.save(new User("Ramesh", "Naidu", "rameshnaidu@gmail.com"));
		this.userRepository.save(new User("Sunil", "Devi", "sunildevi@gmail.com"));
		this.userRepository.save(new User("Aorora", "Matare", "aorora@gmail.com"));
	}
}

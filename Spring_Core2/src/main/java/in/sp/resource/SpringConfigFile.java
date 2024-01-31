package in.sp.resource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import com.becoder.Spring_Core2.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Student stdId1()
	{
		Student std=new Student();
		
		std.setName("Ankit");
		std.setRollno(103);
		std.setEmail("ankit@gmail.com");
		
		
		return std;
		
	}

}

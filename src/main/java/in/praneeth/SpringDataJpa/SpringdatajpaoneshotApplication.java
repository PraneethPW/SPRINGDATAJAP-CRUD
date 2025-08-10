package in.praneeth.SpringDataJpa;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import in.praneeth.Entity.Student;

import in.praneeth.Service.StudentServiceInterface;

@SpringBootApplication
@EntityScan(basePackages = "in.praneeth.Entity")
@ComponentScan(basePackages = "in.praneeth.Service")
public class SpringdatajpaoneshotApplication {

	public static void main(String[] args) {
	ApplicationContext ap	 =  SpringApplication.run(SpringdatajpaoneshotApplication.class, args);
     StudentServiceInterface serve=ap.getBean(StudentServiceInterface.class);
       Student stud = new Student();
       stud.setRollNo(02);
       stud.setName("Pranay");
       stud.setSection("A");
       stud.setSchoolName("BIS");
       
      String status = serve.InjectValues(stud);  
      System.out.println(status);
      
      System.out.println("*********************************************************************************************************************");
      
     Iterable<Student> iterable= serve.findAll();
     iterable.forEach(System.out::println);
     
     System.out.println("*********************************************************************************************************************");
     
     Optional<Student> opt=  serve.findById(02);
       System.out.println(opt);
       
       System.out.println("*********************************************************************************************************************");
       
       String result =serve.deleteById(01);
       System.out.println(result);
       
       System.out.println("*********************************************************************************************************************");
       
       Student stud1=new Student();
       stud1.setRollNo(02);
       String status2=serve.deleteObject(stud1);
       System.out.println(status2);
       
     
     
	}

}

package in.praneeth.Service;


import java.util.Optional;

import in.praneeth.Entity.Student;

public interface StudentServiceInterface {
	
	public String InjectValues(Student student);
	public Iterable<Student> findAll();
	public Optional<Student> findById(Integer RollNo);
	public String deleteById(Integer RollNo);
	public String deleteObject(Student student);

}

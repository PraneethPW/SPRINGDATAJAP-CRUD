package in.praneeth.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.praneeth.Entity.Student;
import in.praneeth.SpringDataJpa.StudentRepoInterface;
@Service
public class StudentServiceClass implements StudentServiceInterface {
	@Autowired
	private StudentRepoInterface repo;

	@Override
	public String InjectValues(Student student) {
		Student stud=null;
      if(student !=null)
    	stud =  repo.save(student);
		return stud!=null ? "INJECTION SUCCESFULL WITH RollNo ::" + student.getRollNo() :  "INJECTION UNSUCCESFULL";
	}

	@Override
	public Iterable<Student> findAll() {
		 return repo.findAll();
	}

	@Override
	public Optional<Student> findById(Integer RollNo) {
		return repo.findById(RollNo);
	 
	}

	@Override
	public String deleteById(Integer RollNo) {
		Optional<Student> opt2=repo.findById(RollNo);
		if(opt2!=null) {
			repo.deleteById(RollNo);
			return "SUCCESFULL DELETION";
		}else {
			return "RECORD NOT FOUND";
		}
		
	}

	@Override
	public String deleteObject(Student student) {
	
			Optional<Student> opt1=repo.findById(student.getRollNo());
			if(opt1!=null) {
				repo.delete(student);
				return "SUCCESSFUL DELTION OF OBJECT";
			}else {
				return "NO RECORD FOUND";
			}
	
	}

}

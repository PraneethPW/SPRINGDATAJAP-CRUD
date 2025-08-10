package in.praneeth.SpringDataJpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.praneeth.Entity.Student;
@Repository
public interface StudentRepoInterface extends CrudRepository<Student, Integer> {

}

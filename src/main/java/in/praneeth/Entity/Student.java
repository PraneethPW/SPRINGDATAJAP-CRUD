package in.praneeth.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "STUDENT")
public class Student {
	@Id
	@Column(name = "ROLLNO")
	private Integer rollNo;
	@Column(name = "NAME")
	private  String name;
	@Column(name = "SECTION")
	private  String section;
	@Column(name = "SCHOOLNAME")
	private String schoolName;
	
	static {
		System.out.println("STUDENT CLASS CREATED");
	}
	public Student() {
		System.out.println("STUDENT OBJECT CREATED");
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", section=" + section + ", schollName=" + schoolName
				+ "]";
	}
	/**
	 * @return the rollNo
	 */
	public Integer getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the section
	 */
	public String getSection() {
		return section;
	}
	/**
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}
	/**
	 * @return the schollName
	 */
	public String getSchoolName() {
		return schoolName;
	}
	/**
	 * @param schollName the schollName to set
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	
}

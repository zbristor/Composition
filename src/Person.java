import java.util.Arrays;
import java.util.Collections;

import javax.management.relation.Role;

//Person.java
public class Person {
	//composition has-a relationship
	private Job job;
	private Education education;
	public Person(){
	
    this.job=new Job();
    this.education=new Education();
    job.setSalary(1000L);
    job.setId(99999);
    job.setRole("Manager");
    education.setSchools("UMD UMD UMD UMD UMD UMD PSU PSU PSU PSU PSU PSU PSU");
	}
	@Override
	public String toString()
	{
		
		job.setId(11222);
		job.setRole("Software Developer");
		job.setSalary(100000);
		
		//education.setSchools("FSU\tFSU\tFSU\tFSU\tWSU\tWSU\tWSU\tWSU\tWSU\tMIT");
		return education.toString()+job.toString();
	}

	/*
public long getSalary() {
    return job.getSalary();
}	"FSU\t"+"FSU\t"+"FSU\t"+"FSU\t"+"WSU\t"+"WSU\t"+"WSU\t"+"WSU\t"+"WSU"
"Software Developer",100000,11222
	 */
}
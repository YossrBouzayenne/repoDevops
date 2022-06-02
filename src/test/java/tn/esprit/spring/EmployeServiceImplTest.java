package tn.esprit.spring;


import static org.junit.Assert.assertNotNull;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.services.IEmployeService;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class EmployeServiceImplTest {
	@Autowired
	IEmployeService service;
	
	@Test
	public void testAddEmployee() {	
	Employe e = new Employe();
	e.setEmail("majallouz@vermeg.com");
	e.setNom("JALLOUZ");
	e.setPrenom("Mohamed Ali");
	int employeeId = service.addOrUpdateEmploye(e);
	//log.trace("trace : emplye added sucessfuly !");
	int id = 1;
	if( "".equals(service.getEmployePrenomById(employeeId).trim())) 	
	//log.error("we don't have departement with this " + id);
	
	assertNotNull(service.getEmployePrenomById(employeeId));
	//log.info("this is one employee of  " + service.getAllEmployes().size() +" employees");	
	//log.warn("********************************End Method Test Add Employee ******************************************************");

	}
	


}
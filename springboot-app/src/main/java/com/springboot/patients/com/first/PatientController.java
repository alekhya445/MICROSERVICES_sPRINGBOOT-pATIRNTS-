package com.springboot.patients.com.first;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController implements ErrorController {

	private static final String PATH = "/error";

	@Autowired

	private PatientsService patientsService;

	@PostMapping("/addPatients")
	public String addPatients(@RequestBody Patients patients) {
		return patientsService.savePatients(patients);

	}

	@GetMapping("/patients")
	public List<Patients> findAllPatients() {
		return patientsService.getAllPatients();
	}

	//
	@GetMapping("/patients/{id}")
	public Patients findPatientsById(@PathVariable int id) {
		return patientsService.getPatientsById(id);
	}

	@PutMapping("/update")
	public Patients updatePatients(@RequestBody Patients patients) {
		return patientsService.updatePatients(patients);
	}

	@DeleteMapping("/delete/{id}")
	public String delPatients(@PathVariable int id) {
		return patientsService.delPatients(id);
	}

	@GetMapping("/error")
	public String defaultErrorPage() {
		return "Requested URL Not Found!!!!";
	}
	
	@GetMapping("/retrive/{name}")
	public List<Patients> getPatientsByName(@PathVariable String name) {
		return patientsService.getPatientsByName(name);
		
	}

	// Unimplemented method for path for error URL//

	public String getErrorPath() {
		// TODO Auto-generated method stub
		return PATH;
	}

}

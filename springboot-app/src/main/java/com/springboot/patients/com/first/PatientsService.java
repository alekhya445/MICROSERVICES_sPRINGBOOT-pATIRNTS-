package com.springboot.patients.com.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientsService {

	@Autowired
	private PatientsDao patientsDao;

	public String savePatients(Patients patients) {
		// Patients pt= patientsDao.save(patients);
		// if(pt==null)
		// return null;
		// else
		// return pt;
		patientsDao.save(patients);
		return "Succesfully Added Patients Record";

	}
	//
	// public List<Patients> savePatients(List<Patients> patientss) {
	// return (List<Patients>) patientsDao.saveAll(patientss);
	// }

	public List<Patients> getAllPatients() {
		// List<Patients> p= new ArrayList<>();
		// patientsDao.findAll().forEach(get->p.add(get));
		return (List<Patients>) patientsDao.findAll();
		// return p ;

	}

	public Patients getPatientsById(int id) {
		// Optional<Patients> pt1= patientsDao.findById(id);
		// if(pt1.isPresent())
		//
		// return pt1;
		// else
		// return null;
		return patientsDao.findById(id).orElse(null);

	}

	public String delPatients(int id) {
		patientsDao.deleteById(id);
		return "Successfully  Removed Patient Record  No : " + id;
	}

	public Patients updatePatients(Patients patients) {
		Patients oldPatients = patientsDao.findById(patients.getId()).orElse(null);
		oldPatients.setId(patients.getId());
		oldPatients.setName(patients.getName());
		oldPatients.setAddress(patients.getAddress());
		return patientsDao.save(patients);

	}
	
	public List<Patients> getPatientsByName(String name) {
		return patientsDao.findByName(name);
		
	}
}

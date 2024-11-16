package com.cdc.service;

import com.cdc.entity.Doctor;

public interface IDoctorService {
	public String registerDoctor(Doctor doctor);

	public String registerGroupOfDoctors(Iterable<Doctor> doctors);

	public boolean isCustomerAvailable(Integer id);

	public long fetchDoctorsCount();

	public Iterable<Doctor> showAllDoctors();

}

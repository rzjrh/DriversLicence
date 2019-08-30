package com.RezaAk.web.DriversLicence.services;

import org.springframework.stereotype.Service;

import com.RezaAk.web.DriversLicence.models.License;
import com.RezaAk.web.DriversLicence.repositories.LicenseRepository;

@Service
public class LicenseService {
	private static String newNumber = "000000";
	private LicenseRepository licenseRepository;
	private LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	public void addLicense(License license) {
		license.setNumber(newNumber);
		newNumber = String.format("%06d", Integer.parseInt(newNumber)+1);
		licenseRepository.save(license);
	}
	public License getLicenseById(Long id) {
		return licenseRepository.getLicenseByUserId(id);
	}
	public void deleteLicense(Long id) {
		licenseRepository.deleteById(id);
	}
}
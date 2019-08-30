package com.RezaAk.web.DriversLicence.repositories;

import org.springframework.data.repository.CrudRepository;

import com.RezaAk.web.DriversLicence.models.License;

public interface LicenseRepository extends CrudRepository <License, Long> {

	License getLicenseByUserId(Long id);

}
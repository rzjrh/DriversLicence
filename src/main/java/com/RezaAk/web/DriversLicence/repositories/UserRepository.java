package com.RezaAk.web.DriversLicence.repositories;

import org.springframework.data.repository.CrudRepository;

import com.RezaAk.web.DriversLicence.models.User;

public interface UserRepository extends CrudRepository <User, Long> {

}
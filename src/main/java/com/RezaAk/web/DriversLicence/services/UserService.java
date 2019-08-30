package com.RezaAk.web.DriversLicence.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

//import com.RezaAk.web.DriversLicence.models.License;
import com.RezaAk.web.DriversLicence.models.User;
import com.RezaAk.web.DriversLicence.repositories.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;
	private UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	public void addUser(User user) {
		userRepository.save(user);
	}
	public List<User> getAllUsers(){
		return (List<User>) userRepository.findAll();
	}
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
	
	public User findPerson(Long id) {
		Optional<User> findPerson = userRepository.findById(id);
		if(findPerson.isPresent()) {
			System.out.println(findPerson.get());
			return findPerson.get();
		}else {
			return null;
		}
	}
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
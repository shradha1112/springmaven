package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.RegisterRequest;
import model.User;
import repository.UserRepository;
@Service
public class AuthService {
@Autowired
private UserRepository userRepository;
	public void signup(RegisterRequest registerRequest) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUserName(registerRequest.getUsername());
		user.setPassword(registerRequest.getPassword());
		user.setEmail(registerRequest.getEmail());
		userRepository.save(user);
		
	}

}

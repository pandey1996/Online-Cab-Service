package com.tola.user.Service.Implementation;

import com.tola.user.JPARepository.User;
import com.tola.user.JPARepository.UserRepository;
import com.tola.user.Service.RegistrationService;
import com.tola.user.Utils.UserUtils;
import com.tola.user.api.request.RegistrationRequest;
import com.tola.user.api.response.RegistrationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public RegistrationResponse register(RegistrationRequest registrationRequest) {
        User user=new User(UserUtils.generateUserId(10),UserUtils.generateUserId(18),registrationRequest.getFirstName(),registrationRequest.getMiddleName(),
                registrationRequest.getLastName(), registrationRequest.getMobile(), registrationRequest.getAddress1(),
                registrationRequest.getAddress2(), registrationRequest.getEmail(), registrationRequest.getPassword(), registrationRequest.getDob());
        userRepository.save(user);
        return new RegistrationResponse(user.getUserId(),user.getInternalUserId());
    }
}

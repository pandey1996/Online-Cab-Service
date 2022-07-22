package com.tola.user.Service;

import com.tola.user.api.request.RegistrationRequest;
import com.tola.user.api.response.RegistrationResponse;
import org.springframework.context.annotation.Bean;

public interface RegistrationService{
    public RegistrationResponse register(RegistrationRequest registrationRequest);
}

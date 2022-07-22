package com.tola.user.Controller;

import com.tola.user.Service.RegistrationService;
import com.tola.user.api.request.RegistrationRequest;
import com.tola.user.api.response.RegistrationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/RegistrationService")
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;

    @PostMapping(value = "/register")
    @ResponseBody
    public RegistrationResponse register(@RequestBody RegistrationRequest registrationRequest){
        return registrationService.register(registrationRequest);
    }

}

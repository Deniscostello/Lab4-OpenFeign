package ie.atu.userservice;

import org.springframework.beans.factory.annotation.Autowired;

public class UserController {
    @Autowired
    public UserController(RegistrationServiceClient registrationserviceclient){
        this.registrationserviceclient=registrationserviceclient;
    }
}

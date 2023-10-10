package ie.atu.userservice;

import org.springframework.beans.factory.annotation.Autowired;

public class UserController {
    private RegistrationServiceClient registrationServiceClient;

    @Autowired
    public UserController(RegistrationServiceClient registrationServiceClient){
        this.registrationServiceClient=registrationServiceClient;
    }

}

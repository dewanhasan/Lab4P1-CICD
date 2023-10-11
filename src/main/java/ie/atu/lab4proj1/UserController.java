package ie.atu.lab4proj1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    private RegistrationServiceClient registrationServiceClient;

    @Autowired
    public void injectedConstructor(RegistrationServiceClient registrationServiceClient){
        this.registrationServiceClient = registrationServiceClient;
    }

    @PostMapping("confirm-and-register")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Map<String, String> confirmAndRegister(@RequestBody UserDetails userDetails){
        String confirm = registrationServiceClient.someDetails(userDetails);
        Map<String, String> responseMessage = new HashMap<>();
        responseMessage.put("message", confirm);
        System.out.println("name " +userDetails.getName());
        System.out.println("email " +userDetails.getEmail());
        return responseMessage;

    }
}

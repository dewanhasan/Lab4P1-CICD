package ie.atu.lab4proj1;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "registration-service", url = "http://localhost:8081")
public interface RegistrationServiceClient {
    @PostMapping("/register")
    String someDetails(@RequestBody UserDetails userDetails);
}

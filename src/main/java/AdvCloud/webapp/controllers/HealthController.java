package AdvCloud.webapp.controllers;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/v1/health-check")
public class HealthController {

    @GetMapping
    public ResponseEntity<HealthStatus> getHealthCheck(){
        HealthStatus status = new HealthStatus();
        status.setStatus(200);
        status.setMessage("Success");
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

}

class HealthStatus{
    private int status;
    private String message;

    public int getStatus(){
        return status;
    }

    public String getMessage(){
        return message;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public void setMessage(String message){
        this.message = message;
    }
}

package br.com.football.fantasy.footballFantasy.controllers.status;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")

public class HealthChecker {

        @GetMapping
        public ResponseEntity<String> CheckStatus(){
         return new ResponseEntity<>("All are ok", HttpStatus.OK);
        }
}

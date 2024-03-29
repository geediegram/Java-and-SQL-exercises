package africa.semicolon.marketPlace.controllers;

import africa.semicolon.marketPlace.dtos.requests.RegisterListerRequest;
import africa.semicolon.marketPlace.exceptions.MarketPlaceException;
import africa.semicolon.marketPlace.services.ListerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/lister")
public class ListerController {
    @Autowired
    private ListerService listerService;

    @PostMapping("/")
    public ResponseEntity<?> register(@RequestBody RegisterListerRequest request){
        try{
            return new ResponseEntity<>(listerService.registerLister(request), HttpStatus.CREATED);
        }
        catch (MarketPlaceException exp){
            return new ResponseEntity<>(exp.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}

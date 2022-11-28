package africa.semicolon.marketPlace.services;

import africa.semicolon.marketPlace.data.models.Lister;
import africa.semicolon.marketPlace.data.repositories.ListerRepository;
import africa.semicolon.marketPlace.dtos.requests.RegisterListerRequest;
import africa.semicolon.marketPlace.dtos.responses.RegisterListerResponse;
import africa.semicolon.marketPlace.exceptions.DuplicateEmailException;
import africa.semicolon.marketPlace.exceptions.MarketPlaceException;
import africa.semicolon.marketPlace.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ListerServiceImpl implements ListerService{
    @Autowired
    private ListerRepository listerRepository;

    @Override
    public RegisterListerResponse registerLister(RegisterListerRequest request) {
        //validate that user does not exist before (email)
        Optional<Lister> optionalLister = listerRepository.findListersByEmailAnd(request.getEmail());
        if(optionalLister.isPresent()) throw new DuplicateEmailException(request.getEmail() + " already exist");

        //create lister from request
        Lister lister = ModelMapper.map(request);
        // save lister
        Lister savedLister = listerRepository.save(lister);
        //create response from saved lister
        RegisterListerResponse response = ModelMapper.map(savedLister);
        //return response
        return  response;
        // else throw exception
    }
}

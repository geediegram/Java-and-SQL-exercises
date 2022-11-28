package africa.semicolon.marketPlace.utils;

import africa.semicolon.marketPlace.data.models.Lister;
import africa.semicolon.marketPlace.dtos.requests.RegisterListerRequest;
import africa.semicolon.marketPlace.dtos.responses.RegisterListerResponse;

import java.time.format.DateTimeFormatter;

public class ModelMapper {
    public static Lister map(RegisterListerRequest request){
        Lister lister = new Lister();
        lister.setPhoneNumber(request.getPhoneNumber());
        lister.setEmail(request.getEmail());
        lister.setLocation(request.getLocation());
        lister.setFullName(request.getFullName());

        return lister;
    }

    public static RegisterListerResponse map(Lister lister){
        RegisterListerResponse response = new RegisterListerResponse();
        response.setDbId(lister.getId());
        response.setDateRegistered(DateTimeFormatter.ofPattern("E, dd/MM/yyyy, hh:mm a").format(lister.getDateRegistered()));

        return  response;
    }
}

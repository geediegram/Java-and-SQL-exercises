package africa.semicolon.marketPlace.services;

import africa.semicolon.marketPlace.dtos.requests.RegisterListerRequest;
import africa.semicolon.marketPlace.dtos.responses.RegisterListerResponse;

public interface ListerService {
    public RegisterListerResponse registerLister(RegisterListerRequest request);
}

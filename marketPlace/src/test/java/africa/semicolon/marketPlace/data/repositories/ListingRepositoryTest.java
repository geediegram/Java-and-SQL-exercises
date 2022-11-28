package africa.semicolon.marketPlace.data.repositories;

import africa.semicolon.marketPlace.data.models.Condition;
import africa.semicolon.marketPlace.data.models.Listing;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class ListingRepositoryTest {

    @Autowired
    private  ListingRepository listingRepository;

    @Test
    public void saveListingTest(){
        Listing listing = new Listing();
        listing.setCondition(Condition.USED);
        listing.setName("Singlet");
        listing.setShortDescription("Nigeria made singlet");
        listing.setLongDescription("White cotton singlet");
        Listing savedListing = listingRepository.save(listing);
        assertEquals("White cotton singlet", savedListing.getLongDescription());

    }
}
package africa.semicolon.marketPlace.data.repositories;

import africa.semicolon.marketPlace.data.models.Lister;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.junit.jupiter.api.Assertions.*;
@DataMongoTest
class ListerRepositoryTest {
    @Autowired
    private ListerRepository listerRepository;

    @Test
    public void repositorySaveTest(){
        Lister lister = new Lister();
        lister.setFullName("Ahmad Adeniyi");
        lister.setEmail("amhad@gmail.com");
        lister.setLocation("Sabo");
        lister.setPhoneNumber("090123456");
        Lister savedLister = listerRepository.save(lister);
        assertEquals("Ahmad Adeniyi", savedLister.getFullName());
        assertNotNull(savedLister.getId());
    }
}
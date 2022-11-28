package Practice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MP3Test {

    MP3 mp3;

    @BeforeEach
    void setUp() {
        mp3 = new MP3(false, "panasonic", 12);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatMP3IsOffAndCanComeOn(){
        mp3.getIsOn();
        assertEquals(false, mp3.getIsOn());
        mp3.setIsOn(true);
        assertEquals(true, mp3.getIsOn());
    }

    @Test
    void thatThatMP3HasProductName(){
        mp3.getProductName();
        assertEquals("panasonic", mp3.getProductName());
        mp3.setProductName("Sony");
        assertEquals("Sony", mp3.getProductName());
    }

    @Test
    void testThatMP3VolumeCanBeGottenAndSet(){
        mp3.getVolume();
        assertEquals(12, mp3.getVolume());
        mp3.setVolume(13);
        assertEquals(13, mp3.getVolume());
    }

    @Test
    void testThatVolumeCanBeIncreased(){
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        mp3.setVolumeIncrease();
        assertEquals(38, mp3.getVolume());
    }

    @Test
    void testThatVolumeCanBeDecreased(){
        mp3.setVolumeDecrease();
        mp3.setVolumeDecrease();
        mp3.setVolumeDecrease();
        mp3.setVolumeDecrease();
        mp3.setVolumeDecrease();
        mp3.setVolumeDecrease();
        mp3.setVolumeDecrease();
        mp3.setVolumeDecrease();
        mp3.setVolumeDecrease();
        mp3.setVolumeDecrease();
        assertEquals(2, mp3.getVolume());
    }
}
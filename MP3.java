package Practice;

public class MP3 {
    private boolean isOn;
    private String productName;
    private int volume;

    public MP3(boolean isOn, String productName, int volume){
        this.isOn = isOn;
        this.productName = productName;
        this.volume = volume;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setVolumeIncrease() {
        if(volume < 100) {
            volume = volume + 1;
        }
    }

    public void setVolumeDecrease() {
        if(volume > 1){
            volume = volume - 1;
        }
    }
}

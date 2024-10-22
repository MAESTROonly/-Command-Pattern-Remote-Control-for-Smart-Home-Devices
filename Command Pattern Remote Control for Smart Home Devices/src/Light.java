public class Light {
    private int brightness;

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println("Light brightness set to " + brightness);
    }

    public int getBrightness() {
        return brightness;
    }
}


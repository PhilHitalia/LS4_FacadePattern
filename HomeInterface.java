public class HomeInterface {
    private HomeService light;
    private HomeService tv;
    private HomeService airConditioning;

    public HomeInterface() {
        this.light = new Light();
        this.tv = new TV();
        this.airConditioning = new AirConditioning();
    }
    public void turnOnAll() {
        System.out.println("Turning on all home services...");
        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }
    public void turnOffAll() {
        System.out.println("Turning off all home services...");
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}

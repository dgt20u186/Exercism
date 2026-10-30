public class JedliksToyCar {
    private int batteryPercentage = 100;
    private int drivenDistance = 0;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.drivenDistance + " meters";
    }

    public String batteryDisplay() {
        if (this.batteryPercentage <= 0) {
            return "Battery empty";
        }
        return "Battery at " + this.batteryPercentage + "%";
    }

    public void drive() {
        if (this.batteryPercentage > 0) {
            this.batteryPercentage -= 1;
            this.drivenDistance += 20;
        }
    }
}

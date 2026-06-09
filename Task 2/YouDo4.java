class Sensor {
    String name;
    int batteryLevel;

    
    Sensor(String name, int batteryLevel) {
        this.name = name;
        this.batteryLevel = batteryLevel;
    }

    void charge() {
        batteryLevel = 100;
        System.out.println("Sensor fully charged");
    }
}


public class Main4 {
    public static void main(String[] args) {
        Sensor mySensor = new Sensor("Thermal_01" , 45);

        System.out.println("Before charge: " + mySensor.batteryLevel + "%");
        mySensor.charge();

        System.out.println("After charge: " + mySensor.batteryLevel + "%");
        
    }
}


package driver;

public abstract class Driver {
    private final String fullName;
    private final boolean driversLicense;
    private int drivingExperience;

    public Driver(String fullName, boolean driversLicense, int drivingExperience) {
        if(fullName == null || fullName.isBlank()){
            this.fullName = "default";
        }else{
            this.fullName = fullName;
        }
        this.driversLicense = driversLicense;
        if (drivingExperience < 0){
            this.drivingExperience = 0;
        }else{
            this.drivingExperience = drivingExperience;
        }
    }

    public String getFullName() {
        return this.fullName;
    }

    public boolean isDriversLicense() {
        return this.driversLicense;
    }

    public int getDrivingExperience() {
        return this.drivingExperience;
    }

    public void startMotion(){
        System.out.println("Start motion.");
    }

    public void stopMotion(){
        System.out.println("Stop motion.");
    }

    public void fillUpCar(){
        System.out.println("Fill up the car.");
    }
}

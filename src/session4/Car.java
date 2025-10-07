package session4;

public class Car {
    public String color = "Black";
    private int fuel = 100;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuel(int fuel) {

        return fuel;
    }

    public void setFuel(int fuel) {
        if (fuel < 0) {
            System.out.println("bensin tidak boleh dibawah 0");
        }
        this.fuel = fuel;
    }
}

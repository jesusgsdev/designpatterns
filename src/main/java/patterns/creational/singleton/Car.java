package patterns.creational.singleton;

public class Car {

    private String brand;
    private Integer year;
    private Double hp;
    private String plateNumber;

    public Car() {
    }

    public Car(String brand, Integer year, Double hp, String plateNumber) {
        this.brand = brand;
        this.year = year;
        this.hp = hp;
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getHp() {
        return hp;
    }

    public void setHp(Double hp) {
        this.hp = hp;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}

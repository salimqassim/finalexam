package finalexam.task1;

public class Computer {

    private String brand;
    private int memory; // in GB
    private int ssd; // in GB
    private int hdd; // in GB

    // Constructor
    public Computer(String brand, int memory, int ssd, int hdd) {
        this.brand = brand;
        this.memory = memory;
        this.ssd = ssd;
        this.hdd = hdd;
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", memory=" + memory + "GB" +
                ", ssd=" + ssd + "GB" +
                ", hdd=" + hdd + "GB" +
                '}';
    }

    public static void main(String[] args) {
        Computer myComputer = new Computer("Dell", 16, 512, 1024);
        System.out.println(myComputer);
    }
}

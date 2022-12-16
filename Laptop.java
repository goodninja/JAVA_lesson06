package FinalTask;

public class Laptop {

    private String model; 
    private int displaySize; 
    private int RAMsize; 
    private int HDDcapacity; 
    private String operatingSystem; 
    private double weight; 
    private int batteryCapacity; 
    private int price; 
    
    public Laptop(String model, int displaySize, int RAMsize, int HDDcapacity, String operatingSystem,
    double weight, int batteryCapacity, int price) {
        this.model = model;
        this.displaySize = displaySize;
        this.RAMsize = RAMsize;
        this.HDDcapacity = HDDcapacity;
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.batteryCapacity = batteryCapacity;
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + displaySize;
        result = prime * result + RAMsize;
        result = prime * result + HDDcapacity;
        result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + batteryCapacity;
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (displaySize != other.displaySize)
            return false;
        if (RAMsize != other.RAMsize)
            return false;
        if (HDDcapacity != other.HDDcapacity)
            return false;
        if (operatingSystem == null) {
            if (other.operatingSystem != null)
                return false;
        } else if (!operatingSystem.equals(other.operatingSystem))
            return false;
        if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
            return false;
        if (batteryCapacity != other.batteryCapacity)
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("[Модель ноутбука: %s, размер дисплея: %d дюймов, объём ОЗУ: %d Гб, объём жёсткого диска: %d Гб, ОС: %s, вес ноутбука: %.1f кг, работа аккумулятора: до %d часов, цена: %d рублей]\n", 
        model, displaySize, RAMsize, HDDcapacity, operatingSystem, weight, batteryCapacity, price);
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getDisplaySize() {
        return displaySize;
    }
    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }
    public int getRAMsize() {
        return RAMsize;
    }
    public void setRAMsize(int RAMsize) {
        this.RAMsize = RAMsize;
    }
    public int getHDDcapacity() {
        return HDDcapacity;
    }
    public void setHDDcapacity(int HDDcapacity) {
        this.HDDcapacity = HDDcapacity;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String ooperatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}
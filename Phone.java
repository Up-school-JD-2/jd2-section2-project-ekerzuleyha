public class Phone {
    private String brand ;
    private String model ;
    private String serialNumber;
    private String storageSpace;
    private String operatingSystem;

    public Phone(String brand, String model, String serialNumber, String storageSpace, String operatingSystem) {
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.storageSpace = storageSpace;
        this.operatingSystem = operatingSystem;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(String storageSpace) {
        this.storageSpace = storageSpace;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", storageSpace='" + storageSpace + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}

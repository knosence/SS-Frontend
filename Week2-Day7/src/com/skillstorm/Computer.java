package com.skillstorm;

// will be a fully-encapsulated class
public class Computer {

    // properties
    // all are going to be private, only accessible from within the class

    private byte ramAmount;
    private String storageAmount;
    private boolean laptop;
    private String os;
    private String gpuBrand;

    public Computer(){
        super();
    }

    public Computer(byte ramAmount, String storageAmount, boolean laptop, String os, String gpuBrand) {
        super();
        this.ramAmount = ramAmount;
        this.storageAmount = storageAmount;
        this.laptop = laptop;
        this.os = os;
        this.gpuBrand = gpuBrand;
    }

    // to access private properties in the class, we use methods called Getters & Setters
    // a getter returns the value of the property
    // a setter assigns a value to the property

    // this is a getter
    public byte getRamAmount(){
        return this.ramAmount;
    }

    public String getStorageAmount() {
        return this.storageAmount;
    }

    public boolean isLaptop() {
        return this.laptop;
    }

    public String getOs(){
        return this.os;
    }

    public String getGpuBrand() {
        return this.gpuBrand;
    }

    // this is a setter


    public void setRamAmount(byte ramAmount) {
        this.ramAmount = ramAmount;
    }

    public void setStorageAmount(String storageAmount) {
        this.storageAmount = storageAmount;
    }

    public void setLaptop(boolean laptop) {
        this.laptop = laptop;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setGpuBrand(String gpuBrand) {
        this.gpuBrand = gpuBrand;
    }

    // this is an annotation
    // not always technically necessary
    // indicates the function of the following code
    @Override
    public String toString() {
        return "Computer{" +
                "ramAmount=" + ramAmount +
                ", storageAmount=" + storageAmount +
                ", isLaptop=" + laptop +
                ", os='" + os + '\'' +
                ", gpuBrand='" + gpuBrand + '\'' +
                '}';
    }
}

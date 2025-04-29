package org.boo4er;

public class Desktop extends Device {
    private String cpu;
    private String gpu;
    private int dram;
    private int ram;
    private String os;

    public Desktop(String brand,
                   String model,
                   String serialNumber,
                   String problemDescriprion,
                   String cpu,
                   String gpu,
                   int dram,
                   int ram,
                   String os) {
        super(brand, model, serialNumber, problemDescriprion);
        setCpu(cpu);
        setGpu(gpu);
        setDram(dram);
        setRam(ram);
        setOs(os);
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getDram() {
        return dram;
    }

    public void setDram(int dram) {
        this.dram = dram;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String getDeviceType() {
        return "Нвстольный компьютер";
    }
}

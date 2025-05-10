package org.programs.designpatterns;

class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;
    private String powerSupply;

    public Computer(String CPU, String RAM, String storage, String graphicsCard, String powerSupply) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
        this.powerSupply = powerSupply;
    }
    // Getters for all fields
    public String getCPU() {
        return CPU;
    }
    public String getRAM() {
        return RAM;
    }
    public String getStorage() {
        return storage;
    }
    public String getGraphicsCard() {
        return graphicsCard;
    }
    public String getPowerSupply() {
        return powerSupply;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                '}';
    }
    public static class ComputerBuilder {
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;
        private String powerSupply;

        public ComputerBuilder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }
        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder setPowerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }
        public Computer build() {
            return new Computer(CPU, RAM, storage, graphicsCard, powerSupply);
        }
    }
}

public class BuilderMain {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.ComputerBuilder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("Nvidia RTX 3080")
                .setPowerSupply("850W")
                .build();
        System.out.println(gamingPC);

        Computer officePC = new Computer.ComputerBuilder("Intel i5", "16GB")
                .setStorage("512GB SSD")
                .build();
        System.out.println(officePC);
    }
}

package org.programs.designpatterns;

// Subsystem classes
class CPU {
    public void start() {
        System.out.println("CPU started.");
    }
}

class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Memory loaded with data.");
    }
}

class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("Hard drive read data.");
        return new byte[size];
    }
}

// Facade class
class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.start();
        byte[] data = hardDrive.read(100, 1024);
        memory.load(1000, data);
        System.out.println("Computer started.");
    }
}

// Client interacts with facade, which in turn interacts with subsystem components
public class FacadeMain {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
    }
}
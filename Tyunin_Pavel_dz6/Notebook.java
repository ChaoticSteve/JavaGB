/**Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.*/
import java.util.Objects;

public class Notebook {
    private String brand;
    private String model;
    private String diagonal;
    private String operativeMemory;
    private String hardDisk;
    private String mySystem;
    private String color;

    public Notebook(String brand, String model, String diagonal, String operativeMemory, String hardDisk, String system, String color) {
        this.brand = brand;
        this.model = model;
        this.diagonal = diagonal;
        this.operativeMemory = operativeMemory;
        this.hardDisk = hardDisk;
        this.mySystem = system;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public String getOperativeMemory() {
        return operativeMemory;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public String getMySystem() {
        return mySystem;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook noteBook = (Notebook) o;
        return Objects.equals(brand, noteBook.brand) && Objects.equals(model, noteBook.model) && Objects.equals(diagonal, noteBook.diagonal) && Objects.equals(operativeMemory, noteBook.operativeMemory) && Objects.equals(hardDisk, noteBook.hardDisk) && Objects.equals(mySystem, noteBook.mySystem) && Objects.equals(color, noteBook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, diagonal, operativeMemory, hardDisk, mySystem, color);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", diagonal='" + diagonal + '\'' +
                ", operativeMemory='" + operativeMemory + '\'' +
                ", HDD='" + hardDisk + '\'' +
                ", OS='" + mySystem + '\'' +
                ", color='" + color + '\'' +
                '}' + '\n';
    }
}
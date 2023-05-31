package web.model;

public class Car {
    private String model;
    private String color;
    private String autoBody;

    public Car(String model, String color, String autoBody) {
        this.model = model;
        this.color = color;
        this.autoBody = autoBody;
    }

    public Car() {


    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAutoBody() {
        return autoBody;
    }

    public void setAutoBody(String autoBody) {
        this.autoBody = autoBody;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", color='" + color + '\'' +
                ", autoBody='" + autoBody + '\'' +
                '}';
    }
}

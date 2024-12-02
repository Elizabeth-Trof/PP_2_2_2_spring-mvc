package web.model;

public class Car {
    private String marka;
    private String seria;
    private String color;

    public Car(String marka, String seria, String color) {
        this.marka = marka;
        this.seria = seria;
        this.color = color;
    }

    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", seria='" + seria + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

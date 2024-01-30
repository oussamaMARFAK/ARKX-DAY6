public class Vehicle {
    private String mark;
    private int model;
    private double rentalprice ;

    public Vehicle() {
    }

    public Vehicle(String mark, int model, double rentalprice) {
        this.mark = mark;
        this.model = model;
        this.rentalprice = rentalprice;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getRentalprice() {
        return rentalprice;
    }

    public void setRentalprice(double rentalprice) {
        this.rentalprice = rentalprice;
    }
    public void displayinfo(){
        System.out.println("mark: "+getMark());
        System.out.println("model: "+getModel());
        System.out.println("Rentalprice: "+getRentalprice());
    }
}

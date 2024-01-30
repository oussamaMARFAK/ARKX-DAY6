public class Bike extends  Vehicle {
    private String type="bike";

    public Bike(String mark, int model, double rentalprice) {
        super(mark, model, rentalprice);
    }

    public String getType() {
        return type;
    }

    public void displayinfo(){
        System.out.println("vehicle information ");
       super.displayinfo();
        System.out.println("Rentalprice: "+getType());
    }
}

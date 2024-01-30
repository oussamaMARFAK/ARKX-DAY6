public class Car extends Vehicle{
    private String type="car";

    public Car(String mark, int model, double rentalprice) {
        super(mark, model, rentalprice);
        }
    public String getType() {
        return type;
    }

    public void displayinfo(){
        System.out.println("VEHICLE information ");
        super.displayinfo();
        System.out.println("type: "+getType());
    }
}

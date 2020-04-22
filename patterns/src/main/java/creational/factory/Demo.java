package creational.factory;

public class Demo {
    public static void main(String[] args) {
        PlaneLogistics planeLogistics = new PlaneLogistics();
        Transport plane = planeLogistics.createTransport();
        plane.deliver();

        TruckLogistics truckLogistics = new TruckLogistics();
        Transport truck = truckLogistics.createTransport();
        truck.deliver();
    }
}

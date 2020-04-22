package creational.factory;

public class PlaneLogistics extends LogisticsCreator {
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}

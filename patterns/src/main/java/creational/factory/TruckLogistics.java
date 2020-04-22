package creational.factory;

public class TruckLogistics extends LogisticsCreator {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

package brainatwork.pattern.creational.builder2;
/**
 * Builder implementation
 */
class CarBuilderImpl implements CarBuilder {
    private Car car;

    public CarBuilderImpl() {
        car = new Car();
    }

    @Override
    public CarBuilder setWheels(final int wheels) {
        car.setWheels(wheels);
        return this;
    }

    @Override
    public CarBuilder setColor(final String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}

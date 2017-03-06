package brainatwork.pattern.creational.builder2;

/**
 * The builder abstraction.
 */
interface CarBuilder {
    CarBuilder setWheels(final int wheels);

    CarBuilder setColor(final String color);

    Car build();
}
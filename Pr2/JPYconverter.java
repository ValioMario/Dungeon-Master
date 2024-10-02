package Pr2;

public class JPYconverter implements Converter{
    private static final double JPY_RUB = 0.65;

    @Override
    public double convertToRub(double value) {
        return value*JPY_RUB;
    }

    @Override
    public double convertTOCurrency(double rub) {
        return rub/JPY_RUB;
    }

    @Override
    public Type getType() {
        return Type.JPY;
    }
}

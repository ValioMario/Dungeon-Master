package Pr2;

public class USDconverter implements Converter{
    private static final double USD_RUB=90.0;

    @Override
    public double convertToRub(double value) {
        return value*USD_RUB;
    }

    @Override
    public double convertTOCurrency(double rub) {
        return rub/USD_RUB;
    }

    @Override
    public Type getType() {
        return Type.USD;
    }
}

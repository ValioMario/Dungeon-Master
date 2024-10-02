package Pr2;

public class CNYconverter implements Converter{
    private static final double CNY_RUB = 10.0;

    @Override
    public double convertToRub(double value) {
        return value*CNY_RUB;
    }

    @Override
    public double convertTOCurrency(double rub) {
        return rub/CNY_RUB;
    }

    @Override
    public Type getType() {
        return Type.CNY;
    }
}

package Pr2;

public interface Converter {
    double convertToRub(double value);
    double convertTOCurrency(double rub);
    Type getType();
}

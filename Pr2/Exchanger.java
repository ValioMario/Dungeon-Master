package Pr2;

import java.util.ArrayList;
import java.util.List;

public class Exchanger {
    private List<Converter> converters;

    public Exchanger(){
        converters = new ArrayList<>();
        converters.add(new CNYconverter());
        converters.add(new USDconverter());
        converters.add(new JPYconverter());
    }

    public double convert(double value, Type input, Type output){
        Converter inputConverter = findConverter(input);
        Converter outputConverter = findConverter(output);

        if(inputConverter == null ||)
    }
}

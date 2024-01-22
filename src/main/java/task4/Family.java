package task4;

import java.util.Map;

// За аналогією з List з уроку створіть у конфігурації XML бін Map.

public class Family {
    private static Map<String, Integer> mapProperty;

    public static Map<String, Integer> getMapProperty() {
        return mapProperty;
    }

    public void setMapProperty(Map<String, Integer> mapProperty) {
        this.mapProperty = mapProperty;
    }

}
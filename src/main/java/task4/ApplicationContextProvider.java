package task4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class ApplicationContextProvider {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("map.xml");
        Map<String, Integer> myMap = Family.getMapProperty();


        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

}





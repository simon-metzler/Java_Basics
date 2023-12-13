package at.sim.exercises.lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {

    private List<LightElement> lightElements;

    public Lamp(){
        this.lightElements = new ArrayList<>();
    }


    public void addLightElement(LightElement lightElement){
        this.lightElements.add(lightElement);
    }

    public void turnAllOn(){
        for (LightElement lightElement : this.lightElements){
            lightElement.turnOn();
        }
    }

    public double getOverallPowerUsage(){
        int elementsAmount = this.lightElements.size();
        int sum = 0;
        for (LightElement lightElement : this.lightElements){
            sum += lightElement.getPowerUsage();
        }
        double overallPowerUsage = sum / elementsAmount;
        return overallPowerUsage;

    }
    public void printNamesOfLightElements(){
        for (LightElement lightElement : this.lightElements) {
            System.out.println(lightElement.getName());
        }
    }

}

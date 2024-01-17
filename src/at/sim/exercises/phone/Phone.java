package at.sim.exercises.phone;

import at.sim.exercises.phone.parts.Camera;
import at.sim.exercises.phone.parts.PhoneFile;
import at.sim.exercises.phone.parts.SDCard;
import at.sim.exercises.phone.parts.SIMCard;

public class Phone {

    String color;
    SIMCard simCard;
    Camera camera;
    SDCard sdCard;

    public Phone(String color, SIMCard simCard, Camera camera, SDCard sdCard) {
        this.color = color;
        this.simCard = simCard;
        this.camera = camera;
        this.sdCard = sdCard;
    }


    public void takePicture(String extension, String name){
        PhoneFile picture = camera.makePicture(extension, name);
        if (picture.getSize() < sdCard.getFreeSpace()){
            sdCard.saveFile(picture);
        }
        else {
            System.out.println("Kein Speicherplatz mehr.");
        }



    }

    public void makeCall(String number){
        simCard.doCall(number);

    }

    public int getFreeSpace(){
        return sdCard.getFreeSpace();
    }

    public void printAllFiles(){
        sdCard.getPhoneFiles();

    }


}

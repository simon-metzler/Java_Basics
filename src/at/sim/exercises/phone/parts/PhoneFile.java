package at.sim.exercises.phone.parts;

public class PhoneFile {

    String extension;
    int size;
    String name;

    public PhoneFile(String extension, int size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }


    public void getInfo(){

    }

    public int getSize(){
        return size;
    }


}

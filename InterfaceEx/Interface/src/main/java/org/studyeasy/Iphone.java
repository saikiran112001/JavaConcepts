package org.studyeasy;

public class Iphone implements Phone{

    @Override
    public String processor(){
        return "A15";
    }

    @Override
    public int spaceInGB() {
        return 256;
    }
}

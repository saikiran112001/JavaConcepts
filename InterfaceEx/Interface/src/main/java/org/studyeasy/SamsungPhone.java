package org.studyeasy;

public class SamsungPhone implements Phone{

    @Override
    public String processor(){
        return "SD1000";
    }

    @Override
    public int spaceInGB() {
        return 256;
    }
}

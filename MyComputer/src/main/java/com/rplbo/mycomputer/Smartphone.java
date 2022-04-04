package com.rplbo.mycomputer;

public class Smartphone extends Computer{
    private TouchScreen touchScreen;

    public Smartphone(Storage storage, TouchScreen touchScreen) {
        super(storage);
        this.touchScreen = touchScreen;
    }

    public void showDisplay(){
        this.touchScreen.display(this.getStorage());
    }

    public void retrieveData(int data){
        super.retrieveData(String.valueOf(data));
    }
}

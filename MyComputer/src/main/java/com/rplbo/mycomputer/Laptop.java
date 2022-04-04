package com.rplbo.mycomputer;

public class Laptop extends Computer{
    private Keyboard keyboard;
    private Monitor monitor;

    public Laptop(Storage storage, Monitor monitor, Keyboard keyboard) {
        super(storage);
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public void showDisplay(){
        this.monitor.display(this.getStorage());
    }

    public void retrieveData(double data){
        super.getStorage().addData(String.valueOf(data));
    }
}

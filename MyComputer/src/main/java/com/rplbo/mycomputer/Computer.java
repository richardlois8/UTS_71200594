package com.rplbo.mycomputer;

public class Computer {
    private int ID;
    private int GlobalID;
    private CableData cableData;
    private Storage storage;

    public Computer(Storage storage) {
        this.storage = storage;
        GlobalID += 1;
    }

    public Storage getStorage() {
        return storage;
    }

    public boolean detachCableData(){
        if(this.cableData == null){
            return false;
        }
        else {

            this.cableData.detach(this);
            this.cableData = null;
            return true;
        }
    }

    public void retrieveData(String data){
        this.storage.addData(data);
    }

    public boolean sendData(String data){
        return this.cableData.sendData(this, data);
    }

    public int getID() {
        return ID;
    }

    public boolean attachCableData(CableData cableData){
        if(this.cableData == null){
            this.cableData = cableData;
            this.cableData.attach(this);
            return true;
        }
        else {
            return false;
        }
    }
}

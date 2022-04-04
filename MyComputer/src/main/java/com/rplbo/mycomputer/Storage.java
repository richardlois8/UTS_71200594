package com.rplbo.mycomputer;

import java.util.Objects;

public class Storage {
    private String[] storage;

    public Storage(int storageCapacity) {
        this.storage = new String[storageCapacity];
    }

    public String getData(int index){
        return this.storage[index];
    }

    public int getSizeOfData(){
        return this.storage.length;
    }

    public boolean addData(String data){
        for(int i=0;i<this.getSizeOfData();i++){
            if(this.storage[i] == null){
                this.storage[i] = data;
                break;
            }
        }
        return true;
    }


    public String toString(){
        String data = "";
        for(int i=0;i<this.storage.length;i++)
            if(this.storage[i] != null) {
                data = data + i + " : " + this.storage[i] + "\n";
            }
        return data;
    }
}

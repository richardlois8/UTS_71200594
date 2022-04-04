package com.rplbo.mycomputer;

public class CableData {
    private Computer computer1;
    private Computer computer2;

    public CableData() {
    }

    public boolean attach(Computer computer){
        if(computer1 == null){
            this.computer1 = computer;
        }
        else if(computer2 == null){
            this.computer2 = computer;
        }
        else {
            return false;
        }
        return true;
    }

    public boolean detach(Computer computer){
        if(computer.getID() == computer1.getID()){
            this.computer1 = null;
            return true;
        }
        else if(computer.getID() == computer2.getID()){
            this.computer2 = null;
            return true;
        }
        else {
            return false;
        }

    }

    public boolean sendData(Computer computer, String data) {
        if (this.computer1 == null || this.computer2 == null){
            return false;
        }
        else{
            if (computer == computer1) {
                this.getComputer1().retrieveData(data);
            } else if (computer == computer2) {
                this.getComputer2().retrieveData(data);
            }
        }
        return true;
    }

    public Computer getComputer1() {
        return computer1;
    }

    public Computer getComputer2() {
        return computer2;
    }
}

package com.pattern.designpattern.pattern.behavioral.state.TVRemote;


public class TVRemoteBasic {

    private String state="";

    public void setState(String state){
        this.state=state;
    }

    /**
     * Further more if number of states increase then the tight coupling between implementation and the client code will be very hard to maintain and extend.
     * Now we will use State pattern to implement above TV Remote example.
     */
    public void doAction(){
        if(state.equalsIgnoreCase("ON")){
            System.out.println("TV is turned ON");
        }else if(state.equalsIgnoreCase("OFF")){
            System.out.println("TV is turned OFF");
        }
    }

    public static void main(String args[]){
        TVRemoteBasic remote = new TVRemoteBasic();

        remote.setState("ON");
        remote.doAction();

        remote.setState("OFF");
        remote.doAction();
    }

}

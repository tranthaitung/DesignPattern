package com.pattern.designpattern.pattern.behavioral.state.TVRemote.impl;

import com.pattern.designpattern.pattern.behavioral.state.TVRemote.State;

public class TVStopState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }

}

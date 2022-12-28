package com.pattern.designpattern.pattern.behavioral.state.TVRemote.impl;

import com.pattern.designpattern.pattern.behavioral.state.TVRemote.State;

public class TVContext implements State {

    private State tvState;

    public void setState(State state) {
        this.tvState=state;
    }

    public State getState() {
        return this.tvState;
    }

    @Override
    public void doAction() {
        this.tvState.doAction();
    }

}

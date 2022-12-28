package com.pattern.designpattern.pattern.behavioral.state.TVRemote;

import com.pattern.designpattern.pattern.behavioral.state.TVRemote.impl.TVContext;
import com.pattern.designpattern.pattern.behavioral.state.TVRemote.impl.TVStartState;
import com.pattern.designpattern.pattern.behavioral.state.TVRemote.impl.TVStopState;

public class TVRemote {

    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();


        context.setState(tvStopState);
        context.doAction();

    }

}
/**
 * States store a reference to the context object that contains them. Strategies do not.
 * States are allowed to replace themselves (IE: to change the state of the context object to something else), while Strategies are not.
 * Strategies are passed to the context object as parameters, while States are created by the context object itself.
 * Strategies only handle a single, specific task, while States provide the underlying implementation for everything (or most everything) the context object does.
 */

/*******************************************
 * Copyright (C) 2005, Frederic Peschanski *
 *         >> DO NOT DISTRIBUTE <<         *
 *******************************************/

import tamago.*;

import java.util.*;

public class TestCarCompositionMain {

    public static void main(String args[]) {
	
	try {

	    // Instantiate the remote controller
	    Remote remote = new Remote();
	    
	    // Instantiate the car parts
	    Receiver receiver = new Receiver();
	    Engine engine = new Engine();
	    Direction direction = new Direction();
	    Effector effector = new Effector();

	    // Bindings of car parts   
	    receiver.bind( (EngineService) engine);
	    receiver.bind( (DirectionService) direction);
	    engine.bind( (EffectorEngineService) effector);
	    direction.bind( (EffectorDirectionService) effector);

	    // Bindings for remote
	    remote.bind( (ReceiverService) receiver);

	    // Start the remote
	    remote.on();

	    // Test the car
	    Random rand = new Random();
	    for(int i = 1; i<= 10 ; i++) {
		int cmd = rand.nextInt(70);
		if(cmd<10) {
		    remote.reset();
		    remote.forward();
		} else if(cmd<20) {
		    remote.reset();
		    remote.forward();
		    remote.left();
		}  else if(cmd<30) {
		    remote.reset();
		    remote.forward();
		    remote.right();
		} else if(cmd<40) {
		    remote.reset();
		    remote.backward();
		} else if(cmd<50) {
		    remote.reset();
		    remote.backward();
		    remote.left();
		}  else if(cmd<60) {
		    remote.reset();
		    remote.backward();
		    remote.right();
		} else if(cmd<70) {
		    remote.reset();
		}
		remote.activate();
	    }

	    // shutdown the remote controller
	    remote.off();

	} catch(Exception e) {
	    e.printStackTrace(System.err);
	}

    }
}

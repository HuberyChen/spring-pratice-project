package com.springinaction.springidol.performer;

/**
 * @author hubery.chen
 */
public class Saxophone implements Instrument {

    public Saxophone() {
    }

    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}

package com.springinaction.springidol.performer;

@StringedInstrument
public class Guitar implements Instrument {
    public void play() {
        System.out.println("Strum strum strum");
    }
}

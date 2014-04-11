package com.springinaction.springidol.performer;

/**
 * @author hubery.chen
 */
public class Instrumentalist implements Performer {

    public Instrumentalist() {
    }

    public Instrumentalist(String song, Instrument instrument) {
        this.song = song;
        this.instrument = instrument;
    }

    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    private Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }
}

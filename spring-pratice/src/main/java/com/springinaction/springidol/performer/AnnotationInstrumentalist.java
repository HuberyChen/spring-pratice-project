package com.springinaction.springidol.performer;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author hubery.chen
 */
public class AnnotationInstrumentalist {

    //    @Autowired(required = false)
    @Autowired
    @StringedInstrument
    private Instrument instrument;

    public void play() {
        instrument.play();
    }

}

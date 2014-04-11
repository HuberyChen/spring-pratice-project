package com.springinaction.springidol.performer;

import java.util.Collection;

/**
 * @author hubery.chen
 */
public class OneManBand implements Performer {

    private Collection<Instrument> instruments;
    private Object someNonNullProperty;

    public OneManBand() {
    }

    @Override
    public void perform() {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    public void setSomeNonNullProperty(Object someNonNullProperty) {
        this.someNonNullProperty = someNonNullProperty;
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}

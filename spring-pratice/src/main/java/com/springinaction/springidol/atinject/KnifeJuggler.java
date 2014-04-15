package com.springinaction.springidol.atinject;

import javax.inject.Inject;
import java.security.Provider;
import java.util.HashSet;
import java.util.Set;

/**
 * @author hubery.chen
 */
public class KnifeJuggler {
    private Set<Knife> knives;

    @Inject
    public KnifeJuggler(Provider<Knife> knifeProvider) {
        knives = new HashSet<>()
    }
}

package com.moyu.thinkinginjava.think_in_interface.filters;

public class BandPass extends Filter {
    double lowCutoff,highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}

package com.moyu.thinkinginjava.think_in_interface.filters;

public class Filter {
  public String name() {
    return getClass().getSimpleName();
  }

  public Waveform process(Waveform input) {
    return input;
  }
}

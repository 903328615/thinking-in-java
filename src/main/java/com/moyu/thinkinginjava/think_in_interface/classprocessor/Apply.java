package com.moyu.thinkinginjava.think_in_interface.classprocessor;

import com.moyu.thinkinginjava.think_in_interface.filters.BandPass;
import com.moyu.thinkinginjava.think_in_interface.filters.Filter;

import java.util.Arrays;

interface Processor {
  public String name();

  Object process(Object input);
}

class Upcase implements Processor {
  @Override
  public String name() {
    return getClass().getSimpleName();
  }

  // 重写父类方法process 且协变返回
  public String process(Object input) {
    return ((String) input).toUpperCase();
  }
}

class Downcase implements Processor {

  @Override
  public String name() {
    return getClass().getSimpleName();
  }

  @Override
  public String process(Object input) {
    return ((String) input).toLowerCase();
  }
}

class Splitter implements Processor {
  @Override
  public String name() {
    return getClass().getSimpleName();
  }

  public String process(Object input) {
    return Arrays.toString(((String) input).split(" "));
  }
}

public class Apply {

  public static void process(Processor processor, Object s) {
    System.out.println("Using Pricessor" + processor.name());
    System.out.println(processor.process(s));
  }

  public static String s = "Think In Interface";

  public static void main(String[] args) {
    process(new Upcase(), s);
    process(new Downcase(), s);
    process(new Splitter(), s);
  }
}

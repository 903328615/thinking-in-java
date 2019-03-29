package com.moyu.javacoretechnology.formatcode;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatCode {
  public static void main(String[] args) {
    //
    String s = String.format("%tQ", new Date());
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 这个是你要转成后的时间的格式
    String sd = sdf.format(new Date(Long.parseLong(String.valueOf(s)))); // 时间戳转换成时间
    System.out.println(s);
    System.out.println(sd);
    Object c=new Object();

  }
}

package com.moyu.redis;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

/**
 * @program: thinking-in-java
 * @description: Redis数据导入
 * @author: wangzibin
 * @create: 2019-02-28 10:59
 **/
public class RedisDataImport {

    public static void main(String[] args) throws IOException {
        System.out.println(System.currentTimeMillis());
        importData();
          /*  FileWriter fileWriter=new FileWriter("C:/OPENSOURCE/IDEA/TestRunJar/test.txt");
            writeFile(fileWriter);*/
        System.out.println(System.currentTimeMillis());


    }

    private static void importData() {
        String host = "123.206.84.173";
        String localhost="127.0.0.1";
        Integer port = 6379;
        Jedis jedis = new Jedis(host, port);
        String keyName="cag:total:u_new_server:10000:21008";
        String filePath="C:/OPENSOURCE/IDEA/TestRunJar/redis/total_u_new_10000_21008.txt";
        File file = new File(filePath);
        List<String> valueList=txt2ListString(file);
        int size=valueList.size();
        String[] values= valueList.toArray(new String[size]);
        //使用管道添加
        Pipeline pipeline=jedis.pipelined();
        pipeline.sadd(keyName,values);
       //valueList.stream().forEach(s-> System.out.println(s));
        //jedis.sadd(keyName,values);
        System.out.println("共向"+keyName+"中添加{"+size+"}条数据"+"[文档路径为"+filePath+"]");
        jedis.close();
    }

    public static  List<String>  txt2ListString(File file) {
        List<String> result=new ArrayList<>(16);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s;
            //使用readLine方法，一次读一行
            while ((s = br.readLine()) != null) {
                result.add(s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void writeFile(FileWriter fileWriter) throws IOException {

        Random random=new Random();
        BufferedWriter  bw=new BufferedWriter(fileWriter);
        for (int i=0;i<100000;i++){
                bw.write(String.valueOf(random.nextLong()));
                bw.newLine();
        }
        bw.close();
        fileWriter.close();
    }

}

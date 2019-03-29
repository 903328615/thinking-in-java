package com.moyu.impala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * @program: thinking-in-java
 * @description: 测试连接
 * @author: wangzibin
 * @create: 2019-01-07 17:41
 **/
public class UpdateMeta {

    static String JDBC_DRIVER = "com.cloudera.impala.jdbc41.Driver";
    static String CONNECTION_URL = "jdbc:impala://123.206.88.176:21050/shtt";

    public static void main(String[] args)
    {
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        try
        {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(CONNECTION_URL);
            ps = con.prepareStatement("select * from s_item where roleid='859040722566064806' and dt between '20190105' and '20190106' ORDER BY msec;");
            rs = ps.executeQuery();
            while (rs.next())
            {
                System.out.println(rs.getString(1) + '\t' + rs.getString(2)+ '\t' + rs.getString(3)+'\t' + rs.getString(4));
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            //关闭rs、ps和con
        }
    }
}

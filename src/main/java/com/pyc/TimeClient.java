//IntelliJ IDEA
//AIOProject
//TimeClient
//2021/1/13
// Author:御承扬
//E-mail:2923616405@qq.com

package com.pyc;

public class TimeClient {
    public static void main(String[] args) {
        int port = 8234;
        if(args != null && args.length>0){
            try {
                port = Integer.valueOf(args[0]);
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
        new Thread(new AsyncTimeClientHandler("127.0.0.1",port), "AIO-AsyncTimeClientHandler-001").start();
    }
}

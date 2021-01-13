//IntelliJ IDEA
//AIOProject
//TimeServer
//2021/1/13
// Author:御承扬
//E-mail:2923616405@qq.com

package com.pyc;

public class TimeServer {
    public static void main(String[] args) {
        int port = 8234;
        if(args != null && args.length>0){
            try {
                port = Integer.valueOf(args[0]);
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
        AsyncTimeServerHandler timeServerHandler = new AsyncTimeServerHandler(port);
        new Thread(timeServerHandler, "AIO-AsyncTimeServerHandler-001");
    }
}

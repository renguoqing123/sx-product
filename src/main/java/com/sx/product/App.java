package com.sx.product;

import java.io.IOException;
import java.net.UnknownHostException;

import com.sx.product.service.ProductService;
import com.sx.rpc.Registry;
import com.sx.rpc.RpcServer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws UnknownHostException, IOException
    {
    	//注册
    	Registry re=new Registry();
    	re.map.put(ProductService.class.getName(), ProductServiceImpl.class);
    	
    	//server启动服务
    	RpcServer server=new RpcServer();
    	server.start(9992);
    	
    }
}

package com.syntel.demo;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class Test
{
 public static void main(String[] args) throws MalformedURLException, UnknownHostException
 {   
    
	 URL url = new URL("https://hdapps.homedepot.com/MYTHDPassport/rs/identity/thdLogin");
	 System.out.println(url.getHost());
	 System.out.println(url.getPort());
	 InetAddress address = InetAddress.getByName(url.getHost());
	 System.out.println(address.toString());

 }
}
package com.muralitrainer;

import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

public class addition {
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
		
	}
	
	public static void main(String[] args) {
		
		addition s=new addition();
		s.add(20, 30, 50);
		
		
	}
	

}

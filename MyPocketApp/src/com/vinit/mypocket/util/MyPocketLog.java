package com.vinit.mypocket.util;

import android.util.Log;

public class MyPocketLog {
	public static final int OFF = 0;
	public static final int V = 1;
	public static final int D = 2;
	public static final int I = 3;
	public static final int W = 4;
	public static final int E = 5;
	
	public static int loggerLevel = 1;
	
	public static String mpLogTag = "#MPLog#-";
	
	public static void d(String tag, String msg){
		if (loggerLevel >= D) {
			Log.d(tag, msg);
		}
	}
	
	public static void i(String tag, String msg){
		if (loggerLevel >= I) {
			Log.i(tag, msg);
		}
	}
	
	public static void e(String tag, String msg){
		if (loggerLevel >= E) {
			Log.e(tag, msg);
		}
	}
	
	public static void e(String tag, String msg, Throwable tr){
		if (loggerLevel >= E) {
			Log.e(tag, msg);
		}
	}
	
	public static void v(String tag, String msg){
		if (loggerLevel >= V) {
			Log.v(tag, msg);
		}
	}
	
	public static void w(String tag, String msg){
		if (loggerLevel >= W) {
			Log.w(tag, msg);
		}
	}
	
	public static void setLoggerLevel(int level){
		loggerLevel = level;
	}
	
	public static int getLoggerCode(String className) {
		return 0;
	}
}

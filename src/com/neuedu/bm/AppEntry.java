package com.neuedu.bm;

import java.util.Scanner;

import com.neuedu.bm.ui.IndexUi;

public class AppEntry {
	
	
	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * 图书管理系统主程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		IndexUi indexUi = new IndexUi(scanner);
		indexUi.service();
	}
	
}

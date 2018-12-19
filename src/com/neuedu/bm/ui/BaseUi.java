package com.neuedu.bm.ui;

import java.util.Scanner;

public abstract class BaseUi {
	protected Scanner scanner;
	
	public BaseUi(Scanner scanner) {
		super();
		this.scanner = scanner;
	}

	public abstract void service() ;
}

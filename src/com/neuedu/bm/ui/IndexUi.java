package com.neuedu.bm.ui;

import java.util.Scanner;

import com.neuedu.bm.service.UserService;

public class IndexUi extends BaseUi{
	
	private UserService userService = new UserService();
	
	public IndexUi(Scanner scanner) {
		super(scanner);
	}
	
	@Override
	public void service() {
		System.out.println("欢迎使用图书管理系统！");
		System.out.println("请选择：1. 登陆    2. 退出");
		int choice = scanner.nextInt();
		if(choice==1) {
			loginService();
		}else if(choice==2) {
			System.out.println("再见。");
		}else {
			System.out.println("请输入正确的选择");
			service();
		}
	}

	private void chooseService() {
		System.out.println("1. 新增一个用户	2. 删除一个用户	3. 修改一个用户	4. 查询用户");
		System.out.println("5. 新增图书	6. 查询图书	7. 修改图书	8. 删除图书");
		System.out.println("9. 借阅书籍	10. 归还书籍	 11. 注销");
		int num = scanner.nextInt();
		System.out.println("服务："+num);
	}
	
	public void loginService() {
		System.out.println("请输入用户名：");
		String username = scanner.next();
		System.out.println("请输入密码：");
		String password = scanner.next();
		//验证登陆
		boolean isSuccess= userService.validate(username,password);
		if(isSuccess) {
			System.out.println(username+"，您好，请选择服务：");
			chooseService();
		}else {
			loginService();
		}
	}

}

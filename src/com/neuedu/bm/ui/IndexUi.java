package com.neuedu.bm.ui;

import java.util.Scanner;

import com.neuedu.bm.entity.User;
import com.neuedu.bm.service.UserService;

public class IndexUi extends BaseUi {

	private UserService userService = new UserService();

	public IndexUi(Scanner scanner) {
		super(scanner);
	}

	@Override
	public void service() {
		System.out.println("欢迎使用图书管理系统！");
		System.out.println("请选择：1. 登陆    2. 退出");
		int choice = scanner.nextInt();
		if (choice == 1) {
			loginService();
		} else if (choice == 2) {
			System.out.println("再见。");
		} else {
			System.out.println("请输入正确的选择");
			service();
		}
	}

	private void adminChooseService() {
		System.out.println("1. 新增一个用户	2. 删除一个用户	3. 修改一个用户	4. 查询用户");
		System.out.println("5. 新增图书	6. 查询图书	7. 修改图书	8. 删除图书");
		System.out.println("9. 借阅书籍	10. 归还书籍	 11. 注销");
		String num = scanner.next();
		switch (num) {
		case "1":
		case "2":
		case "3":
		case "4":
			handUser(num);
			break;
		case "5":
		case "6":
		case "7":
		case "8":
			handBook(num);
			break;
		case "9":
		case "10":
			handBorrow(num);
			break;
		case "11":
			break;
		default:
			System.out.println("请输入正确的选择");
			adminChooseService();
		}
	}
	
	private void handBorrow(String num) {
		// TODO Auto-generated method stub
		
	}

	private void handBook(String num) {
		// TODO Auto-generated method stub
		
	}
	
	private void handUser(String username) {
		// TODO Auto-generated method stub
		
	}
	
	private void handUserUpdate(String username) {
		// TODO Auto-generated method stub
		
	}


	private void chooseService(String username) {
		System.out.println("请选择：");
		System.out.println("1. 修改用户	2. 查询书籍	3. 借阅书籍	4. 归还书籍	5. 注销");
		String num = scanner.next();
		switch (num){
		case "1":
			handUserUpdate(username);// 修改用户
			break;
		case "2":
		case "3":
		case "4":
			handBorrow(num);
			break;
		case "5":
			break;
		default:
			System.out.println("请输入正确的选择");
			chooseService(username);
		}
	}

	

	

	public void loginService() {
		System.out.println("请输入用户名：");
		String username = scanner.next();
		System.out.println("请输入密码：");
		String password = scanner.next();
		// 验证登陆
		User user = userService.validate(username, password);
		if (user!=null && user.getType().equals("0")) {
			System.out.println(username + "，您好，请选择服务：");
			adminChooseService();
		} else if(user!=null && user.getType().equals("1")) {
			System.out.println(username + "，您好，请选择服务：");
			chooseService(username);
		} else {
			System.out.println("登录失败，请重新登录。");
			loginService();
		}
	}

	

}

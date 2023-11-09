package com.edu.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.edu.service.UserServiceEx;

public class UserView {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("====================================================================");
		System.out.println("============= Online grocery Management System =============================");
		System.out.println("====================================================================");
		String ch;
		UserServiceEx app = new UserServiceEx();
		do {

			System.out.println("\t\t 1)View User Information\r\n" + "\t\t 2)Insert User info by  id.\r\n"

					+ "\t\t 3)Update User information by id.\r\n" + "\t\t 4)delete all User information.");
			System.out.println("====================================================================");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				app.view();
				break;
			case 2:
				app.userInsert();
				break;
			case 3:
				app.userUpdate();
				break;
			case 4:
				app.userDelete();
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				System.out.println("Wrong choice!!");

			}

			System.out.println("Do you want to continue? (Y-Yes / N-No)");
			ch = sc.next();
		} while (ch.equals("Y") || ch.equals("y"));
		System.out.println("====================================================================");

		System.out.println("Bye....");

		System.out.println("====================================================================");

	}

}

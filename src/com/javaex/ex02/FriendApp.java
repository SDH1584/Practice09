package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해죽세요");

		String name, hp, school;
		Friend f;
		List<Friend> fList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			name = sc.next();
			hp = sc.next();
			school = sc.next();
			f = new Friend(name, hp, school);
			fList.add(f);
		}

		listAllPrint(fList);

		sc.close();

	}

	private static void listAllPrint(List<Friend> fList) {
		for (Friend f : fList) {
			f.showInfo();
		}

	}

}
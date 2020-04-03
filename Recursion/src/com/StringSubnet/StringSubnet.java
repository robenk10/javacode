package com.StringSubnet;

public class StringSubnet {
	static void sub(String str, int index, String curr) {
		int n = str.length();

		if (index == n) {
			return;
		}

		System.out.println(curr);

		for (int i = index + 1; i < n; i++) {
			curr = curr + str.charAt(i);
			sub(str, i, curr);
			curr = curr.substring(0, curr.length() - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		int len = str.length();
		sub(str, -1, " ");

	}

}
package org.jackey.hilog.dao.data;

import java.util.Random;

public class RandomTool {
	public static Random r = new Random();
	public static final char A = 'a';

	public static String randomString() {
		StringBuilder sb = new StringBuilder();
		int length = r.nextInt(12) + 1;
		while (length-- > 0) {
			sb.append((char) (A + r.nextInt(25)));
		}

		return sb.toString();
	}

	public static String randomSentence() {
		StringBuilder sb = new StringBuilder();
		int length = r.nextInt(18) + 1;
		while (length-- > 0) {
			sb.append(randomString() + " ");
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println(randomSentence());
		}
	}
}

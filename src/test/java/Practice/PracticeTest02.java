package Practice;

import java.util.Arrays;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class PracticeTest02 {

	public static void main(String[] args) {
		int[] s = { 8, 2, 5, 7, 9, 6, 1, 3 };
		for (int i = 0; i < s.length; i++) {

			for (int j = 0; j < s.length - 1 - i; j++) {
				if (s[j] > s[j + 1]) {
					int temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(s));
	}

}

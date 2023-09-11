package Main;

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < n; i++) {
			String[] arrInput = br.readLine().split(" ");
			map.put(arrInput[0], arrInput[1]);
		}
		for (int i = 0; i < n; i++) {
			if (map.get)
		}
		System.out.println(map.size());
	}
}
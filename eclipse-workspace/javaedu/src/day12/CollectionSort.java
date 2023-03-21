package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
	public static void main(String[] args) {
		String[] array = { "JAVA", "SERVLET", "JDBC", "JSP", "RMI" };
		List<String> list = new ArrayList<String>();
		Collections.addAll(list, array); //list에 array에 있는 데이터를 저장
		System.out.println("list에 저장된 모든 데이터 : " + list);

		int index = Collections.binarySearch(list, "JDBC"); // list 안의 어떤 데이터가 어디에 존재하는지 - 이진탐색
		System.out.println("\"JDBC\" 가 저장된 위치 : " + index);

		String maxStr = Collections.max(list); // 최대값 - 알파벳순, 제일 뒤에 있는 것
		String minStr = Collections.min(list); // 최소값 - 알파벳순, 제일 앞에 있는 것 
		System.out.println("최대값:" + maxStr);
		System.out.println("최소값:" + minStr);

		Collections.sort(list); //값 정렬
		System.out.println("list의 데이터들을 오름차순으로 소팅한 결과 : " + list);

		Collections.shuffle(list); //무작위로 값 섞기
		System.out.println("list의 데이터들을 섞은 결과 : " + list);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(15);
		list2.add(5);
		int maxNum = Collections.max(list2);
		int minNum = Collections.min(list2);
		System.out.println("최대값:" + maxNum);
		System.out.println("최소값:" + minNum);

	}
}

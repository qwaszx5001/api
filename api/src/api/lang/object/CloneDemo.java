package api.lang.object;

import java.util.Arrays;

/*
 java.lang.Object의 메소드 clone()은 객체를 복제한다. 클론은 값의 복제
 * */
public class CloneDemo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		// 배열은 한번 공간을 생성시키면 추가 할당이 되지 않는다.
		// 동적으로 할당하고자 할 때는 ArrayList 를 사용한다.
		
		int[] arr2 = arr.clone();
		/*
		 * arr 배열을 복제한 값을 arr2에 그대로 할당한다.
		 * */
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr[i] + "\t");  // \t 는 이스케이프 문자로 tap을 뜻한다.
		}
		
		System.out.println("===========================");
		System.out.println("");
		System.out.println("Arrays로 출력");
		System.out.println("arr 의 요소출력 : " + Arrays.toString(arr));
		System.out.println("arr2 의 요소출력 : " + Arrays.toString(arr2));
		
	} //클론을 활용하여 엄청 단순해진 코딩

}

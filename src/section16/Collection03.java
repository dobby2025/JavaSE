package section16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set
 * 	순서가 없는 컬렉션 프레임웍
 * 	중복을 허용하지 않는다.
 * 
 *  LinkedHashSet : HashSet 확장한 클래스로 삽입 순서를 유지한다.
 *  TreeSet : 오름차순으로 정렬되어 있다.
 * 
 * 
 * 반복자(Iterator)
 * 	자바 컬렉션 프레임웍에서 컬렉션에 저장된 요소를 읽어오는데 사용하는 인터페이스
 * 
 */
public class Collection03 {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("피카츄");
		set.add("라이츄");
		set.add("파이리");
		set.add("꼬부기");
		
		// 중복 값 허용하지 않는다.
		boolean isAdd = set.add("피카츄");
		System.out.println("isAdd: " + isAdd);
		
		// 데이터 사이즈
		System.out.println("데이터 길이: " + set.size());
		
		// 전체 데이터 출력
		for(String name: set) {
			System.out.println("name: " + name);			
		}
		System.out.println("===========================================");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) { // hasNext() - 커서역할, 다음요소가 있는지 확인하여 논리값 반환
			String name = it.next();	// next() - 해당요소 반환
			System.out.println("name: " + name);
		}
		
		System.out.println("=======================================");
		// TreeSet 객체 생성
		TreeSet<String> treeSet = new TreeSet<String>();
		
		// 데이터 추가하기
		treeSet.add("피카츄");
		treeSet.add("라이츄");
		treeSet.add("파이리");
		treeSet.add("꼬부기");
		
		for(String name : treeSet) {
			System.out.println("treeSet name: " + name);
		}
		
	}

}












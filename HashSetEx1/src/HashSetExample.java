import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.StudentNum + ":" + student.name);
		}
	}
}

// Student 중복저장 방지
/* HashSet에 Student 객체를 저장하려고 합니다. 학번이 같으면 동일한 Student라고 가정하고
 * 중복 저장이 되지 않고록 하고 싶습니다. Student 클래스에서 재정의해야 하는 HashCode()와 
 * equals() 메소드의 내용을 채워보세요. Student의 해시코드는 학번이라고 가정합니다.
 * 
 */

package gradle.test;

import gradle.test.dto.TestDto;

public class TestMain {

	public static void main(String[] args) {
		TestDto dto = new TestDto();
		dto.setName("Bob");
		dto.setAge(20);

		System.out.println(dto.getName() + ":" + dto.getAge());
	}
}
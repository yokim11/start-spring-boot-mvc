package com.example.demo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.MemberVO;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleControllerTests {

	@Test
	public void testSample02() {
		List<MemberVO> list = new ArrayList<>();
		IntStream.range(1, 10).forEach(i -> {
			list.add(new MemberVO(i, "u0" + i, "p0" + i, "홍길동" + i, new Timestamp(System.currentTimeMillis())));
		});
		log.info(list.toString());
	}

}

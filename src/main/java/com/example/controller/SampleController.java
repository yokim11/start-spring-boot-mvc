package com.example.controller;

import com.example.domain.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Controller
public class SampleController {

	@GetMapping("/")
	public String homeScreen() {
		return "index";
	}

	@GetMapping("/sample1")
	public void sample01(Model model) {
		model.addAttribute("greeting", "안녕하세요.");
	}


	@GetMapping("/sample2")
	public String sample02(Model model) {
		List<MemberVO> list = new ArrayList<MemberVO>();
		IntStream.range(1, 11).forEach(mno -> {
			list.add(new MemberVO(mno, "u0" + mno, "p0" + mno, "홍길동" + mno, new Timestamp(System.currentTimeMillis())));
		});

		model.addAttribute("list", list);
		return "sample2";
	}
}

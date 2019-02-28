package com.example.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.domain.MemberVO;

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
		List<MemberVO> list = new ArrayList<>();
		IntStream.range(1, 11).forEach(i -> {
			list.add(new MemberVO(i, "u0" + i, "p0" + i, "홍길동" + i, new Timestamp(System.currentTimeMillis())));
		});
		model.addAttribute("list", list);
		return "sample2";
	}
}

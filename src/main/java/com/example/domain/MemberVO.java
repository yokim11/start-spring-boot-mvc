package com.example.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class MemberVO {
	public int mno;
	public String mid;
	public String mpw;
	public String mname;
	public Timestamp regdate;

	public MemberVO(int mno, String mid, String mpw, String mname, Timestamp regdate) {
		this.mno = mno;
		this.mid = mid;
		this.mpw = mpw;
		this.mname = mname;
		this.regdate = regdate;
	}
}

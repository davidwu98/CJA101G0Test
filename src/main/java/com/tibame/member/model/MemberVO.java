package com.tibame.member.model;

public class MemberVO {
	private Integer memId;
	private String memName;
	private Integer xxx;
	
	public MemberVO() {
		super();
	}
	
	public MemberVO(Integer memId, String memName) {
		super();
		this.memId = memId;
		this.memName = memName;
	}

	public Integer getMemId() {
		return memId;
	}
	public void setMemId(Integer memId) {
		this.memId = memId;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	
	
}

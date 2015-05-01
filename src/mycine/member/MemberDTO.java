package mycine.member;

import java.sql.*;

public class MemberDTO {
	int idx;
	String id;
	String pwd;
	String name;
	String addr;
	String email;
	String tel;
	String birthday;
	int point;
	Date joindate;
	int e_point;
	String e_prize;
	
	public MemberDTO(int idx, String id, String pwd, String name, String addr,
			String email, String tel, String birthday, int point,
			Date joindate, int e_point, String e_prize) {
		super();
		this.idx = idx;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.addr = addr;
		this.email = email;
		this.tel = tel;
		this.birthday = birthday;
		this.point = point;
		this.joindate = joindate;
		this.e_point = e_point;
		this.e_prize = e_prize;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	public int getE_point() {
		return e_point;
	}

	public void setE_point(int e_point) {
		this.e_point = e_point;
	}

	public String getE_prize() {
		return e_prize;
	}

	public void setE_prize(String e_prize) {
		this.e_prize = e_prize;
	}
	
	
	
}

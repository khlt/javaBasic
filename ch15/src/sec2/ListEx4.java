package sec2;

import java.util.ArrayList;
import java.util.List;

class Member{
	private String uid;
	private String pw;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
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
	private String email;
	private String tel;
}
public class ListEx4 {

	public static void main(String[] args) {
		List<Member> Mem = new ArrayList<Member>(); 
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member();
		Member m5 = new Member();
		m1.setUid("null");
		m1.setPw("a1234");
		m1.setTel("010-9999-9999");
		m1.setEmail("kkk@naver.com");
		Mem.add(m2);
		m2.setUid("null");
		m2.setPw("a1234");
		m2.setTel("010-9999-9999");
		m2.setEmail("kkk@naver.com");
		Mem.add(m2);
		m3.setUid("null");
		m3.setPw("a1234");
		m3.setTel("010-9999-9999");
		m3.setEmail("kkk@naver.com");
		Mem.add(m3);
		m4.setUid("null");
		m4.setPw("a1234");
		m4.setTel("010-9999-9999");
		m4.setEmail("kkk@naver.com");
		Mem.add(m5);
		m5.setUid("null");
		m5.setPw("a1234");
		m5.setTel("010-9999-9999");
		m5.setEmail("kkk@naver.com");
		Mem.add(m5);
		
		System.out.println("아이디\t비밀번호\t이메일\t\t전화번호");
		for(Member mt : Mem) {
			System.out.print(mt.getUid()+"\t");
			System.out.print(mt.getPw()+"\t");
			System.out.print(mt.getEmail()+"\t");
			System.out.print(mt.getTel()+"\n");
		}
		
	}
}

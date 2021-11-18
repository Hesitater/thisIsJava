package chap11.example.sec111103;

public class Member implements Comparable<Member> {

	String name;

	public Member(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
}

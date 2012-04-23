package sample.member;

import java.util.List;

import sample.domain.Member;

public interface MemberDao {
	
	void add(Member member);
	
	void update(Member member);
	
	Member get(int id);
	
	List<Member> list();
	
	void delete(int id);

}

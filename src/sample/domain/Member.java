package sample.domain;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Member {

	Long id;

	@NotNull
	@Size(min = 1, message = "입력하세요.")
	String name;

	Date joined;
	
	public Member() {
		this.id = System.currentTimeMillis();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getJoined() {
		return joined;
	}

	public void setJoined(Date joined) {
		this.joined = joined;
	}
	
}

package phdljr.vo;

public class StudentVO {
	private Long id;
	private String nickname;
	private String pw;

	public StudentVO(Long id, String nickname, String pw) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "StudentVO [id=" + id + ", nickname=" + nickname + ", pw=" + pw + "]";
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
}

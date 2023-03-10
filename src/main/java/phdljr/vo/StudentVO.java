package phdljr.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class StudentVO {
	private Long id;
	private String nickname;
	private String pw;
}

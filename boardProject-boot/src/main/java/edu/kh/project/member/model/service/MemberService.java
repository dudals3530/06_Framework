package edu.kh.project.member.model.service;

import edu.kh.project.member.model.dto.Member;

public interface MemberService {

	/** 로그인 서비스
	 * @param inputMember
	 * @return
	 */
	Member login(Member inputMember);

	/** 이메일 중복검사 서비스
	 * @param memberEmail
	 * @return
	 */
	int checkEmail(String memberEmail);

	/** 닉네임 중복검사 서비스
	 * @param memberNickname
	 * @return
	 */
	int checkNickname(String memberNickname);

	/** 전화번호 중복 검사 서비스
	 * @param memberTel
	 * @return
	 */
	int checkTel(String memberTel);

	/** 회원가입 서비스
	 * @param inputMember
	 * @param memberAddress
	 * @return
	 */
	int signup(Member inputMember, String[] memberAddress);

	/** 아이디 찾기 서비스
	 * @param inputMember
	 * @return
	 */
	Member findMember(Member inputMember);

	/** 비밀번호 찾기전에 회원이 있는지
	 * @param inputMember
	 * @return
	 */
	Member findPw(Member inputMember);

	/** 로그인 안된상태에서 비밀번호 재설정
	 * @param inputMember
	 * @return
	 */
	int findPwConfirm(Member inputMember);

	


}

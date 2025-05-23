package edu.kh.project.email.model.service;

import java.util.Map;

public interface EmailServcie {

	/** 이메일 보내기
	 * @param string : 무슨 이메일을 발송할지 구분할 key로 쓰임 그이메일로 무슨역할을 할지 정함
	 * @param email : 수신자 이메일
	 * @return authKey (인증번호)
	 * 이메일 발송서비스를 다른되서도 쓸수잇음 .
	 */
	String sendEmail(String string, String email);

	/** 입력 받은 이메일 , 인증번호가 DB에있는지 조회 서비스
	 * @param map
	 * @return
	 */
	int checkAuthKey(Map<String, String> map);

	

}

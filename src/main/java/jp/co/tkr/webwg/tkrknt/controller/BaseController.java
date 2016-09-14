/**
 * 
 */
package jp.co.tkr.webwg.tkrknt.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import jp.co.tkr.webwg.tkrknt.vo.LoginUserInfoVo;

/**
 * 各コントローラーのベースクラス<br/>
 * コントローラーの共通処理を記述
 * 
 * @author hamakawa
 *
 */

public class BaseController {

	@Autowired
	private HttpSession session;

	/**
	 * セッションをクリアする。
	 */
	protected void clearSession() {
		session.invalidate();
	}

	/**
	 * セッションで管理するログインユーザーの社員情報を設定する。
	 * 
	 * @return
	 */
	protected void setSessionUserInfo(LoginUserInfoVo vo) {
		session.setAttribute(LoginUserInfoVo.SESSION_LOGIN_INFO, vo);
	}

	/**
	 * セッションで管理しているログインユーザーの社員情報を取得する。
	 * 
	 * @return
	 */
	protected LoginUserInfoVo getSessionUserInfo() {
		return (LoginUserInfoVo) session.getAttribute(LoginUserInfoVo.SESSION_LOGIN_INFO);
	}

}

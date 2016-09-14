/**
 * 
 */
package jp.co.tkr.webwg.tkrknt.form;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import jp.co.tkr.webwg.tkrknt.util.StringUtil;
import jp.co.tkr.webwg.tkrknt.util.ValidatorResult;
import jp.co.tkr.webwg.tkrknt.util.ValidatorUtil;

/**
 * ログイン認証Form
 * 
 * @author hamakawa
 *
 */
public class LoginForm {

	/** メールアドレス */
	@NotNull(message =  "メールアドレスが入力されていません。")
	@NotEmpty(message =  "メールアドレスが入力されていません。")
	@Email(message =  "メールアドレスの形式が不正です。")
	private String mailAddress;
	
	/** パスワード */
	@NotNull(message =  "パスワードが入力されていません。")
	@NotEmpty(message =  "パスワードが入力されていません。")
	private String password;
	
	/** エラーメッセージ */
	private String errorMsg;
	
	/**
	 * フォームの値を初期化する。
	 */
	public void clearFrom(){
		mailAddress ="";
		password = "";
		errorMsg = "";
	}

	/**
	 * メールアドレス、パスワード の入力チェック
	 */
	public boolean formValidate() {
		mailAddress = StringUtil.trim(mailAddress);
		password = StringUtil.trim(password);
		List<ValidatorResult> errorList = ValidatorUtil.validator(this);
		if(0<errorList.size()){
			errorMsg = errorList.get(0).getMessage();
			return false;
		}
		return true;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}

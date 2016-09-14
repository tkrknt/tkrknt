/**
 * 
 */
package jp.co.tkr.webwg.tkrknt.util;

/**
 * 入力チェックの結果クラス
 * 
 * @author hamakawa
 *
 */
public class ValidatorResult {

	/** プロパティ */
	private String property;
	/** エラーメッセージ */
	private String message;

	public ValidatorResult(String property, String message) {
		this.property = property;
		this.message = message;
	}

	public String getProperty() {
		return property;
	}

	public String getMessage() {
		return message;
	}

}

/**
 * 
 */
package jp.co.tkr.webwg.tkrknt.util;

/**
 * 文字列Utilクラス
 * 
 * @author hamakawa
 * 
 */
public class StringUtil {
	
	/**
	 * 全角・半角をtrimする。
	 * @param value
	 * @return
	 */
	public static String trim(String value) {
	    if (value == null || value.length() == 0)
	        return value;
	    int st = 0;
	    int len = value.length();
	    char[] val = value.toCharArray();
	    while ((st < len) && ((val[st] <= ' ') || (val[st] == '　'))) {
	        st++;
	    }
	    while ((st < len) && ((val[len - 1] <= ' ') || (val[len - 1] == '　'))) {
	        len--;
	    }
	    return ((st > 0) || (len < value.length())) ? value.substring(st, len) : value;
	}

	/**
	 * 有害タグを無害化タグに変更する。 XSS(クロスサイトスクリプティング)対応
	 * 
	 * @param str
	 * @return
	 */
	public static String convertSanitize(String str) {
		if (str == null) {
			return str;
		}
		str = str.replaceAll("&", "&amp;");
		str = str.replaceAll("<", "&lt;");
		str = str.replaceAll(">", "&gt;");
		str = str.replaceAll("\"", "&quot;");
		str = str.replaceAll("'", "&#39;");
		return str;
	}

	/**
	 * XSS(クロスサイトスクリプティング)対応<br/>
	 * 無害化されたタグを元に戻します
	 * 
	 * @param str
	 * @return
	 */
	public static String convertUnsanitize(String str) {
		if (str == null) {
			return str;
		}
		str = str.replaceAll("&#39;", "'");
		str = str.replaceAll("&quot;", "\"");
		str = str.replaceAll("&gt;", ">");
		str = str.replaceAll("&lt;", "<");
		str = str.replaceAll("&amp;", "&");
		return str;
	}
}

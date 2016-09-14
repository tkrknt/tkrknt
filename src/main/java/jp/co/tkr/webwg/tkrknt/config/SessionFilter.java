/**
 * 
 */
package jp.co.tkr.webwg.tkrknt.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * セッションフィルタークラス<br/>
 * セッション対象外のURIを設定する。
 * @author hamakawa
 * @see http://blog.okazuki.jp/entry/2015/07/05/181818
 */
public class SessionFilter implements Filter {

	private static final String SESSION_EXLUSION1 = "/tkrknt";
	private static final String SESSION_EXLUSION2 = "/tkrknt/";
	private static final String SESSION_EXLUSION3 = "login";
	private static final String SESSION_EXLUSION4 = "logout";
	

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpSession session = request.getSession(false);
		if (null == session && !isSessionExclusion(request)) {
			// セッションが存在しない場合
			((HttpServletResponse)res).sendRedirect(SESSION_EXLUSION2);
		}
		chain.doFilter(req, res);
	}

	/**
	 * セッション除外対象
	 * @param req
	 * @return
	 */
	private boolean isSessionExclusion(HttpServletRequest req) {

		String url = req.getRequestURI();
		if(-1 == url.indexOf(SESSION_EXLUSION1)){
			return true;
		}else if (SESSION_EXLUSION1.equals(url)) {
			return true;
		} else if (SESSION_EXLUSION2.equals(url)) {
			return true;
		} else if (-1 < url.indexOf(SESSION_EXLUSION3)) {
			return true;
		} else if (-1 < url.indexOf(SESSION_EXLUSION4)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

	@Override
	public void destroy() {
	}
}

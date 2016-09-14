/**
 * 
 */
package jp.co.tkr.webwg.tkrknt.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * セッションタイムアウト時の挙動を定義する。(このクラスは使わない)
 * 
 * @author hamakawa
 * @see http://qiita.com/T0000N/items/7d3450623da5bc27e116
 */
public class SessionExpireInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
//		if (isTarget(request)) {
//			// セッションタイムアウトのチェック
//			if (isSessionTimeout(request)) { // セッションタイムアウトの場合
//				// Ajax処理の場合は「セッションタイムアウトが発生しました。ログインしなおしてください。」というメッセージを返却する。
//				if (isAjaxRequest(request)) {
//					String message = "{\"success\":false,\"messages\":[\"セッションタイムアウトが発生しました。ログインしなおしてください。\"]}";
//					response.setContentType("text/html;charset=UTF-8");
//					// ステータスは200となるが、success = falseとする。
//					response.setStatus(HttpServletResponse.SC_OK);
//					response.getWriter().write(message);
//					return false;
//				} else {
//					String requestUri = request.getRequestURI();
//					// ログイン・ログアウト・タイムアウトページのタイムアウトは行わない。
//					if (!((request.getContextPath() + AppConst.URL_LOGIN_PAGE + "/timeout").equals(requestUri) //
//							|| (request.getContextPath() + AppConst.URL_LOGIN_PAGE).equals(requestUri) //
//							|| (request.getContextPath() + AppConst.URL_LOGOUT_COMPLETED_PAGE).equals(requestUri))) {
//						// 通常画面の場合は、ログイン画面を表示しセッションタイムアウトメッセージを伝える。
//						response.sendRedirect(request.getContextPath() + AppConst.URL_LOGIN_PAGE + "/timeout");
//					}
//				}
//			}
//		}
		return true;
	}

//	/**
//	 * 対象のリクエストか判定 css, js, favicon等のリソースアクセスについては出力対象外
//	 *
//	 * @param request
//	 *            リクエスト
//	 * @return true : ロギング対象 / false : ロギング対象ではない
//	 */
//	private boolean isTarget(ServletRequest request) {
//		String uri = ((HttpServletRequest) request).getRequestURI();
//		return (uri.indexOf("/static") < 0 && uri.indexOf("/favicon.ico") < 0);
//	}
//
//	/**
//	 * Ajaxリクエスト判定
//	 *
//	 * @param request
//	 *            リクエスト
//	 * @return true : Ajaxリクエスト / false : そうではない
//	 */
//	private boolean isAjaxRequest(ServletRequest request) {
//		return StringUtils.equals("XMLHttpRequest", ((HttpServletRequest) request).getHeader("X-Requested-With"));
//	}
//
//	/**
//	 * セッションタイムアウト判定
//	 *
//	 * @param request
//	 * @return
//	 */
//	private boolean isSessionTimeout(HttpServletRequest request) {
//		HttpSession falsecurrentSession = request.getSession(false);
//		if (falsecurrentSession == null) {
//			return true;
//		}
//		String requestSession = request.getRequestedSessionId();
//		boolean isValid = request.isRequestedSessionIdValid();
//		return falsecurrentSession == null || requestSession == null || !isValid
//				|| !requestSession.equals(falsecurrentSession.getId());
//	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}
}
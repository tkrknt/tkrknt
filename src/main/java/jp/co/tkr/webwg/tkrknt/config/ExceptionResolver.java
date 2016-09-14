/**
 * 
 */
package jp.co.tkr.webwg.tkrknt.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * エラーハンドリングクラス
 * 
 * @see http://qiita.com/opengl-8080/items/05d9490d6f0544e2351a
 * @author hamakawa
 *
 */
@Component
public class ExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		
		// restの場合
		if (isRestController(handler)) {
			return null;
		}

		// 通常の画面遷移の場合
		ModelAndView mv = new ModelAndView();
		mv.setViewName("error");

		return mv;
	}

	/**
	 * restアクセスか判定する。
	 * 
	 * @param handler
	 * @return
	 */
	private boolean isRestController(Object handler) {
		if (handler instanceof HandlerMethod) {
			HandlerMethod method = (HandlerMethod) handler;
			return method.getMethod().getDeclaringClass().isAnnotationPresent(RestController.class);
		}
		return false;
	}

	// /**
	// * エラーページに遷移する。
	// @see http://kiririmode.hatenablog.jp/entry/20140617/p1
	// * @param e
	// * @return
	// */
	// @ExceptionHandler(Exception.class)
	// public String exception(Exception e) {
	// return "error";
	// }
}
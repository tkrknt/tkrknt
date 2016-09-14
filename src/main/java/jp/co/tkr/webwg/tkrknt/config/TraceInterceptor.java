/**
 * 
 */
package jp.co.tkr.webwg.tkrknt.config;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 実行ログ出力クラス（メソッド単位）
 * 
 * @author hamakawa
 * @see http://d.hatena.ne.jp/Kazuhira/20151012/1444647598
 *
 */
@Aspect
@Component
public class TraceInterceptor {

	private final Logger log = LoggerFactory.getLogger(getClass());

	/**
	 * サービス終了ログを出力する。
	 * 
	 * @param joinPoint
	 */
	@Before("execution(* jp.co.tkr.webwg.tkrknt.controller.*.*(..))")
	// @Before("execution(* jp.co.tkr.webwg.tkrknt.service.*.*(..))")
	public void invokeBefore(JoinPoint joinPoint) {
		log.info("[メソッド終了] パラメーター:" + Arrays.toString(joinPoint.getArgs()) + " "
				+ joinPoint.getTarget().getClass() + ":" + joinPoint.getSignature().getName());
		// JoinPoint#getThisの場合は、拡張されたオブジェクトが返る
	}

	/**
	 * サービス開始ログを出力する。
	 * 
	 * @param joinPoint
	 */
	@Around("execution(* jp.co.tkr.webwg.tkrknt.controller.*.*(..))")
	// @Around("execution(* jp.co.tkr.webwg.tkrknt.service.*.*(..))")
	public Object invoke(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		Object ret = null;
		try {
			log.info("[メソッド開始] パラメーター:" + Arrays.toString(proceedingJoinPoint.getArgs()) + " "
					+ proceedingJoinPoint.getTarget().getClass() + ":" + proceedingJoinPoint.getSignature().getName());

			ret = proceedingJoinPoint.proceed();
		} catch (Exception e) {
			// エラーログ
			log.error("エラー：："+proceedingJoinPoint.getTarget().getClass() + ":" + proceedingJoinPoint.getSignature().getName(),e);
			throw e;
		}
		return ret;
	}
}
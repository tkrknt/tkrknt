/**
 * 
 */
package jp.co.tkr.webwg.tkrknt.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * 入力チェッククラス
 * @author hamakawa
 * @see http://d.hatena.ne.jp/Yosuke_Taka/20110827/1314413434
 */
public class ValidatorUtil {
	
	/**
	 * Hibernate Validatorの入力チェックを実施する。
	 * @param t
	 * @return　入力チェックの結果のリスト
	 */
	public static <T> List<ValidatorResult> validator(T t){
		
		List<ValidatorResult> validatorResultVoList = new ArrayList<ValidatorResult>();
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);
        if (constraintViolations.size() > 0) {
            Iterator<ConstraintViolation<T>> iterator = constraintViolations.iterator();
            while (iterator.hasNext()) {
            	ConstraintViolation<T> cv = iterator.next();
            	ValidatorResult vo =new ValidatorResult(cv.getPropertyPath().toString(),cv.getMessage());
            	validatorResultVoList.add(vo);
            }
        }
		return validatorResultVoList;
	}

}

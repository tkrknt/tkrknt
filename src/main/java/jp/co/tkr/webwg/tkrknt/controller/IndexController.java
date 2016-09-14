/**
 * 
 */
package jp.co.tkr.webwg.tkrknt.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.tkr.webwg.tkrknt.form.LoginForm;

/**
 * 勤怠管理システムログイン・ログアウトを制御コントローラーする。
 * 
 * @author hamakawa
 *
 */
@Scope("request")
@Controller
public class IndexController extends BaseController{

//	@Autowired
//	private EmployeeService employeeService;

	/**
	 * 初期表示(ログイン画面)
	 * @param model
	 * @return
	 */
	@RequestMapping(value = {"/tkrknt", "/tkrknt/"})
	public String index(LoginForm loginForm) {
		loginForm.clearFrom();
		clearSession();
		return "login";
	}

	/**
	 * ログイン認証を行う。
	 * @param userId
	 * @param password
	 * @return
	 */
	@RequestMapping("/tkrknt/login")
	public String login(LoginForm loginForm) {
		
		// 入力チェック
		if(!loginForm.formValidate()){
			return "login";
		}
		
//		// ログイン認証
//		LoginUserInfoVo loginUser = employeeService.employeeAuth(loginForm.getMailAddress(), loginForm.getPassword());
//		if(null==loginUser){
//			loginForm.setErrorMsg("メールアドレスまたはパスワードが違います。");
//			return "login";
//		}else{
//			setSessionUserInfo(loginUser);
//			return "forward:/tkrknt/workreport/list";
//		}
		
		return "forward:/tkrknt/workreport/list";
	}
	
	/**
	 * ログアウトを実施する。
	 * @return
	 */
	@RequestMapping("/tkrknt/logout")
	public String logout(){
		clearSession();
		return "login";
	}
}

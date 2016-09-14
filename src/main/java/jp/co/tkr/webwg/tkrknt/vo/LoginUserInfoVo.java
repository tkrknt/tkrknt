/**
 * 
 */
package jp.co.tkr.webwg.tkrknt.vo;

import jp.co.tkr.webwg.tkrknt.domain.employee.Department;
import jp.co.tkr.webwg.tkrknt.domain.employee.Employee;

/**
 * ログインユーザーの社員情報保持クラス<br>
 * ログインユーザーのセッション保持クラス
 * 
 * @author hamakawa
 *
 */
public class LoginUserInfoVo {

	/** セッション保持名称 */
	public static final String SESSION_LOGIN_INFO = "session_login_info";

	/** 所属情報ID */
	private Long departmentID;

	/** 所属情報名称 */
	private String departmentName;

	/** 社員情報ID */
	private Long employeeId;

	/** 社員名 */
	private String employeeName;

	/** メールアドレス */
	private String mailAddress;

	/** パスワード */
	private String password;

	/** 権限 */
	private Integer auth;

	/** 権限名称 */
	private String authName;

	/**
	 * セッションで管理するログインユーザーの情報を設定する。
	 * @param employee
	 */
	public LoginUserInfoVo(Employee employee) {
		Department department = employee.getDepartment();
		departmentID = department.getDepartmentID();
		departmentName = department.getDepartmentName();
		employeeId = employee.getEmployeeId();
		employeeName = employee.getEmployeeName();
		mailAddress = employee.getMailAddress();
		password = employee.getPassword();
		auth = employee.getAuth();
		authName = employee.getAuthName();
	}

	public static String getSessionLoginInfo() {
		return SESSION_LOGIN_INFO;
	}

	public Long getDepartmentID() {
		return departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public Integer getAuth() {
		return auth;
	}

	public String getAuthName() {
		return authName;
	}

}

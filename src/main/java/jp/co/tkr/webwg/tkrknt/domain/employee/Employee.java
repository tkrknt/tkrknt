/**
 * 
 */
package jp.co.tkr.webwg.tkrknt.domain.employee;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.util.StringUtils;

/**
 * 社員情報エンティティー
 * 
 * @author hamakawa
 *
 */
@Table(name = "employee_tbl")
@Entity
public class Employee implements Serializable {
	private static final long serialVersionUID = 8579081059685935939L;

	/** 社員情報ID */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private Long employeeId;
	
	/** 所属情報ID */
	@Column(name = "department_id")
	private Long departmentId;

	/** 社員名 */
	@Column(name = "employee_name")
	private String employeeName;

	/** メールアドレス */
	@Column(name = "mail_address")
	private String mailAddress;

	/** パスワード */
	@Column(name = "password")
	private String password;

	/** 権限 */
	@Column(name = "auth")
	private Integer auth;

	/** 所属エンティティー */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id", referencedColumnName = "department_id",insertable=false, updatable=false)
	private Department department;

	public Employee() {
	}

	/**
	 * パスワードのチェックを行う。
	 * 
	 * @param password
	 * @return
	 */
	public boolean checkPassword(String password) {
		if (StringUtils.isEmpty(password)) {
			// パスワードが設定されていない場合
			return false;
		} else if (password.equals(this.password)) {
			// パスワードが同じ場合
			return true;
		} else {
			// パスワードが違う場合
			return false;
		}
	}

	/**
	 * 権限の名称を取得する。
	 * 
	 * @return
	 */
	public String getAuthName() {
		for (EmployeeAuth employeeAuth : EmployeeAuth.values()) {
			if (auth == employeeAuth.getKey()) {
				return employeeAuth.getValue();
			}
		}
		return null;
	}

	/**
	 * 社員権限
	 * 
	 * @author hamakawa
	 */
	public enum EmployeeAuth {
		EMPLOYEE_AUTH_ROOT(1, "システム管理者"), 
		EMPLOYEE_AUTH_STAFF(2, "一般社員"), 
		EMPLOYEE_AUTH_MANAGER(3, "管理者");

		private Integer key;
		private String value;

		EmployeeAuth(Integer key, String value) {
			this.key = key;
			this.value = value;
		}

		public Integer getKey() {
			return this.key;
		}

		public String getValue() {
			return this.value;
		}
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	
	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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

	public Integer getAuth() {
		return auth;
	}

	public void setAuth(Integer auth) {
		this.auth = auth;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}

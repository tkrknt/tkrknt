/**
 *
 */
package jp.co.tkr.webwg.tkrknt.domain.employee;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 社員情報エンティティー
 *
 * @author hamakawa
 *
 */
@Table(name = "employee_info")
@Entity
public class EmployeeInfo implements Serializable {

	/**社員情報ID*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_info_id")
	private Long employeeInfoId;

	/**社員姓*/
	@Column(name = "employee_surname")
	private String employeeSurname;

	/**社員名*/
	@Column(name = "employee_name")
	private String employeeName;

	/**社員姓カナ*/
	@Column(name = "employee_surname_kana")
	private String employeeSurnameKana;

	/**社員名カナ*/
	@Column(name = "employee_name_kana")
	private String employeeNameKana;

	/**メールアドレス*/
	@Column(name = "employee_mailaddress")
	private String employeeMailaddress;

	/**パスワード*/
	@Column(name = "employee_password")
	private String employeePassword;

	/**権限*/
	@Column(name = "authority_division")
	private Long authorityDivision;

	/**登録ユーザー*/
	@Column(name = "entry_user_name")
	private String entryUserName;

	/**登録日付*/
	@Column(name = "entry_time")
	private Timestamp entryTime;

	/**更新ユーザー*/
	@Column(name = "update_user_name")
	private String updateUserName;

	/**更新日付*/
	@Column(name = "update_time")
	private Timestamp updateTime;

	public Long getEmployeeInfoId() {
		return employeeInfoId;
	}

	public void setEmployeeInfoId(Long employeeInfoId) {
		this.employeeInfoId = employeeInfoId;
	}

	public String getEmployeeSurname() {
		return employeeSurname;
	}

	public void setEmployeeSurname(String employeeSurname) {
		this.employeeSurname = employeeSurname;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeSurnameKana() {
		return employeeSurnameKana;
	}

	public void setEmployeeSurnameKana(String employeeSurnameKana) {
		this.employeeSurnameKana = employeeSurnameKana;
	}

	public String getEmployeeNameKana() {
		return employeeNameKana;
	}

	public void setEmployeeNameKana(String employeeNameKana) {
		this.employeeNameKana = employeeNameKana;
	}

	public String getEmployeeMailaddress() {
		return employeeMailaddress;
	}

	public void setEmployeeMailaddress(String employeeMailaddress) {
		this.employeeMailaddress = employeeMailaddress;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	public Long getAuthorityDivision() {
		return authorityDivision;
	}

	public void setAuthorityDivision(Long authorityDivision) {
		this.authorityDivision = authorityDivision;
	}

	public String getEntryUserName() {
		return entryUserName;
	}

	public void setEntryUserName(String entryUserName) {
		this.entryUserName = entryUserName;
	}

	public Timestamp getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Timestamp entryTime) {
		this.entryTime = entryTime;
	}

	public String getUpdateUserName() {
		return updateUserName;
	}

	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
}

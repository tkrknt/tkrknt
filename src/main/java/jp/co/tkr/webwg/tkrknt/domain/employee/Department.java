/**
 *
 */
package jp.co.tkr.webwg.tkrknt.domain.employee;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 所属エンティティー
 *
 * @author hamakawa
 *
 */
@Table(name = "department_tbl")
@Entity
public class Department implements Serializable {
	private static final long serialVersionUID = -4931159161758263359L;

	@OneToMany(mappedBy="employeeInfoId")
	private EmployeeInfo employeeInfo;

	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	/** 所属情報ID */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "department_id")
	private Long departmentID;

	/** 所属情報名称 */
	@Column(name = "department_name")
	private String departmentName;

	/** 社員情報エンティティー */
	@OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
	private List<Employee> employeeList;

	public Department() {
	}

	public Long getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(Long departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

}

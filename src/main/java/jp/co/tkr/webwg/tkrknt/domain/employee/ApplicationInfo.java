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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 申請情報エンティティー
 *
 * @author hamakawa
 *
 */
@Table(name = "application_info")
@Entity
public class ApplicationInfo implements Serializable {

	@OneToOne
	private EmployeeInfo employeeInfo;

	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	@OneToMany(mappedBy="applicationDetailInfoId")
	private ApplicationInfoDetails applicationInfoDetails;

	public ApplicationInfoDetails getApplicationInfoDetails() {
		return applicationInfoDetails;
	}

	public void setApplicationInfoDetails(ApplicationInfoDetails applicationInfoDetails) {
		this.applicationInfoDetails = applicationInfoDetails;
	}

	@OneToOne
	private WorkReport workReport;

	public WorkReport getWorkReport() {
		return workReport;
	}

	public void setWorkReport(WorkReport workReport) {
		this.workReport = workReport;
	}

	/**申請情報ID*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "application_info_id")
	private Long applicationInfoId;

	/**申請内容*/
	@Column(name = "application_contents")
	private String applicationContents;

	/**申請日*/
	@Column(name = "application_time")
	private Timestamp applicationTime;

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

	public Long getApplicationInfoId() {
		return applicationInfoId;
	}

	public void setApplicationInfoId(Long applicationInfoId) {
		this.applicationInfoId = applicationInfoId;
	}

	public String getApplicationContents() {
		return applicationContents;
	}

	public void setApplicationContents(String applicationContents) {
		this.applicationContents = applicationContents;
	}

	public Timestamp getApplicationTime() {
		return applicationTime;
	}

	public void setApplicationTime(Timestamp applicationTime) {
		this.applicationTime = applicationTime;
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

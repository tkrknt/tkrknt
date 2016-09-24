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
 * 勤務報告書テンプレートエンティティー
 *
 * @author hamakawa
 *
 */
@Table(name = "work_report_template")
@Entity
public class WorkReportTemplate implements Serializable {

	/**勤務報告書テンプレートID*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "work_report_template_id")
	private Long workReportTemplateId;

	/**社員情報ID*/
	@Column(name = "staff_info_id")
	private Long staffInfoId;

	/**所属グループ名称*/
	@Column(name = "affiliation_name")
	private String affiliationName;

	/**プロジェクト先名称*/
	@Column(name = "project_name")
	private String projectName;

	/**開始時間*/
	@Column(name = "start_worling_time")
	private String startWorlingTime;

	/**終了時間*/
	@Column(name = "end_worling_time")
	private String endWorlingTime;

	/**昼休時間*/
	@Column(name = "lunch_time")
	private String lunchTime;

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

	public Long getWorkReportTemplateId() {
		return workReportTemplateId;
	}

	public void setWorkReportTemplateId(Long workReportTemplateId) {
		this.workReportTemplateId = workReportTemplateId;
	}

	public Long getStaffInfoId() {
		return staffInfoId;
	}

	public void setStaffInfoId(Long staffInfoId) {
		this.staffInfoId = staffInfoId;
	}

	public String getAffiliationName() {
		return affiliationName;
	}

	public void setAffiliationName(String affiliationName) {
		this.affiliationName = affiliationName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStartWorlingTime() {
		return startWorlingTime;
	}

	public void setStartWorlingTime(String startWorlingTime) {
		this.startWorlingTime = startWorlingTime;
	}

	public String getEndWorlingTime() {
		return endWorlingTime;
	}

	public void setEndWorlingTime(String endWorlingTime) {
		this.endWorlingTime = endWorlingTime;
	}

	public String getLunchTime() {
		return lunchTime;
	}

	public void setLunchTime(String lunchTime) {
		this.lunchTime = lunchTime;
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

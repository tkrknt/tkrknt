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
 * 勤怠報告書エンティティー
 *
 * @author hamakawa
 *
 */
@Table(name = "work_report")
@Entity
public class WorkReport implements Serializable {

	/**勤務報告ID*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "work_report_id")
	private Long workReportId;

	/**社員情報ID*/
	@Column(name = "staff_info_id")
	private Long staffInfoId;

	/**勤務報告年月*/
	@Column(name = "work_report_ym")
	private String workReportYm;

	/**所属グループ名称*/
	@Column(name = "affiliation_name")
	private String affiliationName;

	/**プロジェクト名*/
	@Column(name = "project_name")
	private String projectName;

	/**勤務日数*/
	@Column(name = "working_days")
	private String workingDays;

	/**有給休暇日数*/
	@Column(name = "paid_vacations_days")
	private String paidVacationsDays;

	/**欠勤日数*/
	@Column(name = "absenteeism_days")
	private String absenteeismDays;

	/**特別休暇日数*/
	@Column(name = "special_vacations_days")
	private String specialVacationsDays;

	/**休日出勤日数*/
	@Column(name = "holiday_working_days")
	private String holidayWorkingDays;

	/**時間外勤務時間(月)*/
	@Column(name = "monthly_overtime_working_hours")
	private String monthlyOvertimeWorkingHours;

	/**休日勤務時間(月)*/
	@Column(name = "monthly_holiday_working_hours")
	private String monthlyHolidayWorkingHours;

	/**深夜勤務時間(月)*/
	@Column(name = "monthly_latetime_working_hours")
	private String monthlyLatetimeWorkingHours;

	/**遅刻・早退回数*/
	@Column(name = "monthly_late_and_early_times")
	private String monthlyLateAndEarlyTimes;

	/**実働時間(月)*/
	@Column(name = "monthly_total_working_hours")
	private String monthlyTotalWorkingHours;

	/**振替代休*/
	@Column(name = "instead_vacations_days")
	private String insteadVacationsDays;

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

	public Long getWorkReportId() {
		return workReportId;
	}

	public void setWorkReportId(Long workReportId) {
		this.workReportId = workReportId;
	}

	public Long getStaffInfoId() {
		return staffInfoId;
	}

	public void setStaffInfoId(Long staffInfoId) {
		this.staffInfoId = staffInfoId;
	}

	public String getWorkReportYm() {
		return workReportYm;
	}

	public void setWorkReportYm(String workReportYm) {
		this.workReportYm = workReportYm;
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

	public String getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(String workingDays) {
		this.workingDays = workingDays;
	}

	public String getPaidVacationsDays() {
		return paidVacationsDays;
	}

	public void setPaidVacationsDays(String paidVacationsDays) {
		this.paidVacationsDays = paidVacationsDays;
	}

	public String getAbsenteeismDays() {
		return absenteeismDays;
	}

	public void setAbsenteeismDays(String absenteeismDays) {
		this.absenteeismDays = absenteeismDays;
	}

	public String getSpecialVacationsDays() {
		return specialVacationsDays;
	}

	public void setSpecialVacationsDays(String specialVacationsDays) {
		this.specialVacationsDays = specialVacationsDays;
	}

	public String getHolidayWorkingDays() {
		return holidayWorkingDays;
	}

	public void setHolidayWorkingDays(String holidayWorkingDays) {
		this.holidayWorkingDays = holidayWorkingDays;
	}

	public String getMonthlyOvertimeWorkingHours() {
		return monthlyOvertimeWorkingHours;
	}

	public void setMonthlyOvertimeWorkingHours(String monthlyOvertimeWorkingHours) {
		this.monthlyOvertimeWorkingHours = monthlyOvertimeWorkingHours;
	}

	public String getMonthlyHolidayWorkingHours() {
		return monthlyHolidayWorkingHours;
	}

	public void setMonthlyHolidayWorkingHours(String monthlyHolidayWorkingHours) {
		this.monthlyHolidayWorkingHours = monthlyHolidayWorkingHours;
	}

	public String getMonthlyLatetimeWorkingHours() {
		return monthlyLatetimeWorkingHours;
	}

	public void setMonthlyLatetimeWorkingHours(String monthlyLatetimeWorkingHours) {
		this.monthlyLatetimeWorkingHours = monthlyLatetimeWorkingHours;
	}

	public String getMonthlyLateAndEarlyTimes() {
		return monthlyLateAndEarlyTimes;
	}

	public void setMonthlyLateAndEarlyTimes(String monthlyLateAndEarlyTimes) {
		this.monthlyLateAndEarlyTimes = monthlyLateAndEarlyTimes;
	}

	public String getMonthlyTotalWorkingHours() {
		return monthlyTotalWorkingHours;
	}

	public void setMonthlyTotalWorkingHours(String monthlyTotalWorkingHours) {
		this.monthlyTotalWorkingHours = monthlyTotalWorkingHours;
	}

	public String getInsteadVacationsDays() {
		return insteadVacationsDays;
	}

	public void setInsteadVacationsDays(String insteadVacationsDays) {
		this.insteadVacationsDays = insteadVacationsDays;
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

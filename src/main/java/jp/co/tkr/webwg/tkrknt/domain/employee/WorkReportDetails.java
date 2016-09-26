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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 勤務報告書詳細エンティティー
 *
 * @author hamakawa
 *
 */
@Table(name = "work_report_wetails")
@Entity
public class WorkReportDetails implements Serializable {

	public WorkReport getWorkReport() {
		return workReport;
	}

	public void setWorkReport(WorkReport workReport) {
		this.workReport = workReport;
	}

	@ManyToOne
	private WorkReport workReport;

	/**勤務報告書詳細ID*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "work_report_details_id")
	private Long workReportDetailsId;

	/**勤務報告書ID*/
	@Column(name = "work_report_id")
	private Long workReportId;

	/**勤務報告日*/
	@Column(name = "work_report_day")
	private Long workReportDay;

	/**曜日*/
	@Column(name = "day_of_the_week")
	private String dayOfTheWeek;

	/**休日*/
	@Column(name = "holiday_flag")
	private String holidayFlag;

	/**開始時間*/
	@Column(name = "start_worling_time")
	private String startWorlingTime;

	/**終了時間*/
	@Column(name = "end_worling_time")
	private String endWorlingTime;

	/**昼休時間*/
	@Column(name = "lunch_time")
	private String lunchTime;

	/**実働時間(日)*/
	@Column(name = "daily_total_working_hours")
	private String dailyTotalWorkingHours;

	/**時間外勤務時間(日)*/
	@Column(name = "daily_overtime_working_hours")
	private String dailyOvertimeWorkingHours;

	/**深夜勤務時間(日)*/
	@Column(name = "daily_latetime_working_hours")
	private String dailyLatetimeWorkingHours;

	/**振替代休時間(日)*/
	@Column(name = "daily_instead_vacations_hours")
	private String dailyInsteadVacationsHours;

	/**出勤ステータス*/
	@Column(name = "attendance_state")
	private String attendanceState;

	/**作業内容*/
	@Column(name = "work_contenes")
	private String workContenes;

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
}

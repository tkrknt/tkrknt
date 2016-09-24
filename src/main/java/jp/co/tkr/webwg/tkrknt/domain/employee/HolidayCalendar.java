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
 * TCS休日カレンダーエンティティー
 *
 * @author hamakawa
 *
 */
@Table(name = "holiday_calendar")
@Entity
public class HolidayCalendar implements Serializable {

	/** TCS休日ID */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "holiday_calendar_id")
	private Long holidayCalendarId;

	/**年月*/
	@Column(name = "holiday_ym")
	private String holidayYm;

	/**日*/
	@Column(name = "holiday_date")
	private String holidayDate;

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

	public Long getHolidayCalendarId() {
		return holidayCalendarId;
	}

	public void setHolidayCalendarId(Long holidayCalendarId) {
		this.holidayCalendarId = holidayCalendarId;
	}

	public String getHolidayYm() {
		return holidayYm;
	}

	public void setHolidayYm(String holidayYm) {
		this.holidayYm = holidayYm;
	}

	public String getHolidayDate() {
		return holidayDate;
	}

	public void setHolidayDate(String holidayDate) {
		this.holidayDate = holidayDate;
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

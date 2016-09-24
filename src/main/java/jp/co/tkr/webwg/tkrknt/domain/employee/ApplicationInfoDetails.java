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
 * 申請情報詳細エンティティー
 *
 * @author hamakawa
 *
 */
@Table(name = "Application_info_details")
@Entity
public class ApplicationInfoDetails implements Serializable {

	/**申請情報詳細ID*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "application_detail_info_id")
	private Long applicationDetailInfoId;

	/**申請情報ID*/
	@Column(name = "application_info_id")
	private Long applicationInfoId;

	/**申請順序*/
	@Column(name = "application_order")
	private Long applicationOrder;

	/**申請ステータス*/
	@Column(name = "application_division")
	private Long applicationDivision;

	/**決済日*/
	@Column(name = "settlement_date")
	private Timestamp settlementDate;

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

	public Long getApplicationDetailInfoId() {
		return applicationDetailInfoId;
	}

	public void setApplicationDetailInfoId(Long applicationDetailInfoId) {
		this.applicationDetailInfoId = applicationDetailInfoId;
	}

	public Long getApplicationInfoId() {
		return applicationInfoId;
	}

	public void setApplicationInfoId(Long applicationInfoId) {
		this.applicationInfoId = applicationInfoId;
	}

	public Long getApplicationOrder() {
		return applicationOrder;
	}

	public void setApplicationOrder(Long applicationOrder) {
		this.applicationOrder = applicationOrder;
	}

	public Long getApplicationDivision() {
		return applicationDivision;
	}

	public void setApplicationDivision(Long applicationDivision) {
		this.applicationDivision = applicationDivision;
	}

	public Timestamp getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(Timestamp settlementDate) {
		this.settlementDate = settlementDate;
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

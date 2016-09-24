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
 * 所属情報エンティティー
 *
 * @author hamakawa
 *
 */
@Table(name = "affiliation_info")
@Entity
public class AffiliationInfo implements Serializable {

	/**所属ID*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "affiliation_info_id")
	private Long affiliationInfoId;

	/**所属グループ名称*/
	@Column(name = "affiliation_name")
	private String affiliationName;

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

	public Long getAffiliationInfoId() {
		return affiliationInfoId;
	}

	public void setAffiliationInfoId(Long affiliationInfoId) {
		this.affiliationInfoId = affiliationInfoId;
	}

	public String getAffiliationName() {
		return affiliationName;
	}

	public void setAffiliationName(String affiliationName) {
		this.affiliationName = affiliationName;
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

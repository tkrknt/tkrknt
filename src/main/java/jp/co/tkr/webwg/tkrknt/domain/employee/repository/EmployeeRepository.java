

/**
 * 
 */
package jp.co.tkr.webwg.tkrknt.domain.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jp.co.tkr.webwg.tkrknt.domain.employee.Employee;

/**
 * 社員情報リポジトリクラス
 * 
 * @author hamakawa
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	/**
	 * メールアドレスに一致する職員情報を取得する。
	 * @param mailAddress
	 * @return
	 */
	@Query("SELECT e FROM Employee e WHERE e.mailAddress = :mailAddress")
	Employee findByMailAddress(@Param("mailAddress") String mailAddress);
}

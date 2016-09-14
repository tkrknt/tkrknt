/**
 * 
 */
package jp.co.tkr.webwg.tkrknt.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Bootの設定クラス
 * @author hamakawa
 * @see http://qiita.com/ksby/items/7a2cb97215b252bf41b1
 */
@Configuration
public class ApplicationConfig {

	/**
	 * Spring Boot で log4jdbc-log4j2 を使用してデバッグSQLを出力する
	 * @return
	 */
    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
    
    /**
     * セッションフィルター設定
     * @return
     */
    @Bean
    SessionFilter sessionFilter() {
        return new SessionFilter();
    }

}
package jp.co.tkr.webwg.tkrknt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import jp.co.tkr.webwg.tkrknt.TkrkntApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TkrkntApplication.class)
@WebAppConfiguration
public class TkrkntApplicationTests {

	@Test
	public void contextLoads() {
	}

}

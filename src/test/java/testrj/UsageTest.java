package testrj;

import org.junit.Test;

import rjson.utils.RjsonUtil;
import testrj.domain.SerializedData;

public class UsageTest {
	@Test public void sampleUsage() {
		SerializedData sd = new SerializedData();
//		sd.setSerializedData("Hello World".getBytes());
		
		String data = RjsonUtil.completeSerializer().toJson(sd);
		System.out.println(data);
	}
}
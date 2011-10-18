package testrj;

import org.junit.Test;

import rjson.utils.RjsonUtil;
import testrj.domain.RecordedObject;

public class UsageTest {
	@Test public void sampleUsage() {
		RecordedObject ro = new RecordedObject();
		String json = RjsonUtil.reformat(RjsonUtil.completeSerializer().toJson(ro));
		System.out.println(json);
	}
}
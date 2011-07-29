package testrj.methodundertest;

import java.io.IOException;

import org.junit.Test;

import rjson.utils.RjsonUtil;
import testrj.MethodUnderTest;
import testrj.sample.controller.SomeComplexController;
import zen.Then;

public class IsTest {
	@Test
	public void isCalledWithAllParameters() throws IOException {
		MethodUnderTest actualObject = MethodUnderTest.is(new SomeComplexController(), "someComplexMethod");
		Object expectedObject = RjsonUtil.fileAsObject("./src/test/java/DATA-testrj.methodundertest/default-object.txt");
		Then.assertJsonEquals(expectedObject, actualObject);
	}
}
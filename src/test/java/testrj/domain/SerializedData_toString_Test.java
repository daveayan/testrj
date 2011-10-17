package testrj.domain;

import java.io.IOException;

import org.junit.Test;

import rjson.utils.RjsonUtil;
import zen.Given;
import zen.Then;
import zen.When;


public class SerializedData_toString_Test {
	private String location = "./src/test/java/DATA-testrj.domain.SerializedData/";
	
	@Test
	public void when_its_a_new_object_then_returns_blank_string() throws IOException {
		Given given = Given.objectUnderTestIs(RjsonUtil.fileAsObject(location + "null-value.txt"));
		When when = given.when("toString");
		Then then = when.methodIsCalledWith();
		then.assertThatReturnValueIsSameAs("");
	}
	
	@Test
	public void when_its_an_object_with_string_then_returns_string() throws IOException {
		Given given = Given.objectUnderTestIs(RjsonUtil.fileAsObject(location + "string-value.txt"));
		When when = given.when("toString");
		Then then = when.methodIsCalledWith();
		then.assertThatReturnValueIsSameAs("Hello World");
	}
}
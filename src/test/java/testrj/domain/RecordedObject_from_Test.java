package testrj.domain;

import java.io.IOException;

import org.junit.Test;

import rjson.utils.RjsonUtil;
import testrj.sample.domain.Person;
import zen.Assert;

public class RecordedObject_from_Test {
	private String location = "./src/test/java/DATA-testrj.domain.RecordedObject/";
	
	@Test 
	public void when_input_is_null() throws IOException {
		RecordedObject actualObject = RecordedObject.from(null);
		RecordedObject expectedObject = (RecordedObject) RjsonUtil.fileAsObject(location + "for-null-value.txt");
		Assert.thatEquals(expectedObject, actualObject);
	}
	
//	@Test 
	public void when_input_is_a_empty_String() throws IOException {
		RecordedObject actualObject = RecordedObject.from("");
		RecordedObject expectedObject = (RecordedObject) RjsonUtil.fileAsObject(location + "for-empty-string.txt");
		Assert.thatEquals(expectedObject, actualObject);
	}
	
	@Test 
	public void when_input_is_a_String() throws IOException {
		RecordedObject actualObject = RecordedObject.from("Hello World");
		RecordedObject expectedObject = (RecordedObject) RjsonUtil.fileAsObject(location + "for-valid-string.txt");
		Assert.thatEquals(expectedObject, actualObject);
	}
	
	@Test public void when_input_is_a_fully_loaded_object() throws IOException {
		RecordedObject actualObject = RecordedObject.from(Person.getFullyLoadedInstance());
		RecordedObject expectedObject = (RecordedObject) RjsonUtil.fileAsObject(location + "for-fully-loaded-person-object.txt");
		Assert.thatEquals(expectedObject, actualObject);
	}
}
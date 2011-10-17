package testrj.sample.domain;

import rjson.Rjson;
import rjson.printer.Printer;
import rjson.transformer.JsonToObjectTransformer;
import rjson.transformer.ObjectToJsonTransformer;
import transformers.Context;

public class SampleBothTransformer implements ObjectToJsonTransformer, JsonToObjectTransformer {
	public boolean canConvertToJson(Object object) {
		return false;
	}

	public void transformToJson(Object object, Printer printer, Rjson rjson) {

	}

	public boolean canConvertToObject(Object object) {
		return false;
	}

	public Object transformJsonToObject(Object object, Rjson rjson) {
		return null;
	}

	public boolean canTransform(Object from, Class<?> to, Context context) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object transform(Object from, Class<?> to, Context context) {
		// TODO Auto-generated method stub
		return null;
	}
}
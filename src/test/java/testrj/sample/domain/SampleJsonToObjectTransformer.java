package testrj.sample.domain;

import rjson.Rjson;
import rjson.transformer.JsonToObjectTransformer;
import transformers.Context;

public class SampleJsonToObjectTransformer implements JsonToObjectTransformer {
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
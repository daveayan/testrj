package testrj.domain;

import java.util.ArrayList;
import java.util.List;

public class RecordedObject {
	protected Object parameter;
    protected String type;
    protected String referenceName;
    protected transient SerializedData serializedData = new VoidSerializedData();

    @SuppressWarnings("unchecked")
	public boolean isParameterUpdated() {
            return !serializedData.equals(TestrjConfig.data_serializer.serialize(parameter));
    }

    public RecordedObject reserialize() {
            RecordedObject newRecordedObject = new RecordedObject();
            newRecordedObject.setParameter(parameter);
            return newRecordedObject;
    }

    public boolean isSymbolicPrimitive() {
            if (getParameter().getClass().isPrimitive() || !getSerializedData().toString().contains("\"class\":"))
                    return true;
            return false;
    }

    public static RecordedObject from(Object object) {
            if (object == null) {
                    return nullValue();
            } else {
                    RecordedObject recordedObject = new RecordedObject();
                    recordedObject.setParameter(object);
                    return recordedObject;
            }
    }

    public static List<RecordedObject> listFromArrayOfParameters(Object[] inputParams) {
            List<RecordedObject> listOfRecordedObjects = new ArrayList<RecordedObject>();
            for (Object param : inputParams) {
                    listOfRecordedObjects.add(from(param));
            }
            return listOfRecordedObjects;
    }

    public boolean isVoid() {
            return false;
    }

    public boolean isNull() {
            return false;
    }

    public Object getParameter() {
            return parameter;
    }

    @SuppressWarnings("unchecked")
	public void setParameter(Object parameter) {
            this.parameter = parameter;
            if (parameter != null) {
                    this.type = parameter.getClass().getName();
                    this.serializedData = TestrjConfig.data_serializer.serialize(parameter);
            }
    }

    public String className() {
            return this.getParameter().getClass().getName();
    }

    public String getType() {
            return type;
    }

    public String getReferenceName() {
            return referenceName;
    }

    public void setReferenceName(String referenceName) {
            this.referenceName = referenceName;
    }

    public static RecordedObject voidValue() {
            return new VoidValue();
    }

    public static RecordedObject nullValue() {
            return new NullValue();
    }

    public SerializedData getSerializedData() {
            return serializedData;
    }
}

class VoidValue extends RecordedObject {
    public VoidValue() {
            type = "void";
            serializedData = new VoidSerializedData();
    }

    public boolean isParameterUpdated() {
            return false;
    }

    public boolean isSymbolicPrimitive() {
            return false;
    }

    public String className() {
            return "void";
    }

    public boolean isVoid() {
            return true;
    }

    public boolean isNull() {
            return false;
    }
}

class NullValue extends RecordedObject {
    public NullValue() {
            type = "null";
            serializedData = new NullSerializedData();
    }

    public boolean isParameterUpdated() {
            return false;
    }

    public boolean isSymbolicPrimitive() {
            return false;
    }

    public String className() {
            return "null";
    }

    public boolean isVoid() {
            return false;
    }

    public boolean isNull() {
            return true;
    }
}
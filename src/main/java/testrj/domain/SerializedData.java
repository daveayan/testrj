package testrj.domain;

public class SerializedData {
	protected byte[] serializedData;

	public byte[] data() {
		return this.serializedData;
	}

	public String toString() {
		if (serializedData == null)
			return "";
		return new String(this.serializedData);
	}

	public SerializedData() {
	}

	public SerializedData(byte[] data) {
		this.serializedData = data;
	}

	public SerializedData(String stringdata) {
		if (stringdata != null)
			this.serializedData = stringdata.getBytes();
	}

	public boolean isVoid() {
		return false;
	}

	public boolean isNull() {
		return false;
	}

	@Override
	public boolean equals(Object input) {
		return this.toString().equals(input.toString());
	}
}

class VoidSerializedData extends SerializedData {
	public VoidSerializedData() {
		this.serializedData = "void".getBytes();
	}

	public boolean isVoid() {
		return true;
	}

	public boolean isNull() {
		return false;
	}
}

class NullSerializedData extends SerializedData {
	public NullSerializedData() {
		this.serializedData = "null".getBytes();
	}

	public boolean isVoid() {
		return false;
	}

	public boolean isNull() {
		return true;
	}
}
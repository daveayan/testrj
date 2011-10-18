package testrj.serializer;

import testrj.domain.SerializedData;

public interface Serializer<K> {
    public SerializedData serialize(K inputObject);

    public K deSerialize(SerializedData serializedInput);
}
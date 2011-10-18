package testrj.domain;

import testrj.serializer.RjsonSerializer;
import testrj.serializer.Serializer;

public class TestrjConfig {
	public static String testsFolderLocation = "./src/test/java/";
    public static Serializer data_serializer = new RjsonSerializer();
//    public static Serializer test_serializer = new JunitSerializer();
//    public static Persister persister = new LocalFileSystemPersister();
}
package testrj;

public class MethodUnderTest {

	public static MethodUnderTest is(Object objectUnderTest, String methodName) {
		MethodUnderTest mut = new MethodUnderTest();
		return mut;
	}

	public MethodUnderTest using(Object... parameters) {
		return this;
	}

	public MethodUnderTest returnValueIs(Object returnObject) {
		return this;
	}

	public MethodUnderTest persist() {
		return this;
	}

	public MethodUnderTest and() {
		return this;
	}

	public static MethodUnderTest newInstance() {
		return new MethodUnderTest();
	}

	private MethodUnderTest() {
	}
}
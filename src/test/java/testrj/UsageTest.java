package testrj;

import org.junit.Test;

import testrj.sample.controller.SomeComplexController;
import testrj.sample.domain.Account;
import testrj.sample.domain.Person;

public class UsageTest {
	@Test public void sampleUsage() {
		Person person = Person.getFullyLoadedInstance();
		Account account = new Account();
		SomeComplexController controller = new SomeComplexController();
		MethodUnderTest mut = MethodUnderTest.is(controller, "someComplexMethod").using(person, account);
		Object returnObject = controller.someComplexMethod(person, account);
		mut.returnValueIs(returnObject).and().persist();
	}
}
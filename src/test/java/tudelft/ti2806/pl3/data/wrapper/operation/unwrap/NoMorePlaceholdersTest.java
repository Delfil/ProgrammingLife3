package tudelft.ti2806.pl3.data.wrapper.operation.unwrap;

import static org.junit.Assert.fail;

import tudelft.ti2806.pl3.data.wrapper.Wrapper;
import tudelft.ti2806.pl3.data.wrapper.WrapperClone;
import tudelft.ti2806.pl3.data.wrapper.WrapperPlaceholder;
import tudelft.ti2806.pl3.data.wrapper.operation.WrapperOperation;

import java.util.List;

/**
 * Created by Boris Mattijssen on 20-05-15.
 */
public class NoMorePlaceholdersTest extends WrapperOperation {
	
	public NoMorePlaceholdersTest(List<WrapperClone> dataNodeWrappers) {
		for (WrapperClone d : dataNodeWrappers) {
			d.getOutgoing().forEach(n -> n.calculate(this, d));
			d.getIncoming().forEach(n -> n.calculate(this, d));
		}
	}
	
	@Override
	public void calculate(WrapperPlaceholder p, Wrapper container) {
		fail("Placeholder detected! Detected in via container " + container);
	}
	
}

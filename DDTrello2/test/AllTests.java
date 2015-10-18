import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.uece.eada.teste.ExecucaoTestAdder;
import br.uece.eada.teste.ExecucaoTestSub;


@RunWith(Suite.class)
@SuiteClasses({ExecucaoTestAdder.class, ExecucaoTestSub.class})
public class AllTests {

}

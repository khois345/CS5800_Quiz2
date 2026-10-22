import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({"calculator", "dateChecker"})
class CompleteUnitTest {
}

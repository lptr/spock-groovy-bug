import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class MyTest extends Specification {
    def "#a <=> #b: #result"() {
        expect:
        Math.signum(a <=> b) == result

        where:
        a            | b            | result
        "abcdef12"   | "abcdef12"   | 0
    }

    private double[] someOtherMethod() {
        double[] result = new double[0]
        return result
    }
}

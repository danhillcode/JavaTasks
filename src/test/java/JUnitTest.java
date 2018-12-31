import org.junit.jupiter.api.Test;

class JUnitTest {

    @Test
    void junitSetupTest() {
        System.out.println("This test method should be run");
    }

    @Test
    void NumeralInitialTest() {
        RomanNumerals rome = new RomanNumerals();
        System.out.println(rome.generate(1));
    }

    @Test
    void NumeralInitialTest2() {
        RomanNumerals rome = new RomanNumerals();
        System.out.println(rome.romanNumeralsCalc(3999));
    }




}
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.assertj.core.api.Assertions;

@RunWith(JUnitParamsRunner.class)
public class FooBarQixTest {
    @Test
    @Parameters({
            "1, 1",
            "2, 2",
            "4, 4",
            "8, 8"
    })
    public void should_return_the_same_number_when_the_number_isnt_a_multiple_or_doesnt_contain_3_5_7(int originalNumber, String expectedString) {
        String modifiedString = FooBarQix.compute(originalNumber);

        Assertions.assertThat(modifiedString).isEqualTo(expectedString);
    }

    @Test
    @Parameters({
            "3, FooFoo",
            "6, Foo",
            "9, Foo",
            "12, Foo",
            "33, FooFooFoo"
    })
    public void should_return_Foo_when_the_number_is_a_multiple_of_3(int originalNumber, String expectedString) {
        String modifiedString = FooBarQix.compute(originalNumber);

        Assertions.assertThat(modifiedString).isEqualTo(expectedString);
    }

    @Test
    @Parameters({
            "5, BarBar",
            "10, Bar*",
            "15, FooBarBar",
            "100, Bar**"
    })
    public void should_return_Foo_when_the_number_is_a_multiple_of_5(int originalNumber, String expectedString) {
        String modifiedString = FooBarQix.compute(originalNumber);

        Assertions.assertThat(modifiedString).isEqualTo(expectedString);
    }

    @Test
    @Parameters({
            "7, QixQix",
            "14, Qix",
            "21, FooQix",
            "49, Qix"
    })
    public void should_return_Foo_when_the_number_is_a_multiple_of_7(int originalNumber, String expectedString) {
        String modifiedString = FooBarQix.compute(originalNumber);

        Assertions.assertThat(modifiedString).isEqualTo(expectedString);
    }

    @Test
    @Parameters({
            "3, FooFoo",
            "13, Foo",
            "23, Foo",
            "33, FooFooFoo"
    })
    public void should_add_Foo_when_the_number_contains_a_3(int originalNumber, String expectedString) {
        String modifiedString = FooBarQix.compute(originalNumber);

        Assertions.assertThat(modifiedString).isEqualTo(expectedString);
    }

    @Test
    @Parameters({
            "5, BarBar",
            "15, FooBarBar",
            "25, BarBar",
            "35, BarQixFooBar"
    })
    public void should_add_Foo_when_the_number_contains_a_5(int originalNumber, String expectedString) {
        String modifiedString = FooBarQix.compute(originalNumber);

        Assertions.assertThat(modifiedString).isEqualTo(expectedString);
    }

    @Test
    @Parameters({
            "7, QixQix",
            "17, Qix",
            "27, FooQix",
            "37, FooQix"
    })
    public void should_add_Foo_when_the_number_contains_a_7(int originalNumber, String expectedString) {
        String modifiedString = FooBarQix.compute(originalNumber);

        Assertions.assertThat(modifiedString).isEqualTo(expectedString);
    }

    @Test
    @Parameters({
            "0, *",
            "10, Bar*",
            "90, FooBar*",
            "100, Bar**"
    })
    public void should_return_the_correct_string_replacing_zero_by_an_asterix(int originalNumber, String expectedString) {
        String modifiedString = FooBarQix.compute(originalNumber);

        Assertions.assertThat(modifiedString).isEqualTo(expectedString);
    }

    @Test
    public void should_return_the_correct_string_when_given_a_number() {
        int originalNumber = 350;
        String expectedString = "BarQixFooBar*";

        String modifiedString = FooBarQix.compute(originalNumber);

        Assertions.assertThat(modifiedString).isEqualTo(expectedString);
    }
}

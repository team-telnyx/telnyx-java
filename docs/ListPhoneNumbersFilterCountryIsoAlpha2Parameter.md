

# ListPhoneNumbersFilterCountryIsoAlpha2Parameter

## oneOf schemas
* [List<String>](List<String>.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.ListPhoneNumbersFilterCountryIsoAlpha2Parameter;
import com.telnyx.sdk.model.List<String>;
import com.telnyx.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        ListPhoneNumbersFilterCountryIsoAlpha2Parameter exampleListPhoneNumbersFilterCountryIsoAlpha2Parameter = new ListPhoneNumbersFilterCountryIsoAlpha2Parameter();

        // create a new List<String>
        List<String> exampleList<String> = new List<String>();
        // set ListPhoneNumbersFilterCountryIsoAlpha2Parameter to List<String>
        exampleListPhoneNumbersFilterCountryIsoAlpha2Parameter.setActualInstance(exampleList<String>);
        // to get back the List<String> set earlier
        List<String> testList<String> = (List<String>) exampleListPhoneNumbersFilterCountryIsoAlpha2Parameter.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set ListPhoneNumbersFilterCountryIsoAlpha2Parameter to String
        exampleListPhoneNumbersFilterCountryIsoAlpha2Parameter.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleListPhoneNumbersFilterCountryIsoAlpha2Parameter.getActualInstance();
    }
}
```



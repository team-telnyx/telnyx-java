

# Location1Inner

## anyOf schemas
* [Integer](Integer.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.Location1Inner;
import com.telnyx.sdk.model.Integer;
import com.telnyx.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        Location1Inner exampleLocation1Inner = new Location1Inner();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set Location1Inner to Integer
        exampleLocation1Inner.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleLocation1Inner.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set Location1Inner to String
        exampleLocation1Inner.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleLocation1Inner.getActualInstance();
    }
}
```



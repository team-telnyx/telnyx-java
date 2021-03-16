

# Loopcount

## oneOf schemas
* [Integer](Integer.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.Loopcount;
import com.telnyx.sdk.model.Integer;
import com.telnyx.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        Loopcount exampleLoopcount = new Loopcount();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set Loopcount to Integer
        exampleLoopcount.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleLoopcount.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set Loopcount to String
        exampleLoopcount.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleLoopcount.getActualInstance();
    }
}
```



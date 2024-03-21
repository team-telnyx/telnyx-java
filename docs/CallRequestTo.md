

# CallRequestTo

The DID or SIP URI to dial out to. Multiple DID or SIP URIs can be provided using an array of strings

## oneOf schemas
* [List<String>](List<String>.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.CallRequestTo;
import com.telnyx.sdk.model.List<String>;
import com.telnyx.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        CallRequestTo exampleCallRequestTo = new CallRequestTo();

        // create a new List<String>
        List<String> exampleList<String> = new List<String>();
        // set CallRequestTo to List<String>
        exampleCallRequestTo.setActualInstance(exampleList<String>);
        // to get back the List<String> set earlier
        List<String> testList<String> = (List<String>) exampleCallRequestTo.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set CallRequestTo to String
        exampleCallRequestTo.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleCallRequestTo.getActualInstance();
    }
}
```



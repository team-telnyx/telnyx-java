

# EnumListResponseInner

## anyOf schemas
* [Object](Object.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.EnumListResponseInner;
import com.telnyx.sdk.model.Object;
import com.telnyx.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        EnumListResponseInner exampleEnumListResponseInner = new EnumListResponseInner();

        // create a new Object
        Object exampleObject = new Object();
        // set EnumListResponseInner to Object
        exampleEnumListResponseInner.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleEnumListResponseInner.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set EnumListResponseInner to String
        exampleEnumListResponseInner.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleEnumListResponseInner.getActualInstance();
    }
}
```



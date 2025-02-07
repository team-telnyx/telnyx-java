

# AuditEventChangesInnerFrom

The previous value of the field. Can be any JSON type.

## anyOf schemas
* [BigDecimal](BigDecimal.md)
* [Boolean](Boolean.md)
* [List<String>](List<String>.md)
* [Object](Object.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.AuditEventChangesInnerFrom;
import com.telnyx.sdk.model.BigDecimal;
import com.telnyx.sdk.model.Boolean;
import com.telnyx.sdk.model.List<String>;
import com.telnyx.sdk.model.Object;
import com.telnyx.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        AuditEventChangesInnerFrom exampleAuditEventChangesInnerFrom = new AuditEventChangesInnerFrom();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set AuditEventChangesInnerFrom to BigDecimal
        exampleAuditEventChangesInnerFrom.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleAuditEventChangesInnerFrom.getActualInstance();

        // create a new Boolean
        Boolean exampleBoolean = new Boolean();
        // set AuditEventChangesInnerFrom to Boolean
        exampleAuditEventChangesInnerFrom.setActualInstance(exampleBoolean);
        // to get back the Boolean set earlier
        Boolean testBoolean = (Boolean) exampleAuditEventChangesInnerFrom.getActualInstance();

        // create a new List<String>
        List<String> exampleList<String> = new List<String>();
        // set AuditEventChangesInnerFrom to List<String>
        exampleAuditEventChangesInnerFrom.setActualInstance(exampleList<String>);
        // to get back the List<String> set earlier
        List<String> testList<String> = (List<String>) exampleAuditEventChangesInnerFrom.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set AuditEventChangesInnerFrom to Object
        exampleAuditEventChangesInnerFrom.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleAuditEventChangesInnerFrom.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set AuditEventChangesInnerFrom to String
        exampleAuditEventChangesInnerFrom.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleAuditEventChangesInnerFrom.getActualInstance();
    }
}
```



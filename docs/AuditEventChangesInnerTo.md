

# AuditEventChangesInnerTo

The new value of the field. Can be any JSON type.

## anyOf schemas
* [BigDecimal](BigDecimal.md)
* [Boolean](Boolean.md)
* [List<String>](List<String>.md)
* [Object](Object.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.AuditEventChangesInnerTo;
import com.telnyx.sdk.model.BigDecimal;
import com.telnyx.sdk.model.Boolean;
import com.telnyx.sdk.model.List<String>;
import com.telnyx.sdk.model.Object;
import com.telnyx.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        AuditEventChangesInnerTo exampleAuditEventChangesInnerTo = new AuditEventChangesInnerTo();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set AuditEventChangesInnerTo to BigDecimal
        exampleAuditEventChangesInnerTo.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleAuditEventChangesInnerTo.getActualInstance();

        // create a new Boolean
        Boolean exampleBoolean = new Boolean();
        // set AuditEventChangesInnerTo to Boolean
        exampleAuditEventChangesInnerTo.setActualInstance(exampleBoolean);
        // to get back the Boolean set earlier
        Boolean testBoolean = (Boolean) exampleAuditEventChangesInnerTo.getActualInstance();

        // create a new List<String>
        List<String> exampleList<String> = new List<String>();
        // set AuditEventChangesInnerTo to List<String>
        exampleAuditEventChangesInnerTo.setActualInstance(exampleList<String>);
        // to get back the List<String> set earlier
        List<String> testList<String> = (List<String>) exampleAuditEventChangesInnerTo.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set AuditEventChangesInnerTo to Object
        exampleAuditEventChangesInnerTo.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleAuditEventChangesInnerTo.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set AuditEventChangesInnerTo to String
        exampleAuditEventChangesInnerTo.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleAuditEventChangesInnerTo.getActualInstance();
    }
}
```





# CreateDocumentRequest

## oneOf schemas
* [CreateDocumentRequestOneOf](CreateDocumentRequestOneOf.md)
* [CreateDocumentRequestOneOf1](CreateDocumentRequestOneOf1.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.CreateDocumentRequest;
import com.telnyx.sdk.model.CreateDocumentRequestOneOf;
import com.telnyx.sdk.model.CreateDocumentRequestOneOf1;

public class Example {
    public static void main(String[] args) {
        CreateDocumentRequest exampleCreateDocumentRequest = new CreateDocumentRequest();

        // create a new CreateDocumentRequestOneOf
        CreateDocumentRequestOneOf exampleCreateDocumentRequestOneOf = new CreateDocumentRequestOneOf();
        // set CreateDocumentRequest to CreateDocumentRequestOneOf
        exampleCreateDocumentRequest.setActualInstance(exampleCreateDocumentRequestOneOf);
        // to get back the CreateDocumentRequestOneOf set earlier
        CreateDocumentRequestOneOf testCreateDocumentRequestOneOf = (CreateDocumentRequestOneOf) exampleCreateDocumentRequest.getActualInstance();

        // create a new CreateDocumentRequestOneOf1
        CreateDocumentRequestOneOf1 exampleCreateDocumentRequestOneOf1 = new CreateDocumentRequestOneOf1();
        // set CreateDocumentRequest to CreateDocumentRequestOneOf1
        exampleCreateDocumentRequest.setActualInstance(exampleCreateDocumentRequestOneOf1);
        // to get back the CreateDocumentRequestOneOf1 set earlier
        CreateDocumentRequestOneOf1 testCreateDocumentRequestOneOf1 = (CreateDocumentRequestOneOf1) exampleCreateDocumentRequest.getActualInstance();
    }
}
```



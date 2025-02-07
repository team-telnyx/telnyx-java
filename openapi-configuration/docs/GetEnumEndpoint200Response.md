

# GetEnumEndpoint200Response

## oneOf schemas
* [List<EnumListResponseInner>](List<EnumListResponseInner>.md)
* [Object](Object.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.GetEnumEndpoint200Response;
import com.telnyx.sdk.model.List<EnumListResponseInner>;
import com.telnyx.sdk.model.Object;

public class Example {
    public static void main(String[] args) {
        GetEnumEndpoint200Response exampleGetEnumEndpoint200Response = new GetEnumEndpoint200Response();

        // create a new List<EnumListResponseInner>
        List<EnumListResponseInner> exampleList<EnumListResponseInner> = new List<EnumListResponseInner>();
        // set GetEnumEndpoint200Response to List<EnumListResponseInner>
        exampleGetEnumEndpoint200Response.setActualInstance(exampleList<EnumListResponseInner>);
        // to get back the List<EnumListResponseInner> set earlier
        List<EnumListResponseInner> testList<EnumListResponseInner> = (List<EnumListResponseInner>) exampleGetEnumEndpoint200Response.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set GetEnumEndpoint200Response to Object
        exampleGetEnumEndpoint200Response.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleGetEnumEndpoint200Response.getActualInstance();
    }
}
```



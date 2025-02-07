

# ChatCompletionSystemMessageParamContent

## oneOf schemas
* [List<TextAndImageArrayInner>](List<TextAndImageArrayInner>.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.ChatCompletionSystemMessageParamContent;
import com.telnyx.sdk.model.List<TextAndImageArrayInner>;
import com.telnyx.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        ChatCompletionSystemMessageParamContent exampleChatCompletionSystemMessageParamContent = new ChatCompletionSystemMessageParamContent();

        // create a new List<TextAndImageArrayInner>
        List<TextAndImageArrayInner> exampleList<TextAndImageArrayInner> = new List<TextAndImageArrayInner>();
        // set ChatCompletionSystemMessageParamContent to List<TextAndImageArrayInner>
        exampleChatCompletionSystemMessageParamContent.setActualInstance(exampleList<TextAndImageArrayInner>);
        // to get back the List<TextAndImageArrayInner> set earlier
        List<TextAndImageArrayInner> testList<TextAndImageArrayInner> = (List<TextAndImageArrayInner>) exampleChatCompletionSystemMessageParamContent.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set ChatCompletionSystemMessageParamContent to String
        exampleChatCompletionSystemMessageParamContent.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleChatCompletionSystemMessageParamContent.getActualInstance();
    }
}
```



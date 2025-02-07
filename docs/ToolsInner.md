

# ToolsInner

## oneOf schemas
* [ChatCompletionToolParam](ChatCompletionToolParam.md)
* [Retrieval](Retrieval.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.ToolsInner;
import com.telnyx.sdk.model.ChatCompletionToolParam;
import com.telnyx.sdk.model.Retrieval;

public class Example {
    public static void main(String[] args) {
        ToolsInner exampleToolsInner = new ToolsInner();

        // create a new ChatCompletionToolParam
        ChatCompletionToolParam exampleChatCompletionToolParam = new ChatCompletionToolParam();
        // set ToolsInner to ChatCompletionToolParam
        exampleToolsInner.setActualInstance(exampleChatCompletionToolParam);
        // to get back the ChatCompletionToolParam set earlier
        ChatCompletionToolParam testChatCompletionToolParam = (ChatCompletionToolParam) exampleToolsInner.getActualInstance();

        // create a new Retrieval
        Retrieval exampleRetrieval = new Retrieval();
        // set ToolsInner to Retrieval
        exampleToolsInner.setActualInstance(exampleRetrieval);
        // to get back the Retrieval set earlier
        Retrieval testRetrieval = (Retrieval) exampleToolsInner.getActualInstance();
    }
}
```



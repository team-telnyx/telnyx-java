

# ChatCompletionRequestToolsInner

## anyOf schemas
* [ChatCompletionToolParam](ChatCompletionToolParam.md)
* [Retrieval](Retrieval.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.ChatCompletionRequestToolsInner;
import com.telnyx.sdk.model.ChatCompletionToolParam;
import com.telnyx.sdk.model.Retrieval;

public class Example {
    public static void main(String[] args) {
        ChatCompletionRequestToolsInner exampleChatCompletionRequestToolsInner = new ChatCompletionRequestToolsInner();

        // create a new ChatCompletionToolParam
        ChatCompletionToolParam exampleChatCompletionToolParam = new ChatCompletionToolParam();
        // set ChatCompletionRequestToolsInner to ChatCompletionToolParam
        exampleChatCompletionRequestToolsInner.setActualInstance(exampleChatCompletionToolParam);
        // to get back the ChatCompletionToolParam set earlier
        ChatCompletionToolParam testChatCompletionToolParam = (ChatCompletionToolParam) exampleChatCompletionRequestToolsInner.getActualInstance();

        // create a new Retrieval
        Retrieval exampleRetrieval = new Retrieval();
        // set ChatCompletionRequestToolsInner to Retrieval
        exampleChatCompletionRequestToolsInner.setActualInstance(exampleRetrieval);
        // to get back the Retrieval set earlier
        Retrieval testRetrieval = (Retrieval) exampleChatCompletionRequestToolsInner.getActualInstance();
    }
}
```



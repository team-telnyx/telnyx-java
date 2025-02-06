

# PortoutEventPayload

## oneOf schemas
* [WebhookPortoutFocDateChangedPayload](WebhookPortoutFocDateChangedPayload.md)
* [WebhookPortoutNewCommentPayload](WebhookPortoutNewCommentPayload.md)
* [WebhookPortoutStatusChangedPayload](WebhookPortoutStatusChangedPayload.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.PortoutEventPayload;
import com.telnyx.sdk.model.WebhookPortoutFocDateChangedPayload;
import com.telnyx.sdk.model.WebhookPortoutNewCommentPayload;
import com.telnyx.sdk.model.WebhookPortoutStatusChangedPayload;

public class Example {
    public static void main(String[] args) {
        PortoutEventPayload examplePortoutEventPayload = new PortoutEventPayload();

        // create a new WebhookPortoutFocDateChangedPayload
        WebhookPortoutFocDateChangedPayload exampleWebhookPortoutFocDateChangedPayload = new WebhookPortoutFocDateChangedPayload();
        // set PortoutEventPayload to WebhookPortoutFocDateChangedPayload
        examplePortoutEventPayload.setActualInstance(exampleWebhookPortoutFocDateChangedPayload);
        // to get back the WebhookPortoutFocDateChangedPayload set earlier
        WebhookPortoutFocDateChangedPayload testWebhookPortoutFocDateChangedPayload = (WebhookPortoutFocDateChangedPayload) examplePortoutEventPayload.getActualInstance();

        // create a new WebhookPortoutNewCommentPayload
        WebhookPortoutNewCommentPayload exampleWebhookPortoutNewCommentPayload = new WebhookPortoutNewCommentPayload();
        // set PortoutEventPayload to WebhookPortoutNewCommentPayload
        examplePortoutEventPayload.setActualInstance(exampleWebhookPortoutNewCommentPayload);
        // to get back the WebhookPortoutNewCommentPayload set earlier
        WebhookPortoutNewCommentPayload testWebhookPortoutNewCommentPayload = (WebhookPortoutNewCommentPayload) examplePortoutEventPayload.getActualInstance();

        // create a new WebhookPortoutStatusChangedPayload
        WebhookPortoutStatusChangedPayload exampleWebhookPortoutStatusChangedPayload = new WebhookPortoutStatusChangedPayload();
        // set PortoutEventPayload to WebhookPortoutStatusChangedPayload
        examplePortoutEventPayload.setActualInstance(exampleWebhookPortoutStatusChangedPayload);
        // to get back the WebhookPortoutStatusChangedPayload set earlier
        WebhookPortoutStatusChangedPayload testWebhookPortoutStatusChangedPayload = (WebhookPortoutStatusChangedPayload) examplePortoutEventPayload.getActualInstance();
    }
}
```



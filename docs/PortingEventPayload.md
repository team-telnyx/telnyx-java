

# PortingEventPayload

## oneOf schemas
* [WebhookPortingOrderDeletedPayload](WebhookPortingOrderDeletedPayload.md)
* [WebhookPortingOrderMessagingChangedPayload](WebhookPortingOrderMessagingChangedPayload.md)
* [WebhookPortingOrderNewCommentPayload](WebhookPortingOrderNewCommentPayload.md)
* [WebhookPortingOrderSplitPayload](WebhookPortingOrderSplitPayload.md)
* [WebhookPortingOrderStatusChangedPayload](WebhookPortingOrderStatusChangedPayload.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.PortingEventPayload;
import com.telnyx.sdk.model.WebhookPortingOrderDeletedPayload;
import com.telnyx.sdk.model.WebhookPortingOrderMessagingChangedPayload;
import com.telnyx.sdk.model.WebhookPortingOrderNewCommentPayload;
import com.telnyx.sdk.model.WebhookPortingOrderSplitPayload;
import com.telnyx.sdk.model.WebhookPortingOrderStatusChangedPayload;

public class Example {
    public static void main(String[] args) {
        PortingEventPayload examplePortingEventPayload = new PortingEventPayload();

        // create a new WebhookPortingOrderDeletedPayload
        WebhookPortingOrderDeletedPayload exampleWebhookPortingOrderDeletedPayload = new WebhookPortingOrderDeletedPayload();
        // set PortingEventPayload to WebhookPortingOrderDeletedPayload
        examplePortingEventPayload.setActualInstance(exampleWebhookPortingOrderDeletedPayload);
        // to get back the WebhookPortingOrderDeletedPayload set earlier
        WebhookPortingOrderDeletedPayload testWebhookPortingOrderDeletedPayload = (WebhookPortingOrderDeletedPayload) examplePortingEventPayload.getActualInstance();

        // create a new WebhookPortingOrderMessagingChangedPayload
        WebhookPortingOrderMessagingChangedPayload exampleWebhookPortingOrderMessagingChangedPayload = new WebhookPortingOrderMessagingChangedPayload();
        // set PortingEventPayload to WebhookPortingOrderMessagingChangedPayload
        examplePortingEventPayload.setActualInstance(exampleWebhookPortingOrderMessagingChangedPayload);
        // to get back the WebhookPortingOrderMessagingChangedPayload set earlier
        WebhookPortingOrderMessagingChangedPayload testWebhookPortingOrderMessagingChangedPayload = (WebhookPortingOrderMessagingChangedPayload) examplePortingEventPayload.getActualInstance();

        // create a new WebhookPortingOrderNewCommentPayload
        WebhookPortingOrderNewCommentPayload exampleWebhookPortingOrderNewCommentPayload = new WebhookPortingOrderNewCommentPayload();
        // set PortingEventPayload to WebhookPortingOrderNewCommentPayload
        examplePortingEventPayload.setActualInstance(exampleWebhookPortingOrderNewCommentPayload);
        // to get back the WebhookPortingOrderNewCommentPayload set earlier
        WebhookPortingOrderNewCommentPayload testWebhookPortingOrderNewCommentPayload = (WebhookPortingOrderNewCommentPayload) examplePortingEventPayload.getActualInstance();

        // create a new WebhookPortingOrderSplitPayload
        WebhookPortingOrderSplitPayload exampleWebhookPortingOrderSplitPayload = new WebhookPortingOrderSplitPayload();
        // set PortingEventPayload to WebhookPortingOrderSplitPayload
        examplePortingEventPayload.setActualInstance(exampleWebhookPortingOrderSplitPayload);
        // to get back the WebhookPortingOrderSplitPayload set earlier
        WebhookPortingOrderSplitPayload testWebhookPortingOrderSplitPayload = (WebhookPortingOrderSplitPayload) examplePortingEventPayload.getActualInstance();

        // create a new WebhookPortingOrderStatusChangedPayload
        WebhookPortingOrderStatusChangedPayload exampleWebhookPortingOrderStatusChangedPayload = new WebhookPortingOrderStatusChangedPayload();
        // set PortingEventPayload to WebhookPortingOrderStatusChangedPayload
        examplePortingEventPayload.setActualInstance(exampleWebhookPortingOrderStatusChangedPayload);
        // to get back the WebhookPortingOrderStatusChangedPayload set earlier
        WebhookPortingOrderStatusChangedPayload testWebhookPortingOrderStatusChangedPayload = (WebhookPortingOrderStatusChangedPayload) examplePortingEventPayload.getActualInstance();
    }
}
```



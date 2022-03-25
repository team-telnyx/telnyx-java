

# EnqueueRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**queueName** | **String** | The name of the queue the call should be put in. If a queue with a given name doesn&#39;t exist yet it will be created. |  [optional]
**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional]
**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional]
**maxWaitTimeSecs** | **Integer** | The number of seconds after which the call will be removed from the queue. |  [optional]
**maxSize** | **Integer** | The maximum number of calls allowed in the queue at a given time. Can&#39;t be modified for an existing queue. |  [optional]






# RCSAction

When tapped, initiates the corresponding native action on the device.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**text** | **String** | Text that is shown in the suggested action. Maximum 25 characters. |  [optional] |
|**postbackData** | **String** | Payload (base64 encoded) that will be sent to the agent in the user event that results when the user taps the suggested action. Maximum 2048 characters. |  [optional] |
|**fallbackUrl** | **String** | Fallback URL to use if a client doesn&#39;t support a suggested action. Fallback URLs open in new browser windows. Maximum 2048 characters. |  [optional] |
|**dialAction** | [**RCSDialAction**](RCSDialAction.md) |  |  [optional] |
|**viewLocationAction** | [**RCSViewLocationAction**](RCSViewLocationAction.md) |  |  [optional] |
|**createCalendarEventAction** | [**RCSCreateCalendarEventAction**](RCSCreateCalendarEventAction.md) |  |  [optional] |
|**openUrlAction** | [**RCSOpenUrlAction**](RCSOpenUrlAction.md) |  |  [optional] |
|**shareLocationAction** | **Object** | Opens the RCS app&#39;s location chooser so the user can pick a location to send back to the agent. |  [optional] |
|**composeAction** | [**RCSComposeAction**](RCSComposeAction.md) |  |  [optional] |




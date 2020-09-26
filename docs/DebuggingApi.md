# DebuggingApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCallEvents**](DebuggingApi.md#listCallEvents) | **GET** /call_events | List call events

<a name="listCallEvents"></a>
# **listCallEvents**
> ListCallEventsResponse listCallEvents(filterCallLegId, filterCallSessionId, filterStatus, filterType, filterEventTimestampGt, filterEventTimestampGte, filterEventTimestampLt, filterEventTimestampLte, filterEventTimestampEq)

List call events

Filters call events by given filter parameters. Events are ordered by &#x60;event_timestamp&#x60;. If filter for &#x60;call_leg_id&#x60; or &#x60;call_session_id&#x60; is not present, it only filters events from the last 24 hours.  **Note**: Only one &#x60;filter[event_timestamp]&#x60; can be passed. 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.DebuggingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DebuggingApi apiInstance = new DebuggingApi();
UUID filterCallLegId = new UUID(); // UUID | The unique identifier of an individual call leg.
UUID filterCallSessionId = new UUID(); // UUID | The unique identifier of the call control session. A session may include multiple call leg events.
String filterStatus = "filterStatus_example"; // String | Event status
String filterType = "filterType_example"; // String | Event type
String filterEventTimestampGt = "filterEventTimestampGt_example"; // String | Event timestamp: greater than
String filterEventTimestampGte = "filterEventTimestampGte_example"; // String | Event timestamp: greater than or equal
String filterEventTimestampLt = "filterEventTimestampLt_example"; // String | Event timestamp: lower than
String filterEventTimestampLte = "filterEventTimestampLte_example"; // String | Event timestamp: lower than or equal
String filterEventTimestampEq = "filterEventTimestampEq_example"; // String | Event timestamp: equal
try {
    ListCallEventsResponse result = apiInstance.listCallEvents(filterCallLegId, filterCallSessionId, filterStatus, filterType, filterEventTimestampGt, filterEventTimestampGte, filterEventTimestampLt, filterEventTimestampLte, filterEventTimestampEq);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DebuggingApi#listCallEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterCallLegId** | [**UUID**](.md)| The unique identifier of an individual call leg. | [optional]
 **filterCallSessionId** | [**UUID**](.md)| The unique identifier of the call control session. A session may include multiple call leg events. | [optional]
 **filterStatus** | **String**| Event status | [optional] [enum: delivered, failed]
 **filterType** | **String**| Event type | [optional] [enum: command, webhook]
 **filterEventTimestampGt** | **String**| Event timestamp: greater than | [optional]
 **filterEventTimestampGte** | **String**| Event timestamp: greater than or equal | [optional]
 **filterEventTimestampLt** | **String**| Event timestamp: lower than | [optional]
 **filterEventTimestampLte** | **String**| Event timestamp: lower than or equal | [optional]
 **filterEventTimestampEq** | **String**| Event timestamp: equal | [optional]

### Return type

[**ListCallEventsResponse**](ListCallEventsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


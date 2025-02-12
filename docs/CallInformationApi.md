# CallInformationApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listConnectionActiveCalls**](CallInformationApi.md#listConnectionActiveCalls) | **GET** /connections/{connection_id_wireless}/active_calls | List all active calls for given connection
[**retrieveCallStatus**](CallInformationApi.md#retrieveCallStatus) | **GET** /calls/{call_control_id} | Retrieve a call status



## listConnectionActiveCalls

> ActiveCallsResponse listConnectionActiveCalls(connectionIdWireless).pageLimit(pageLimit).pageAfter(pageAfter).pageBefore(pageBefore).execute();

List all active calls for given connection

Lists all active calls for given connection. Acceptable connections are either SIP connections with webhook_url or xml_request_url, call control or texml. Returned results are cursor paginated.


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallInformationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallInformationApi apiInstance = new CallInformationApi(defaultClient);
        String connectionIdWireless = "1293384261075731461"; // String | Telnyx connection id
        Integer pageLimit = 20; // Integer | Limit of records per single page
        String pageAfter = "null"; // String | Opaque identifier of next page
        String pageBefore = "null"; // String | Opaque identifier of previous page
        try {
            ActiveCallsResponse result = api.listConnectionActiveCalls(connectionIdWireless)
                .pageLimit(pageLimit)
                .pageAfter(pageAfter)
                .pageBefore(pageBefore)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallInformationApi#listConnectionActiveCalls");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionIdWireless** | **String**| Telnyx connection id |
 **pageLimit** | **Integer**| Limit of records per single page | [optional] [default to 20]
 **pageAfter** | **String**| Opaque identifier of next page | [optional] [default to null]
 **pageBefore** | **String**| Opaque identifier of previous page | [optional] [default to null]

### Return type

[**ActiveCallsResponse**](ActiveCallsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with list of details about active calls. |  -  |
| **0** | Unexpected error |  -  |


## retrieveCallStatus

> RetrieveCallStatusResponse retrieveCallStatus(callControlId)

Retrieve a call status

Returns the status of a call (data is available 10 minutes after call ended).

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallInformationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallInformationApi apiInstance = new CallInformationApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        try {
            RetrieveCallStatusResponse result = apiInstance.retrieveCallStatus(callControlId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallInformationApi#retrieveCallStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

[**RetrieveCallStatusResponse**](RetrieveCallStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a call status. |  -  |
| **0** | Unexpected error |  -  |


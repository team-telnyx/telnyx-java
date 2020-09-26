# CallInformationApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveCallStatus**](CallInformationApi.md#retrieveCallStatus) | **GET** /calls/{call_control_id} | Retrieve a call status

<a name="retrieveCallStatus"></a>
# **retrieveCallStatus**
> RetrieveCallStatusResponse retrieveCallStatus(callControlId)

Retrieve a call status

Returns the status of a call (data is available 10 minutes after call ended).

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallInformationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallInformationApi apiInstance = new CallInformationApi();
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    RetrieveCallStatusResponse result = apiInstance.retrieveCallStatus(callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallInformationApi#retrieveCallStatus");
    e.printStackTrace();
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


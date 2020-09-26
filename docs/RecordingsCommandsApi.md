# RecordingsCommandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listRecordings**](RecordingsCommandsApi.md#listRecordings) | **GET** /recordings | List recordings
[**retrieveRecording**](RecordingsCommandsApi.md#retrieveRecording) | **GET** /recordings/{id} | Retrieve a recording

<a name="listRecordings"></a>
# **listRecordings**
> ListRecordingsResponse listRecordings(filterConferenceId, filterCreatedAtGte, filterCreatedAtLte, pageNumber, pageSize)

List recordings

Lists recordings for the authenticated user

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.RecordingsCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RecordingsCommandsApi apiInstance = new RecordingsCommandsApi();
String filterConferenceId = "filterConferenceId_example"; // String | Return only recordings associated with a given conference
String filterCreatedAtGte = "filterCreatedAtGte_example"; // String | Return only recordings created later than or at given ISO 8601 datetime
String filterCreatedAtLte = "filterCreatedAtLte_example"; // String | Return only recordings created earlier than or at given ISO 8601 datetime
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
try {
    ListRecordingsResponse result = apiInstance.listRecordings(filterConferenceId, filterCreatedAtGte, filterCreatedAtLte, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingsCommandsApi#listRecordings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterConferenceId** | **String**| Return only recordings associated with a given conference | [optional]
 **filterCreatedAtGte** | **String**| Return only recordings created later than or at given ISO 8601 datetime | [optional]
 **filterCreatedAtLte** | **String**| Return only recordings created earlier than or at given ISO 8601 datetime | [optional]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]

### Return type

[**ListRecordingsResponse**](ListRecordingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveRecording"></a>
# **retrieveRecording**
> GetRecordingResponse retrieveRecording(id)

Retrieve a recording

Retrieve a recording from the authenticated user&#x27;s recordings

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.RecordingsCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RecordingsCommandsApi apiInstance = new RecordingsCommandsApi();
String id = "id_example"; // String | Uniquely identifies the recording
try {
    GetRecordingResponse result = apiInstance.retrieveRecording(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingsCommandsApi#retrieveRecording");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the recording |

### Return type

[**GetRecordingResponse**](GetRecordingResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


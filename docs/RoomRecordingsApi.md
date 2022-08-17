# RoomRecordingsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteRoomRecording**](RoomRecordingsApi.md#deleteRoomRecording) | **DELETE** /room_recordings/{room_recording_id} | Delete a room recording.
[**deleteRoomRecordings**](RoomRecordingsApi.md#deleteRoomRecordings) | **DELETE** /room_recordings | Delete several room recordings in a bulk.
[**listRoomRecordings**](RoomRecordingsApi.md#listRoomRecordings) | **GET** /room_recordings | View a list of room recordings.
[**viewRoomRecording**](RoomRecordingsApi.md#viewRoomRecording) | **GET** /room_recordings/{room_recording_id} | View a room recording.



## deleteRoomRecording

> deleteRoomRecording(roomRecordingId)

Delete a room recording.

Synchronously delete a Room Recording.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomRecordingsApi apiInstance = new RoomRecordingsApi(defaultClient);
        UUID roomRecordingId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a room recording.
        try {
            apiInstance.deleteRoomRecording(roomRecordingId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomRecordingsApi#deleteRoomRecording");
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
 **roomRecordingId** | **UUID**| The unique identifier of a room recording. |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The resource was deleted successfully. |  -  |
| **404** | Resource not found |  -  |


## deleteRoomRecordings

> BulkRoomRecordingsDeleteResponse deleteRoomRecordings(filterDateEndedAtEq, filterDateEndedAtGte, filterDateEndedAtLte, filterDateStartedAtEq, filterDateStartedAtGte, filterDateStartedAtLte, filterRoomId, filterParticipantId, filterSessionId, filterStatus, filterType, filterDurationSecsEq, filterDurationSecsLte, filterDurationSecsGte, pageSize, pageNumber)

Delete several room recordings in a bulk.



### Example

```java
import java.time.LocalDate;
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomRecordingsApi apiInstance = new RoomRecordingsApi(defaultClient);
        LocalDate filterDateEndedAtEq = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room recordings ended on that date.
        LocalDate filterDateEndedAtGte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room recordings ended after that date.
        LocalDate filterDateEndedAtLte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room recordings ended before that date.
        LocalDate filterDateStartedAtEq = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room recordings started on that date.
        LocalDate filterDateStartedAtGte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room recordings started after that date.
        LocalDate filterDateStartedAtLte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room recordings started before that date.
        UUID filterRoomId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | room_id for filtering room recordings.
        UUID filterParticipantId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | participant_id for filtering room recordings.
        UUID filterSessionId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | session_id for filtering room recordings.
        String filterStatus = "completed"; // String | status for filtering room recordings.
        String filterType = "audio"; // String | type for filtering room recordings.
        Integer filterDurationSecsEq = 20; // Integer | duration_secs equal for filtering room recordings.
        Integer filterDurationSecsLte = 20; // Integer | duration_secs less or equal for filtering room recordings.
        Integer filterDurationSecsGte = 20; // Integer | duration_secs greater or equal for filtering room recordings.
        Integer pageSize = 20; // Integer | The size of the page
        Integer pageNumber = 1; // Integer | The page number to load
        try {
            BulkRoomRecordingsDeleteResponse result = apiInstance.deleteRoomRecordings(filterDateEndedAtEq, filterDateEndedAtGte, filterDateEndedAtLte, filterDateStartedAtEq, filterDateStartedAtGte, filterDateStartedAtLte, filterRoomId, filterParticipantId, filterSessionId, filterStatus, filterType, filterDurationSecsEq, filterDurationSecsLte, filterDurationSecsGte, pageSize, pageNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomRecordingsApi#deleteRoomRecordings");
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
 **filterDateEndedAtEq** | **LocalDate**| ISO 8601 date for filtering room recordings ended on that date. | [optional]
 **filterDateEndedAtGte** | **LocalDate**| ISO 8601 date for filtering room recordings ended after that date. | [optional]
 **filterDateEndedAtLte** | **LocalDate**| ISO 8601 date for filtering room recordings ended before that date. | [optional]
 **filterDateStartedAtEq** | **LocalDate**| ISO 8601 date for filtering room recordings started on that date. | [optional]
 **filterDateStartedAtGte** | **LocalDate**| ISO 8601 date for filtering room recordings started after that date. | [optional]
 **filterDateStartedAtLte** | **LocalDate**| ISO 8601 date for filtering room recordings started before that date. | [optional]
 **filterRoomId** | **UUID**| room_id for filtering room recordings. | [optional]
 **filterParticipantId** | **UUID**| participant_id for filtering room recordings. | [optional]
 **filterSessionId** | **UUID**| session_id for filtering room recordings. | [optional]
 **filterStatus** | **String**| status for filtering room recordings. | [optional]
 **filterType** | **String**| type for filtering room recordings. | [optional]
 **filterDurationSecsEq** | **Integer**| duration_secs equal for filtering room recordings. | [optional]
 **filterDurationSecsLte** | **Integer**| duration_secs less or equal for filtering room recordings. | [optional]
 **filterDurationSecsGte** | **Integer**| duration_secs greater or equal for filtering room recordings. | [optional]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]

### Return type

[**BulkRoomRecordingsDeleteResponse**](BulkRoomRecordingsDeleteResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response for Bulk Delete Room recordings requests |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |


## listRoomRecordings

> ListRoomRecordings200Response listRoomRecordings(filterDateEndedAtEq, filterDateEndedAtGte, filterDateEndedAtLte, filterDateStartedAtEq, filterDateStartedAtGte, filterDateStartedAtLte, filterRoomId, filterParticipantId, filterSessionId, filterStatus, filterType, filterDurationSecsEq, filterDurationSecsLte, filterDurationSecsGte, pageSize, pageNumber)

View a list of room recordings.



### Example

```java
import java.time.LocalDate;
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomRecordingsApi apiInstance = new RoomRecordingsApi(defaultClient);
        LocalDate filterDateEndedAtEq = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room recordings ended on that date.
        LocalDate filterDateEndedAtGte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room recordings ended after that date.
        LocalDate filterDateEndedAtLte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room recordings ended before that date.
        LocalDate filterDateStartedAtEq = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room recordings started on that date.
        LocalDate filterDateStartedAtGte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room recordings started after that date.
        LocalDate filterDateStartedAtLte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering room recordings started before that date.
        UUID filterRoomId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | room_id for filtering room recordings.
        UUID filterParticipantId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | participant_id for filtering room recordings.
        UUID filterSessionId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | session_id for filtering room recordings.
        String filterStatus = "completed"; // String | status for filtering room recordings.
        String filterType = "audio"; // String | type for filtering room recordings.
        Integer filterDurationSecsEq = 20; // Integer | duration_secs equal for filtering room recordings.
        Integer filterDurationSecsLte = 20; // Integer | duration_secs less or equal for filtering room recordings.
        Integer filterDurationSecsGte = 20; // Integer | duration_secs greater or equal for filtering room recordings.
        Integer pageSize = 20; // Integer | The size of the page
        Integer pageNumber = 1; // Integer | The page number to load
        try {
            ListRoomRecordings200Response result = apiInstance.listRoomRecordings(filterDateEndedAtEq, filterDateEndedAtGte, filterDateEndedAtLte, filterDateStartedAtEq, filterDateStartedAtGte, filterDateStartedAtLte, filterRoomId, filterParticipantId, filterSessionId, filterStatus, filterType, filterDurationSecsEq, filterDurationSecsLte, filterDurationSecsGte, pageSize, pageNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomRecordingsApi#listRoomRecordings");
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
 **filterDateEndedAtEq** | **LocalDate**| ISO 8601 date for filtering room recordings ended on that date. | [optional]
 **filterDateEndedAtGte** | **LocalDate**| ISO 8601 date for filtering room recordings ended after that date. | [optional]
 **filterDateEndedAtLte** | **LocalDate**| ISO 8601 date for filtering room recordings ended before that date. | [optional]
 **filterDateStartedAtEq** | **LocalDate**| ISO 8601 date for filtering room recordings started on that date. | [optional]
 **filterDateStartedAtGte** | **LocalDate**| ISO 8601 date for filtering room recordings started after that date. | [optional]
 **filterDateStartedAtLte** | **LocalDate**| ISO 8601 date for filtering room recordings started before that date. | [optional]
 **filterRoomId** | **UUID**| room_id for filtering room recordings. | [optional]
 **filterParticipantId** | **UUID**| participant_id for filtering room recordings. | [optional]
 **filterSessionId** | **UUID**| session_id for filtering room recordings. | [optional]
 **filterStatus** | **String**| status for filtering room recordings. | [optional]
 **filterType** | **String**| type for filtering room recordings. | [optional]
 **filterDurationSecsEq** | **Integer**| duration_secs equal for filtering room recordings. | [optional]
 **filterDurationSecsLte** | **Integer**| duration_secs less or equal for filtering room recordings. | [optional]
 **filterDurationSecsGte** | **Integer**| duration_secs greater or equal for filtering room recordings. | [optional]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]

### Return type

[**ListRoomRecordings200Response**](ListRoomRecordings200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List room recordings response. |  -  |


## viewRoomRecording

> ViewRoomRecording200Response viewRoomRecording(roomRecordingId)

View a room recording.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RoomRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RoomRecordingsApi apiInstance = new RoomRecordingsApi(defaultClient);
        UUID roomRecordingId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a room recording.
        try {
            ViewRoomRecording200Response result = apiInstance.viewRoomRecording(roomRecordingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RoomRecordingsApi#viewRoomRecording");
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
 **roomRecordingId** | **UUID**| The unique identifier of a room recording. |

### Return type

[**ViewRoomRecording200Response**](ViewRoomRecording200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get room recording response. |  -  |
| **404** | Resource not found |  -  |


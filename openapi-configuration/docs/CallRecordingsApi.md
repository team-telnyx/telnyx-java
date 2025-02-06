# CallRecordingsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomStorageCredentials**](CallRecordingsApi.md#createCustomStorageCredentials) | **POST** /custom_storage_credentials/{connection_id} | Create a custom storage credential
[**deleteCustomStorageCredentials**](CallRecordingsApi.md#deleteCustomStorageCredentials) | **DELETE** /custom_storage_credentials/{connection_id} | Delete a stored credential
[**deleteRecording**](CallRecordingsApi.md#deleteRecording) | **DELETE** /recordings/{recording_id} | Delete a call recording
[**deleteRecordingTranscription**](CallRecordingsApi.md#deleteRecordingTranscription) | **DELETE** /recording_transcriptions/{recording_transcription_id} | Delete a recording transcription
[**deleteRecordings**](CallRecordingsApi.md#deleteRecordings) | **DELETE** /recordings/actions/delete | Delete a list of call recordings
[**getCustomStorageCredentials**](CallRecordingsApi.md#getCustomStorageCredentials) | **GET** /custom_storage_credentials/{connection_id} | Retrieve a stored credential
[**getRecording**](CallRecordingsApi.md#getRecording) | **GET** /recordings/{recording_id} | Retrieve a call recording
[**getRecordingTranscription**](CallRecordingsApi.md#getRecordingTranscription) | **GET** /recording_transcriptions/{recording_transcription_id} | Retrieve a recording transcription
[**getRecordingTranscriptions**](CallRecordingsApi.md#getRecordingTranscriptions) | **GET** /recording_transcriptions | List all recording transcriptions
[**getRecordings**](CallRecordingsApi.md#getRecordings) | **GET** /recordings | List all call recordings
[**updateCustomStorageCredentials**](CallRecordingsApi.md#updateCustomStorageCredentials) | **PUT** /custom_storage_credentials/{connection_id} | Update a stored credential



## createCustomStorageCredentials

> CredentialsResponse createCustomStorageCredentials(connectionIdWireless, customStorageConfiguration)

Create a custom storage credential

Creates a custom storage credentials configuration.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallRecordingsApi apiInstance = new CallRecordingsApi(defaultClient);
        String connectionIdWireless = "1293384261075731461"; // String | Telnyx connection id
        CustomStorageConfiguration customStorageConfiguration = new CustomStorageConfiguration(); // CustomStorageConfiguration | Creates new credentials resource for given connection_id.
        try {
            CredentialsResponse result = apiInstance.createCustomStorageCredentials(connectionIdWireless, customStorageConfiguration);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallRecordingsApi#createCustomStorageCredentials");
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
 **customStorageConfiguration** | [**CustomStorageConfiguration**](CustomStorageConfiguration.md)| Creates new credentials resource for given connection_id. |

### Return type

[**CredentialsResponse**](CredentialsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A response with credentials resource. |  -  |
| **0** | Unexpected error |  -  |


## deleteCustomStorageCredentials

> deleteCustomStorageCredentials(connectionIdWireless)

Delete a stored credential

Deletes a stored custom credentials configuration.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallRecordingsApi apiInstance = new CallRecordingsApi(defaultClient);
        String connectionIdWireless = "1293384261075731461"; // String | Telnyx connection id
        try {
            apiInstance.deleteCustomStorageCredentials(connectionIdWireless);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallRecordingsApi#deleteCustomStorageCredentials");
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
| **204** | The credentials configuration for connection_id was deleted successfully. |  -  |
| **0** | Unexpected error |  -  |


## deleteRecording

> RecordingResponse deleteRecording(recordingId)

Delete a call recording

Permanently deletes a call recording.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallRecordingsApi apiInstance = new CallRecordingsApi(defaultClient);
        String recordingId = "recordingId_example"; // String | Uniquely identifies the recording by id.
        try {
            RecordingResponse result = apiInstance.deleteRecording(recordingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallRecordingsApi#deleteRecording");
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
 **recordingId** | **String**| Uniquely identifies the recording by id. |

### Return type

[**RecordingResponse**](RecordingResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A response with recording resource. |  -  |
| **0** | Unexpected error |  -  |


## deleteRecordingTranscription

> GetRecordingTranscription200Response deleteRecordingTranscription(recordingTranscriptionId)

Delete a recording transcription

Permanently deletes a recording transcription.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallRecordingsApi apiInstance = new CallRecordingsApi(defaultClient);
        UUID recordingTranscriptionId = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | 
        try {
            GetRecordingTranscription200Response result = apiInstance.deleteRecordingTranscription(recordingTranscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallRecordingsApi#deleteRecordingTranscription");
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
 **recordingTranscriptionId** | **UUID**|  |

### Return type

[**GetRecordingTranscription200Response**](GetRecordingTranscription200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A response with a recording transcription resource. |  -  |
| **0** | Unexpected error |  -  |


## deleteRecordings

> deleteRecordings(requestBody)

Delete a list of call recordings

Permanently deletes a list of call recordings.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallRecordingsApi apiInstance = new CallRecordingsApi(defaultClient);
        List<String> requestBody = Arrays.asList(); // List<String> | Deletes recordings for given ids.
        try {
            apiInstance.deleteRecordings(requestBody);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallRecordingsApi#deleteRecordings");
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
 **requestBody** | **List&lt;String&gt;**| Deletes recordings for given ids. |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The recordings have been successfully deleted. |  -  |
| **0** | Unexpected error |  -  |


## getCustomStorageCredentials

> CredentialsResponse getCustomStorageCredentials(connectionIdWireless)

Retrieve a stored credential

Returns the information about custom storage credentials.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallRecordingsApi apiInstance = new CallRecordingsApi(defaultClient);
        String connectionIdWireless = "1293384261075731461"; // String | Telnyx connection id
        try {
            CredentialsResponse result = apiInstance.getCustomStorageCredentials(connectionIdWireless);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallRecordingsApi#getCustomStorageCredentials");
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

### Return type

[**CredentialsResponse**](CredentialsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A response with credentials resource. |  -  |
| **0** | Unexpected error |  -  |


## getRecording

> RecordingResponse getRecording(recordingId)

Retrieve a call recording

Retrieves the details of an existing call recording.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallRecordingsApi apiInstance = new CallRecordingsApi(defaultClient);
        String recordingId = "recordingId_example"; // String | Uniquely identifies the recording by id.
        try {
            RecordingResponse result = apiInstance.getRecording(recordingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallRecordingsApi#getRecording");
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
 **recordingId** | **String**| Uniquely identifies the recording by id. |

### Return type

[**RecordingResponse**](RecordingResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A response with recording resource. |  -  |
| **0** | Unexpected error |  -  |


## getRecordingTranscription

> GetRecordingTranscription200Response getRecordingTranscription(recordingTranscriptionId)

Retrieve a recording transcription

Retrieves the details of an existing recording transcription

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallRecordingsApi apiInstance = new CallRecordingsApi(defaultClient);
        UUID recordingTranscriptionId = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | 
        try {
            GetRecordingTranscription200Response result = apiInstance.getRecordingTranscription(recordingTranscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallRecordingsApi#getRecordingTranscription");
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
 **recordingTranscriptionId** | **UUID**|  |

### Return type

[**GetRecordingTranscription200Response**](GetRecordingTranscription200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A response with a recording transcription resource. |  -  |
| **0** | Unexpected error |  -  |


## getRecordingTranscriptions

> GetRecordingTranscriptions200Response getRecordingTranscriptions()

List all recording transcriptions

Returns a list of your recording transcriptions.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallRecordingsApi apiInstance = new CallRecordingsApi(defaultClient);
        try {
            GetRecordingTranscriptions200Response result = apiInstance.getRecordingTranscriptions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallRecordingsApi#getRecordingTranscriptions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetRecordingTranscriptions200Response**](GetRecordingTranscriptions200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A response listing recording transcriptions |  -  |
| **0** | Unexpected error |  -  |


## getRecordings

> GetRecordings200Response getRecordings(filterConferenceId, filterCreatedAtGte, filterCreatedAtLte, filterCallLegId, filterCallSessionId, filterFrom, filterTo, filterConnectionId, pageNumber, pageSize)

List all call recordings

Returns a list of your call recordings.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallRecordingsApi apiInstance = new CallRecordingsApi(defaultClient);
        String filterConferenceId = "428c31b6-7af4-4bcb-b7f5-5013ef9657c1"; // String | Returns only recordings associated with a given conference
        String filterCreatedAtGte = "2019-03-29T11:10:00Z"; // String | Returns only recordings created later than or at given ISO 8601 datetime
        String filterCreatedAtLte = "2019-03-29T11:10:00Z"; // String | Returns only recordings created earlier than or at given ISO 8601 datetime
        UUID filterCallLegId = UUID.fromString("428c31b6-7af4-4bcb-b7f5-5013ef9657c1"); // UUID | If present, recordings will be filtered to those with a matching call_leg_id.
        UUID filterCallSessionId = UUID.fromString("428c31b6-7af4-4bcb-b7f5-5013ef9657c1"); // UUID | If present, recordings will be filtered to those with a matching call_session_id.
        String filterFrom = "1234567890"; // String | If present, recordings will be filtered to those with a matching `from` attribute. Matching is case-sensitive
        String filterTo = "1234567890"; // String | If present, recordings will be filtered to those with a matching `to` attribute. Matching is case-sensitive
        String filterConnectionId = "175237942907135762"; // String | If present, recordings will be filtered to those with a matching `connection_id` attribute. Matching is case-sensitive
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            GetRecordings200Response result = apiInstance.getRecordings(filterConferenceId, filterCreatedAtGte, filterCreatedAtLte, filterCallLegId, filterCallSessionId, filterFrom, filterTo, filterConnectionId, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallRecordingsApi#getRecordings");
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
 **filterConferenceId** | **String**| Returns only recordings associated with a given conference | [optional]
 **filterCreatedAtGte** | **String**| Returns only recordings created later than or at given ISO 8601 datetime | [optional]
 **filterCreatedAtLte** | **String**| Returns only recordings created earlier than or at given ISO 8601 datetime | [optional]
 **filterCallLegId** | **UUID**| If present, recordings will be filtered to those with a matching call_leg_id. | [optional]
 **filterCallSessionId** | **UUID**| If present, recordings will be filtered to those with a matching call_session_id. | [optional]
 **filterFrom** | **String**| If present, recordings will be filtered to those with a matching &#x60;from&#x60; attribute. Matching is case-sensitive | [optional]
 **filterTo** | **String**| If present, recordings will be filtered to those with a matching &#x60;to&#x60; attribute. Matching is case-sensitive | [optional]
 **filterConnectionId** | **String**| If present, recordings will be filtered to those with a matching &#x60;connection_id&#x60; attribute. Matching is case-sensitive | [optional]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**GetRecordings200Response**](GetRecordings200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A response with recordings. |  -  |
| **0** | Unexpected error |  -  |


## updateCustomStorageCredentials

> CredentialsResponse updateCustomStorageCredentials(connectionIdWireless, customStorageConfiguration)

Update a stored credential

Updates a stored custom credentials configuration.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallRecordingsApi apiInstance = new CallRecordingsApi(defaultClient);
        String connectionIdWireless = "1293384261075731461"; // String | Telnyx connection id
        CustomStorageConfiguration customStorageConfiguration = new CustomStorageConfiguration(); // CustomStorageConfiguration | Creates new credentials resource for given connection_id.
        try {
            CredentialsResponse result = apiInstance.updateCustomStorageCredentials(connectionIdWireless, customStorageConfiguration);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallRecordingsApi#updateCustomStorageCredentials");
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
 **customStorageConfiguration** | [**CustomStorageConfiguration**](CustomStorageConfiguration.md)| Creates new credentials resource for given connection_id. |

### Return type

[**CredentialsResponse**](CredentialsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A response with credentials resource. |  -  |
| **0** | Unexpected error |  -  |


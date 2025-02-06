# TeXmlTwilioCompatibleRestCommandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTeXMLRecordingTranscription**](TeXmlTwilioCompatibleRestCommandsApi.md#deleteTeXMLRecordingTranscription) | **DELETE** /texml/Accounts/{account_sid}/Transcriptions/{recording_transcription_sid}.json | Delete a recording transcription
[**getTeXMLRecordingTranscription**](TeXmlTwilioCompatibleRestCommandsApi.md#getTeXMLRecordingTranscription) | **GET** /texml/Accounts/{account_sid}/Transcriptions/{recording_transcription_sid}.json | Fetch a recording transcription resource
[**getTeXMLRecordingTranscriptions**](TeXmlTwilioCompatibleRestCommandsApi.md#getTeXMLRecordingTranscriptions) | **GET** /texml/Accounts/{account_sid}/Transcriptions.json | List recording transcriptions



## deleteTeXMLRecordingTranscription

> deleteTeXMLRecordingTranscription(accountSid, recordingTranscriptionSid).execute();

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
import com.telnyx.sdk.api.TeXmlTwilioCompatibleRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlTwilioCompatibleRestCommandsApi apiInstance = new TeXmlTwilioCompatibleRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        UUID recordingTranscriptionSid = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Uniquely identifies the recording transcription by id.
        try {
            api.deleteTeXMLRecordingTranscription(accountSid, recordingTranscriptionSid)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlTwilioCompatibleRestCommandsApi#deleteTeXMLRecordingTranscription");
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
 **accountSid** | **String**| The id of the account the resource belongs to. |
 **recordingTranscriptionSid** | **UUID**| Uniquely identifies the recording transcription by id. |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The resource was deleted successfully. |  -  |
| **404** | Fax does not exist |  -  |


## getTeXMLRecordingTranscription

> TexmlRecordingTranscription getTeXMLRecordingTranscription(accountSid, recordingTranscriptionSid).execute();

Fetch a recording transcription resource

Returns the recording transcription resource identified by its ID.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlTwilioCompatibleRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlTwilioCompatibleRestCommandsApi apiInstance = new TeXmlTwilioCompatibleRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        UUID recordingTranscriptionSid = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Uniquely identifies the recording transcription by id.
        try {
            TexmlRecordingTranscription result = api.getTeXMLRecordingTranscription(accountSid, recordingTranscriptionSid)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlTwilioCompatibleRestCommandsApi#getTeXMLRecordingTranscription");
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
 **accountSid** | **String**| The id of the account the resource belongs to. |
 **recordingTranscriptionSid** | **UUID**| Uniquely identifies the recording transcription by id. |

### Return type

[**TexmlRecordingTranscription**](TexmlRecordingTranscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful get Recording Transcription Response |  -  |
| **404** | Fax does not exist |  -  |


## getTeXMLRecordingTranscriptions

> ListRecordingTranscriptionsResponse getTeXMLRecordingTranscriptions(accountSid).pageToken(pageToken).pageSize(pageSize).execute();

List recording transcriptions

Returns multiple recording transcription resources for an account.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlTwilioCompatibleRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlTwilioCompatibleRestCommandsApi apiInstance = new TeXmlTwilioCompatibleRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        String pageToken = "pageToken_example"; // String | Used to request the next page of results.
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListRecordingTranscriptionsResponse result = api.getTeXMLRecordingTranscriptions(accountSid)
                .pageToken(pageToken)
                .pageSize(pageSize)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlTwilioCompatibleRestCommandsApi#getTeXMLRecordingTranscriptions");
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
 **accountSid** | **String**| The id of the account the resource belongs to. |
 **pageToken** | **String**| Used to request the next page of results. | [optional]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListRecordingTranscriptionsResponse**](ListRecordingTranscriptionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful list Recording Transcriptions Response |  -  |
| **404** | Fax does not exist |  -  |


# ConferenceCommandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conferenceDialParticipantIn**](ConferenceCommandsApi.md#conferenceDialParticipantIn) | **POST** /conferences/{id}/actions/dial_participant | Dial a new participant into a conference
[**conferenceHoldParticipants**](ConferenceCommandsApi.md#conferenceHoldParticipants) | **POST** /conferences/{id}/actions/hold | Hold conference participants
[**conferenceJoin**](ConferenceCommandsApi.md#conferenceJoin) | **POST** /conferences/{id}/actions/join | Join a conference
[**conferenceMuteParticipants**](ConferenceCommandsApi.md#conferenceMuteParticipants) | **POST** /conferences/{id}/actions/mute | Mute conference participants
[**conferencePlayAudio**](ConferenceCommandsApi.md#conferencePlayAudio) | **POST** /conferences/{id}/actions/play | Play audio to conference participants
[**conferenceSpeakText**](ConferenceCommandsApi.md#conferenceSpeakText) | **POST** /conferences/{id}/actions/speak | Speak text to conference participants
[**conferenceStartRecording**](ConferenceCommandsApi.md#conferenceStartRecording) | **POST** /conferences/{id}/actions/record_start | Conference recording start
[**conferenceStopAudio**](ConferenceCommandsApi.md#conferenceStopAudio) | **POST** /conferences/{id}/actions/stop | Stop audio being played on the conference
[**conferenceStopRecording**](ConferenceCommandsApi.md#conferenceStopRecording) | **POST** /conferences/{id}/actions/record_stop | Conference recording stop
[**conferenceUnholdParticipants**](ConferenceCommandsApi.md#conferenceUnholdParticipants) | **POST** /conferences/{id}/actions/unhold | Unhold conference participants
[**conferenceUnmuteParticipants**](ConferenceCommandsApi.md#conferenceUnmuteParticipants) | **POST** /conferences/{id}/actions/unmute | Unmute conference participants
[**conferenceUpdate**](ConferenceCommandsApi.md#conferenceUpdate) | **POST** /conferences/{id}/actions/update | Update conference participant
[**createConference**](ConferenceCommandsApi.md#createConference) | **POST** /conferences | Create conference
[**listConferenceParticipants**](ConferenceCommandsApi.md#listConferenceParticipants) | **GET** /conferences/{conference_id}/participants | List conference participants
[**listConferences**](ConferenceCommandsApi.md#listConferences) | **GET** /conferences | List conferences
[**retrieveConference**](ConferenceCommandsApi.md#retrieveConference) | **GET** /conferences/{id} | Retrieve a conference



## conferenceDialParticipantIn

> ConferenceCommandResponse conferenceDialParticipantIn(id, conferenceCallRequest)

Dial a new participant into a conference

Dials a phone number and, when the call is answered, automatically joins them into the specified conference.

**Expected Webhooks:**

- `call.hangup`
- `call.answered`
- `conference.participant.joined`
- `conference.participant.left`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ConferenceCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferenceCallRequest conferenceCallRequest = new ConferenceCallRequest(); // ConferenceCallRequest | Dial Into Conference request object
        try {
            ConferenceCommandResponse result = apiInstance.conferenceDialParticipantIn(id, conferenceCallRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceDialParticipantIn");
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
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferenceCallRequest** | [**ConferenceCallRequest**](ConferenceCallRequest.md)| Dial Into Conference request object |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## conferenceHoldParticipants

> ConferenceCommandResponse conferenceHoldParticipants(id, conferenceHoldRequest)

Hold conference participants

Hold a list of participants in a conference call

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ConferenceCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferenceHoldRequest conferenceHoldRequest = new ConferenceHoldRequest(); // ConferenceHoldRequest | 
        try {
            ConferenceCommandResponse result = apiInstance.conferenceHoldParticipants(id, conferenceHoldRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceHoldParticipants");
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
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferenceHoldRequest** | [**ConferenceHoldRequest**](ConferenceHoldRequest.md)|  |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## conferenceJoin

> ConferenceCommandResponse conferenceJoin(id, joinConferenceRequest)

Join a conference

Join an existing call leg to a conference. Issue the Join Conference command with the conference ID in the path and the `call_control_id` of the leg you wish to join to the conference as an attribute.

**Expected Webhooks:**

- `conference.participant.joined`
- `conference.participant.left`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ConferenceCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        JoinConferenceRequest joinConferenceRequest = new JoinConferenceRequest(); // JoinConferenceRequest | Join Conference request object
        try {
            ConferenceCommandResponse result = apiInstance.conferenceJoin(id, joinConferenceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceJoin");
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
 **id** | **String**| Uniquely identifies the conference by id or name |
 **joinConferenceRequest** | [**JoinConferenceRequest**](JoinConferenceRequest.md)| Join Conference request object |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity |  -  |


## conferenceMuteParticipants

> ConferenceCommandResponse conferenceMuteParticipants(id, conferenceMuteRequest)

Mute conference participants

Mute a list of participants in a conference call

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ConferenceCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferenceMuteRequest conferenceMuteRequest = new ConferenceMuteRequest(); // ConferenceMuteRequest | 
        try {
            ConferenceCommandResponse result = apiInstance.conferenceMuteParticipants(id, conferenceMuteRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceMuteParticipants");
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
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferenceMuteRequest** | [**ConferenceMuteRequest**](ConferenceMuteRequest.md)|  |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## conferencePlayAudio

> ConferenceCommandResponse conferencePlayAudio(id, conferencePlayRequest)

Play audio to conference participants

Play audio to all or some participants on a conference call.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ConferenceCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferencePlayRequest conferencePlayRequest = new ConferencePlayRequest(); // ConferencePlayRequest | 
        try {
            ConferenceCommandResponse result = apiInstance.conferencePlayAudio(id, conferencePlayRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferencePlayAudio");
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
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferencePlayRequest** | [**ConferencePlayRequest**](ConferencePlayRequest.md)|  |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## conferenceSpeakText

> ConferenceCommandResponse conferenceSpeakText(id, conferenceSpeakRequest)

Speak text to conference participants

Convert text to speech and play it to all or some participants.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ConferenceCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Specifies the conference by id or name
        ConferenceSpeakRequest conferenceSpeakRequest = new ConferenceSpeakRequest(); // ConferenceSpeakRequest | 
        try {
            ConferenceCommandResponse result = apiInstance.conferenceSpeakText(id, conferenceSpeakRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceSpeakText");
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
 **id** | **String**| Specifies the conference by id or name |
 **conferenceSpeakRequest** | [**ConferenceSpeakRequest**](ConferenceSpeakRequest.md)|  |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## conferenceStartRecording

> ConferenceCommandResponse conferenceStartRecording(id, startRecordingRequest)

Conference recording start

Start recording the conference. Recording will stop on conference end, or via the Stop Recording command.

**Expected Webhooks:**

- `conference.recording.saved`

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ConferenceCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Specifies the conference to record by id or name
        StartRecordingRequest startRecordingRequest = new StartRecordingRequest(); // StartRecordingRequest | 
        try {
            ConferenceCommandResponse result = apiInstance.conferenceStartRecording(id, startRecordingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceStartRecording");
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
 **id** | **String**| Specifies the conference to record by id or name |
 **startRecordingRequest** | [**StartRecordingRequest**](StartRecordingRequest.md)|  |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## conferenceStopAudio

> ConferenceCommandResponse conferenceStopAudio(id, conferenceStopRequest)

Stop audio being played on the conference

Stop audio being played to all or some participants on a conference call.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ConferenceCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferenceStopRequest conferenceStopRequest = new ConferenceStopRequest(); // ConferenceStopRequest | 
        try {
            ConferenceCommandResponse result = apiInstance.conferenceStopAudio(id, conferenceStopRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceStopAudio");
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
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferenceStopRequest** | [**ConferenceStopRequest**](ConferenceStopRequest.md)|  |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## conferenceStopRecording

> ConferenceCommandResponse conferenceStopRecording(id, stopRecordingRequest)

Conference recording stop

Stop recording the conference.

**Expected Webhooks:**

- `conference.recording.saved`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ConferenceCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Specifies the conference to stop the recording for by id or name
        StopRecordingRequest stopRecordingRequest = new StopRecordingRequest(); // StopRecordingRequest | Stop recording conference request
        try {
            ConferenceCommandResponse result = apiInstance.conferenceStopRecording(id, stopRecordingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceStopRecording");
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
 **id** | **String**| Specifies the conference to stop the recording for by id or name |
 **stopRecordingRequest** | [**StopRecordingRequest**](StopRecordingRequest.md)| Stop recording conference request |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## conferenceUnholdParticipants

> ConferenceCommandResponse conferenceUnholdParticipants(id, conferenceUnholdRequest)

Unhold conference participants

Unhold a list of participants in a conference call

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ConferenceCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferenceUnholdRequest conferenceUnholdRequest = new ConferenceUnholdRequest(); // ConferenceUnholdRequest | 
        try {
            ConferenceCommandResponse result = apiInstance.conferenceUnholdParticipants(id, conferenceUnholdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceUnholdParticipants");
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
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferenceUnholdRequest** | [**ConferenceUnholdRequest**](ConferenceUnholdRequest.md)|  |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## conferenceUnmuteParticipants

> ConferenceCommandResponse conferenceUnmuteParticipants(id, conferenceUnmuteRequest)

Unmute conference participants

Unmute a list of participants in a conference call

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ConferenceCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        ConferenceUnmuteRequest conferenceUnmuteRequest = new ConferenceUnmuteRequest(); // ConferenceUnmuteRequest | 
        try {
            ConferenceCommandResponse result = apiInstance.conferenceUnmuteParticipants(id, conferenceUnmuteRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceUnmuteParticipants");
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
 **id** | **String**| Uniquely identifies the conference by id or name |
 **conferenceUnmuteRequest** | [**ConferenceUnmuteRequest**](ConferenceUnmuteRequest.md)|  |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## conferenceUpdate

> ConferenceCommandResponse conferenceUpdate(id, updateConferenceRequest)

Update conference participant

Update conference participant supervisor_role

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ConferenceCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id or name
        UpdateConferenceRequest updateConferenceRequest = new UpdateConferenceRequest(); // UpdateConferenceRequest | Update Conference request object
        try {
            ConferenceCommandResponse result = apiInstance.conferenceUpdate(id, updateConferenceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#conferenceUpdate");
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
 **id** | **String**| Uniquely identifies the conference by id or name |
 **updateConferenceRequest** | [**UpdateConferenceRequest**](UpdateConferenceRequest.md)| Update Conference request object |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a conference command. |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity |  -  |


## createConference

> ConferenceResponse createConference(createConferenceRequest)

Create conference

Create a conference from an existing call leg using a `call_control_id` and a conference name. Upon creating the conference, the call will be automatically bridged to the conference. Conferences will expire after all participants have left the conference or after 4 hours regardless of the number of active participants.

**Expected Webhooks:**

- `conference.created`
- `conference.participant.joined`
- `conference.participant.left`
- `conference.ended`
- `conference.recording.saved`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ConferenceCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        CreateConferenceRequest createConferenceRequest = new CreateConferenceRequest(); // CreateConferenceRequest | Create a conference
        try {
            ConferenceResponse result = apiInstance.createConference(createConferenceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#createConference");
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
 **createConferenceRequest** | [**CreateConferenceRequest**](CreateConferenceRequest.md)| Create a conference |

### Return type

[**ConferenceResponse**](ConferenceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a conference. |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity |  -  |


## listConferenceParticipants

> ListParticipantsResponse listConferenceParticipants(conferenceId).filterMuted(filterMuted).filterOnHold(filterOnHold).filterWhispering(filterWhispering).pageNumber(pageNumber).pageSize(pageSize).execute();

List conference participants

Lists conference participants

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ConferenceCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String conferenceId = "conferenceId_example"; // String | Uniquely identifies the conference by id
        Boolean filterMuted = true; // Boolean | If present, participants will be filtered to those who are/are not muted
        Boolean filterOnHold = true; // Boolean | If present, participants will be filtered to those who are/are not put on hold
        Boolean filterWhispering = true; // Boolean | If present, participants will be filtered to those who are whispering or are not
        Integer pageNumber = 1; // Integer | The page number to load.
        Integer pageSize = 20; // Integer | The size of the page.
        try {
            ListParticipantsResponse result = api.listConferenceParticipants(conferenceId)
                .filterMuted(filterMuted)
                .filterOnHold(filterOnHold)
                .filterWhispering(filterWhispering)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#listConferenceParticipants");
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
 **conferenceId** | **String**| Uniquely identifies the conference by id |
 **filterMuted** | **Boolean**| If present, participants will be filtered to those who are/are not muted | [optional]
 **filterOnHold** | **Boolean**| If present, participants will be filtered to those who are/are not put on hold | [optional]
 **filterWhispering** | **Boolean**| If present, participants will be filtered to those who are whispering or are not | [optional]
 **pageNumber** | **Integer**| The page number to load. | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page. | [optional] [default to 20]

### Return type

[**ListParticipantsResponse**](ListParticipantsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of conference participants. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Conference does not exist |  -  |
| **422** | Unprocessable entity |  -  |


## listConferences

> ListConferencesResponse listConferences().filterName(filterName).pageNumber(pageNumber).pageSize(pageSize).execute();

List conferences

Lists conferences. Conferences are created on demand, and will expire after all participants have left the conference or after 4 hours regardless of the number of active participants. Conferences are listed in descending order by `expires_at`.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ConferenceCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String filterName = "filterName_example"; // String | If present, conferences will be filtered to those with a matching `name` attribute. Matching is case-sensitive
        Integer pageNumber = 1; // Integer | The page number to load.
        Integer pageSize = 20; // Integer | The size of the page.
        try {
            ListConferencesResponse result = api.listConferences()
                .filterName(filterName)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#listConferences");
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
 **filterName** | **String**| If present, conferences will be filtered to those with a matching &#x60;name&#x60; attribute. Matching is case-sensitive | [optional]
 **pageNumber** | **Integer**| The page number to load. | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page. | [optional] [default to 20]

### Return type

[**ListConferencesResponse**](ListConferencesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of conferences. |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity |  -  |


## retrieveConference

> ConferenceResponse retrieveConference(id)

Retrieve a conference

Retrieve an existing conference

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ConferenceCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ConferenceCommandsApi apiInstance = new ConferenceCommandsApi(defaultClient);
        String id = "id_example"; // String | Uniquely identifies the conference by id
        try {
            ConferenceResponse result = apiInstance.retrieveConference(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#retrieveConference");
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
 **id** | **String**| Uniquely identifies the conference by id |

### Return type

[**ConferenceResponse**](ConferenceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a conference. |  -  |
| **404** | Conference does not exist |  -  |


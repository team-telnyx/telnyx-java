# ConferenceCommandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConference**](ConferenceCommandsApi.md#createConference) | **POST** /conferences | Create conference
[**holdConferenceParticipants**](ConferenceCommandsApi.md#holdConferenceParticipants) | **POST** /conferences/{id}/actions/hold | Hold conference participants
[**joinConference**](ConferenceCommandsApi.md#joinConference) | **POST** /conferences/{id}/actions/join | Join a conference
[**leaveConference**](ConferenceCommandsApi.md#leaveConference) | **POST** /conferences/{id}/actions/leave | Leave a conference
[**listConferenceParticipants**](ConferenceCommandsApi.md#listConferenceParticipants) | **GET** /conferences/{conference_id}/participants | List conference participants
[**listConferences**](ConferenceCommandsApi.md#listConferences) | **GET** /conferences | List conferences
[**muteConferenceParticipants**](ConferenceCommandsApi.md#muteConferenceParticipants) | **POST** /conferences/{id}/actions/mute | Mute conference participants
[**pauseConferenceRecording**](ConferenceCommandsApi.md#pauseConferenceRecording) | **POST** /conferences/{id}/actions/record_pause | Conference recording pause
[**playConferenceAudio**](ConferenceCommandsApi.md#playConferenceAudio) | **POST** /conferences/{id}/actions/play | Play audio to conference participants
[**resumeConferenceRecording**](ConferenceCommandsApi.md#resumeConferenceRecording) | **POST** /conferences/{id}/actions/record_resume | Conference recording resume
[**retrieveConference**](ConferenceCommandsApi.md#retrieveConference) | **GET** /conferences/{id} | Retrieve a conference
[**speakTextToConference**](ConferenceCommandsApi.md#speakTextToConference) | **POST** /conferences/{id}/actions/speak | Speak text to conference participants
[**startConferenceRecording**](ConferenceCommandsApi.md#startConferenceRecording) | **POST** /conferences/{id}/actions/record_start | Conference recording start
[**stopConferenceAudio**](ConferenceCommandsApi.md#stopConferenceAudio) | **POST** /conferences/{id}/actions/stop | Stop audio being played on the conference
[**stopConferenceRecording**](ConferenceCommandsApi.md#stopConferenceRecording) | **POST** /conferences/{id}/actions/record_stop | Conference recording stop
[**unholdConferenceParticipants**](ConferenceCommandsApi.md#unholdConferenceParticipants) | **POST** /conferences/{id}/actions/unhold | Unhold conference participants
[**unmuteConferenceParticipants**](ConferenceCommandsApi.md#unmuteConferenceParticipants) | **POST** /conferences/{id}/actions/unmute | Unmute conference participants
[**updateConference**](ConferenceCommandsApi.md#updateConference) | **POST** /conferences/{id}/actions/update | Update conference participant



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
- `conference.floor.changed`


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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **422** | Unprocessable entity |  -  |


## holdConferenceParticipants

> ConferenceCommandResponse holdConferenceParticipants(id, conferenceHoldRequest)

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
            ConferenceCommandResponse result = apiInstance.holdConferenceParticipants(id, conferenceHoldRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#holdConferenceParticipants");
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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity |  -  |


## joinConference

> ConferenceCommandResponse joinConference(id, joinConferenceRequest)

Join a conference

Join an existing call leg to a conference. Issue the Join Conference command with the conference ID in the path and the `call_control_id` of the leg you wish to join to the conference as an attribute. The conference can have up to a certain amount of active participants, as set by the `max_participants` parameter in conference creation request. 

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
            ConferenceCommandResponse result = apiInstance.joinConference(id, joinConferenceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#joinConference");
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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **422** | Unprocessable entity |  -  |


## leaveConference

> ConferenceCommandResponse leaveConference(id, leaveConferenceRequest)

Leave a conference

Removes a call leg from a conference and moves it back to parked state. **Expected Webhooks:**

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
        LeaveConferenceRequest leaveConferenceRequest = new LeaveConferenceRequest(); // LeaveConferenceRequest | Leave Conference request object
        try {
            ConferenceCommandResponse result = apiInstance.leaveConference(id, leaveConferenceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#leaveConference");
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
 **leaveConferenceRequest** | [**LeaveConferenceRequest**](LeaveConferenceRequest.md)| Leave Conference request object |

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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **422** | Unprocessable entity |  -  |


## listConferenceParticipants

> ListParticipantsResponse listConferenceParticipants(conferenceId, filterMuted, filterOnHold, filterWhispering, pageNumber, pageSize)

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
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListParticipantsResponse result = apiInstance.listConferenceParticipants(conferenceId, filterMuted, filterOnHold, filterWhispering, pageNumber, pageSize);
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity |  -  |


## listConferences

> ListConferencesResponse listConferences().filterName(filterName).filterStatus(filterStatus).pageNumber(pageNumber).pageSize(pageSize).execute();

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
        String filterStatus = "init"; // String | If present, conferences will be filtered by status.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListConferencesResponse result = api.listConferences()
                .filterName(filterName)
                .filterStatus(filterStatus)
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
 **filterStatus** | **String**| If present, conferences will be filtered by status. | [optional] [enum: init, in_progress, completed]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **422** | Unprocessable entity |  -  |


## muteConferenceParticipants

> ConferenceCommandResponse muteConferenceParticipants(id, conferenceMuteRequest)

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
            ConferenceCommandResponse result = apiInstance.muteConferenceParticipants(id, conferenceMuteRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#muteConferenceParticipants");
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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity |  -  |


## pauseConferenceRecording

> ConferenceCommandResponse pauseConferenceRecording(id, pauseConferenceRecordingRequest)

Conference recording pause

Pause conference recording.

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
        PauseConferenceRecordingRequest pauseConferenceRecordingRequest = new PauseConferenceRecordingRequest(); // PauseConferenceRecordingRequest | 
        try {
            ConferenceCommandResponse result = apiInstance.pauseConferenceRecording(id, pauseConferenceRecordingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#pauseConferenceRecording");
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
 **pauseConferenceRecordingRequest** | [**PauseConferenceRecordingRequest**](PauseConferenceRecordingRequest.md)|  |

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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity |  -  |


## playConferenceAudio

> ConferenceCommandResponse playConferenceAudio(id, conferencePlayRequest)

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
            ConferenceCommandResponse result = apiInstance.playConferenceAudio(id, conferencePlayRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#playConferenceAudio");
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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity |  -  |


## resumeConferenceRecording

> ConferenceCommandResponse resumeConferenceRecording(id, resumeConferenceRecordingRequest)

Conference recording resume

Resume conference recording.

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
        ResumeConferenceRecordingRequest resumeConferenceRecordingRequest = new ResumeConferenceRecordingRequest(); // ResumeConferenceRecordingRequest | 
        try {
            ConferenceCommandResponse result = apiInstance.resumeConferenceRecording(id, resumeConferenceRecordingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#resumeConferenceRecording");
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
 **resumeConferenceRecordingRequest** | [**ResumeConferenceRecordingRequest**](ResumeConferenceRecordingRequest.md)|  |

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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **404** | Resource not found |  -  |
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
| **404** | Resource not found |  -  |


## speakTextToConference

> ConferenceCommandResponse speakTextToConference(id, conferenceSpeakRequest)

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
            ConferenceCommandResponse result = apiInstance.speakTextToConference(id, conferenceSpeakRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#speakTextToConference");
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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity |  -  |


## startConferenceRecording

> ConferenceCommandResponse startConferenceRecording(id, startConferenceRecordingRequest)

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
        StartConferenceRecordingRequest startConferenceRecordingRequest = new StartConferenceRecordingRequest(); // StartConferenceRecordingRequest | 
        try {
            ConferenceCommandResponse result = apiInstance.startConferenceRecording(id, startConferenceRecordingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#startConferenceRecording");
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
 **startConferenceRecordingRequest** | [**StartConferenceRecordingRequest**](StartConferenceRecordingRequest.md)|  |

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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity |  -  |


## stopConferenceAudio

> ConferenceCommandResponse stopConferenceAudio(id, conferenceStopRequest)

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
            ConferenceCommandResponse result = apiInstance.stopConferenceAudio(id, conferenceStopRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#stopConferenceAudio");
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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity |  -  |


## stopConferenceRecording

> ConferenceCommandResponse stopConferenceRecording(id, stopRecordingRequest)

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
            ConferenceCommandResponse result = apiInstance.stopConferenceRecording(id, stopRecordingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#stopConferenceRecording");
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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity |  -  |


## unholdConferenceParticipants

> ConferenceCommandResponse unholdConferenceParticipants(id, conferenceUnholdRequest)

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
            ConferenceCommandResponse result = apiInstance.unholdConferenceParticipants(id, conferenceUnholdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#unholdConferenceParticipants");
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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity |  -  |


## unmuteConferenceParticipants

> ConferenceCommandResponse unmuteConferenceParticipants(id, conferenceUnmuteRequest)

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
            ConferenceCommandResponse result = apiInstance.unmuteConferenceParticipants(id, conferenceUnmuteRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#unmuteConferenceParticipants");
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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity |  -  |


## updateConference

> ConferenceCommandResponse updateConference(id, updateConferenceRequest)

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
            ConferenceCommandResponse result = apiInstance.updateConference(id, updateConferenceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConferenceCommandsApi#updateConference");
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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **422** | Unprocessable entity |  -  |


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
[**conferenceStartRecording**](ConferenceCommandsApi.md#conferenceStartRecording) | **POST** /conferences/{id}/actions/record_start | Start recording a conference
[**conferenceStopRecording**](ConferenceCommandsApi.md#conferenceStopRecording) | **POST** /conferences/{id}/actions/record_stop | Stop recording a conference
[**conferenceUnholdParticipants**](ConferenceCommandsApi.md#conferenceUnholdParticipants) | **POST** /conferences/{id}/actions/unhold | Unhold conference participants
[**conferenceUnmuteParticipants**](ConferenceCommandsApi.md#conferenceUnmuteParticipants) | **POST** /conferences/{id}/actions/unmute | Unmute conference participants
[**createConference**](ConferenceCommandsApi.md#createConference) | **POST** /conferences | Create a conference
[**listConferenceParticipants**](ConferenceCommandsApi.md#listConferenceParticipants) | **GET** /conferences/{conference_id}/participants | List conference participants
[**listConferences**](ConferenceCommandsApi.md#listConferences) | **GET** /conferences | List conferences
[**retrieveConference**](ConferenceCommandsApi.md#retrieveConference) | **GET** /conferences/{id} | Retrieve a conference

<a name="conferenceDialParticipantIn"></a>
# **conferenceDialParticipantIn**
> ConferenceCommandResponse conferenceDialParticipantIn(body, id)

Dial a new participant into a conference

Dials a phone number and, when the call is answered, automatically joins them into the specified conference.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; - &#x60;call.answered&#x60; - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
ConferenceCallRequest body = new ConferenceCallRequest(); // ConferenceCallRequest | Dial Into Conference request object
String id = "id_example"; // String | Uniquely identifies the conference by id or name
try {
    ConferenceCommandResponse result = apiInstance.conferenceDialParticipantIn(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#conferenceDialParticipantIn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConferenceCallRequest**](ConferenceCallRequest.md)| Dial Into Conference request object |
 **id** | **String**| Uniquely identifies the conference by id or name |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="conferenceHoldParticipants"></a>
# **conferenceHoldParticipants**
> ConferenceCommandResponse conferenceHoldParticipants(body, id)

Hold conference participants

Hold a list of participants in a conference call

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
ConferenceHoldRequest body = new ConferenceHoldRequest(); // ConferenceHoldRequest | 
String id = "id_example"; // String | Uniquely identifies the conference by id or name
try {
    ConferenceCommandResponse result = apiInstance.conferenceHoldParticipants(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#conferenceHoldParticipants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConferenceHoldRequest**](ConferenceHoldRequest.md)|  |
 **id** | **String**| Uniquely identifies the conference by id or name |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="conferenceJoin"></a>
# **conferenceJoin**
> ConferenceCommandResponse conferenceJoin(body, id)

Join a conference

Join an existing call leg to a conference. Issue the Join Conference command with the conference ID in the path and the &#x60;call_control_id&#x60; of the leg you wish to join to the conference as an attribute.  **Expected Webhooks:**  - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
JoinConferenceRequest body = new JoinConferenceRequest(); // JoinConferenceRequest | Join Conference request object
String id = "id_example"; // String | Uniquely identifies the conference by id or name
try {
    ConferenceCommandResponse result = apiInstance.conferenceJoin(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#conferenceJoin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JoinConferenceRequest**](JoinConferenceRequest.md)| Join Conference request object |
 **id** | **String**| Uniquely identifies the conference by id or name |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="conferenceMuteParticipants"></a>
# **conferenceMuteParticipants**
> ConferenceCommandResponse conferenceMuteParticipants(body, id)

Mute conference participants

Mute a list of participants in a conference call

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
ConferenceMuteRequest body = new ConferenceMuteRequest(); // ConferenceMuteRequest | 
String id = "id_example"; // String | Uniquely identifies the conference by id or name
try {
    ConferenceCommandResponse result = apiInstance.conferenceMuteParticipants(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#conferenceMuteParticipants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConferenceMuteRequest**](ConferenceMuteRequest.md)|  |
 **id** | **String**| Uniquely identifies the conference by id or name |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="conferencePlayAudio"></a>
# **conferencePlayAudio**
> ConferenceCommandResponse conferencePlayAudio(body, id)

Play audio to conference participants

Play audio to all or some participants on a conference call.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
ConferencePlayRequest body = new ConferencePlayRequest(); // ConferencePlayRequest | 
String id = "id_example"; // String | Uniquely identifies the conference by id or name
try {
    ConferenceCommandResponse result = apiInstance.conferencePlayAudio(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#conferencePlayAudio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConferencePlayRequest**](ConferencePlayRequest.md)|  |
 **id** | **String**| Uniquely identifies the conference by id or name |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="conferenceSpeakText"></a>
# **conferenceSpeakText**
> ConferenceCommandResponse conferenceSpeakText(body, id)

Speak text to conference participants

Convert text to speech and play it to all or some participants.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
ConferenceSpeakRequest body = new ConferenceSpeakRequest(); // ConferenceSpeakRequest | 
String id = "id_example"; // String | Specifies the conference by id or name
try {
    ConferenceCommandResponse result = apiInstance.conferenceSpeakText(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#conferenceSpeakText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConferenceSpeakRequest**](ConferenceSpeakRequest.md)|  |
 **id** | **String**| Specifies the conference by id or name |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="conferenceStartRecording"></a>
# **conferenceStartRecording**
> ConferenceCommandResponse conferenceStartRecording(body, id)

Start recording a conference

Start recording the conference. Recording will stop on conference end, or via the Stop Recording command.  **Expected Webhooks:**  - &#x60;conference.recording.saved&#x60;

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
StartRecordingRequest body = new StartRecordingRequest(); // StartRecordingRequest | 
String id = "id_example"; // String | Specifies the conference to record by id or name
try {
    ConferenceCommandResponse result = apiInstance.conferenceStartRecording(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#conferenceStartRecording");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StartRecordingRequest**](StartRecordingRequest.md)|  |
 **id** | **String**| Specifies the conference to record by id or name |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="conferenceStopRecording"></a>
# **conferenceStopRecording**
> ConferenceCommandResponse conferenceStopRecording(body, id)

Stop recording a conference

Stop recording the conference.  **Expected Webhooks:**  - &#x60;conference.recording.saved&#x60; 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
StopRecordingRequest body = new StopRecordingRequest(); // StopRecordingRequest | Stop recording conference request
String id = "id_example"; // String | Specifies the conference to stop the recording for by id or name
try {
    ConferenceCommandResponse result = apiInstance.conferenceStopRecording(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#conferenceStopRecording");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StopRecordingRequest**](StopRecordingRequest.md)| Stop recording conference request |
 **id** | **String**| Specifies the conference to stop the recording for by id or name |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="conferenceUnholdParticipants"></a>
# **conferenceUnholdParticipants**
> ConferenceCommandResponse conferenceUnholdParticipants(body, id)

Unhold conference participants

Unhold a list of participants in a conference call

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
ConferenceUnholdRequest body = new ConferenceUnholdRequest(); // ConferenceUnholdRequest | 
String id = "id_example"; // String | Uniquely identifies the conference by id or name
try {
    ConferenceCommandResponse result = apiInstance.conferenceUnholdParticipants(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#conferenceUnholdParticipants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConferenceUnholdRequest**](ConferenceUnholdRequest.md)|  |
 **id** | **String**| Uniquely identifies the conference by id or name |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="conferenceUnmuteParticipants"></a>
# **conferenceUnmuteParticipants**
> ConferenceCommandResponse conferenceUnmuteParticipants(body, id)

Unmute conference participants

Unmute a list of participants in a conference call

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
ConferenceUnmuteRequest body = new ConferenceUnmuteRequest(); // ConferenceUnmuteRequest | 
String id = "id_example"; // String | Uniquely identifies the conference by id or name
try {
    ConferenceCommandResponse result = apiInstance.conferenceUnmuteParticipants(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#conferenceUnmuteParticipants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConferenceUnmuteRequest**](ConferenceUnmuteRequest.md)|  |
 **id** | **String**| Uniquely identifies the conference by id or name |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createConference"></a>
# **createConference**
> ConferenceResponse createConference(body)

Create a conference

Create a conference from an existing call leg using a &#x60;call_control_id&#x60; and a conference name. Upon creating the conference, the call will be automatically bridged to the conference. Conferences will expire after all participants have left the conference or after 4 hours regardless of the number of active participants.  **Expected Webhooks:**  - &#x60;conference.created&#x60; - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; - &#x60;conference.ended&#x60; - &#x60;conference.recording.saved&#x60; 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
CreateConferenceRequest body = new CreateConferenceRequest(); // CreateConferenceRequest | Create a conference
try {
    ConferenceResponse result = apiInstance.createConference(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#createConference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateConferenceRequest**](CreateConferenceRequest.md)| Create a conference |

### Return type

[**ConferenceResponse**](ConferenceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listConferenceParticipants"></a>
# **listConferenceParticipants**
> ListParticipantsResponse listConferenceParticipants(conferenceId, filterMuted, filterOnHold, filterWhispering, pageNumber, pageSize)

List conference participants

Lists conference participants

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
String conferenceId = "conferenceId_example"; // String | Uniquely identifies the conference by id or name
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
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceId** | **String**| Uniquely identifies the conference by id or name |
 **filterMuted** | **Boolean**| If present, participants will be filtered to those who are/are not muted | [optional]
 **filterOnHold** | **Boolean**| If present, participants will be filtered to those who are/are not put on hold | [optional]
 **filterWhispering** | **Boolean**| If present, participants will be filtered to those who are whispering or are not | [optional]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]

### Return type

[**ListParticipantsResponse**](ListParticipantsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listConferences"></a>
# **listConferences**
> ListConferencesResponse listConferences(filterName, pageNumber, pageSize)

List conferences

Lists conferences. Conferences are created on demand, and will expire after all participants have left the conference or after 4 hours regardless of the number of active participants. Conferences are listed in descending order by &#x60;expires_at&#x60;.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
String filterName = "filterName_example"; // String | If present, conferences will be filtered to those with a matching `name` attribute. Matching is case-sensitive
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
try {
    ListConferencesResponse result = apiInstance.listConferences(filterName, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#listConferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterName** | **String**| If present, conferences will be filtered to those with a matching &#x60;name&#x60; attribute. Matching is case-sensitive | [optional]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]

### Return type

[**ListConferencesResponse**](ListConferencesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveConference"></a>
# **retrieveConference**
> ConferenceResponse retrieveConference(id)

Retrieve a conference

Retrieve an existing conference

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
String id = "id_example"; // String | Uniquely identifies the conference by id or name
try {
    ConferenceResponse result = apiInstance.retrieveConference(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#retrieveConference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference by id or name |

### Return type

[**ConferenceResponse**](ConferenceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


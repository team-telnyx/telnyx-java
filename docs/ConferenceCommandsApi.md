# ConferenceCommandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callControlRecordConferenceStart**](ConferenceCommandsApi.md#callControlRecordConferenceStart) | **POST** /conferences/{id}/actions/record_start | Conference recording start
[**callControlRecordConferenceStop**](ConferenceCommandsApi.md#callControlRecordConferenceStop) | **POST** /conferences/{id}/actions/record_stop | Conference recording stop
[**createConference**](ConferenceCommandsApi.md#createConference) | **POST** /conferences | Create conference
[**getConference**](ConferenceCommandsApi.md#getConference) | **GET** /conferences/{id} | Retrieve a conference
[**getConferenceParticipants**](ConferenceCommandsApi.md#getConferenceParticipants) | **GET** /conferences/{id}/participants | List conference participants
[**getConferences**](ConferenceCommandsApi.md#getConferences) | **GET** /conferences | List conferences
[**holdConference**](ConferenceCommandsApi.md#holdConference) | **POST** /conferences/{id}/actions/hold | Hold conference participants
[**joinConference**](ConferenceCommandsApi.md#joinConference) | **POST** /conferences/{id}/actions/join | Join a conference
[**muteConference**](ConferenceCommandsApi.md#muteConference) | **POST** /conferences/{id}/actions/mute | Mute conference participants
[**unholdConference**](ConferenceCommandsApi.md#unholdConference) | **POST** /conferences/{id}/actions/unhold | Unhold conference participants
[**unmuteConference**](ConferenceCommandsApi.md#unmuteConference) | **POST** /conferences/{id}/actions/unmute | Unmute conference participants

<a name="callControlRecordConferenceStart"></a>
# **callControlRecordConferenceStart**
> ConferenceCommandResponse callControlRecordConferenceStart(body, id)

Conference recording start

Start recording the conference. Recording will stop on conference end, or via the Stop Recording command.  **Expected Webhooks:**  - &#x60;conference.recording.saved&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
StartRecordingRequest body = new StartRecordingRequest(); // StartRecordingRequest | 
String id = "id_example"; // String | Specifies the conference to record
try {
    ConferenceCommandResponse result = apiInstance.callControlRecordConferenceStart(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#callControlRecordConferenceStart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StartRecordingRequest**](StartRecordingRequest.md)|  |
 **id** | **String**| Specifies the conference to record |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callControlRecordConferenceStop"></a>
# **callControlRecordConferenceStop**
> ConferenceCommandResponse callControlRecordConferenceStop(body, id)

Conference recording stop

Stop recording the conference.  **Expected Webhooks:**  - &#x60;conference.recording.saved&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
StopRecordingRequest body = new StopRecordingRequest(); // StopRecordingRequest | Stop recording conference request
String id = "id_example"; // String | Specifies the conference to stop the recording for
try {
    ConferenceCommandResponse result = apiInstance.callControlRecordConferenceStop(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#callControlRecordConferenceStop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StopRecordingRequest**](StopRecordingRequest.md)| Stop recording conference request |
 **id** | **String**| Specifies the conference to stop the recording for |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createConference"></a>
# **createConference**
> CreateConferenceResponse createConference(body)

Create conference

Create a conference from an existing call leg using a &#x60;call_control_id&#x60; and a conference name. Upon creating the conference, the call will be automatically bridged to the conference. Conferences will expire after all participants have left the conference or after 4 hours regardless of the number of active participants.  **Expected Webhooks:**  - &#x60;conference.created&#x60; - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; - &#x60;conference.ended&#x60; - &#x60;conference.recording.saved&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
CreateConferenceRequest body = new CreateConferenceRequest(); // CreateConferenceRequest | Create a conference
try {
    CreateConferenceResponse result = apiInstance.createConference(body);
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

[**CreateConferenceResponse**](CreateConferenceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConference"></a>
# **getConference**
> GetConferenceResponse getConference(id)

Retrieve a conference

Retrieve an existing conference

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
String id = "id_example"; // String | Uniquely identifies the conference
try {
    GetConferenceResponse result = apiInstance.getConference(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#getConference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference |

### Return type

[**GetConferenceResponse**](GetConferenceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConferenceParticipants"></a>
# **getConferenceParticipants**
> ListParticipantsResponse getConferenceParticipants(id, filterMuted, filterOnHold, filterWhispering, pageNumber, pageSize)

List conference participants

Lists conference participants

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
String id = "id_example"; // String | Uniquely identifies the conference
Boolean filterMuted = true; // Boolean | If present, participants will be filtered to those who are/are not muted
Boolean filterOnHold = true; // Boolean | If present, participants will be filtered to those who are/are not put on hold
Boolean filterWhispering = true; // Boolean | If present, participants will be filtered to those who are whispering or are not
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
try {
    ListParticipantsResponse result = apiInstance.getConferenceParticipants(id, filterMuted, filterOnHold, filterWhispering, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#getConferenceParticipants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Uniquely identifies the conference |
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

<a name="getConferences"></a>
# **getConferences**
> ListConferenceResponse getConferences(filterName, pageNumber, pageSize)

List conferences

Lists conferences. Conferences are created on demand, and will expire after all participants have left the conference or after 4 hours regardless of the number of active participants. Conferences are listed in descending order by &#x60;expires_at&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
String filterName = "filterName_example"; // String | If present, conferences will be filtered to those with a matching `name` attribute. Matching is case-sensitive
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
try {
    ListConferenceResponse result = apiInstance.getConferences(filterName, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#getConferences");
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

[**ListConferenceResponse**](ListConferenceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="holdConference"></a>
# **holdConference**
> ConferenceCommandResponse holdConference(body, id)

Hold conference participants

Hold a list of participants in a conference call

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
ConferenceHoldRequest body = new ConferenceHoldRequest(); // ConferenceHoldRequest | 
String id = "id_example"; // String | Uniquely identifies the conference
try {
    ConferenceCommandResponse result = apiInstance.holdConference(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#holdConference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConferenceHoldRequest**](ConferenceHoldRequest.md)|  |
 **id** | **String**| Uniquely identifies the conference |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="joinConference"></a>
# **joinConference**
> ConferenceCommandResponse joinConference(body, id)

Join a conference

Join an existing call leg to a conference. Issue the Join Conference command with the conference ID in the path and the &#x60;call_control_id&#x60; of the leg you wish to join to the conference as an attribute.  **Expected Webhooks:**  - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
JoinConferenceRequest body = new JoinConferenceRequest(); // JoinConferenceRequest | New Messaging Profile object
String id = "id_example"; // String | Uniquely identifies the conference
try {
    ConferenceCommandResponse result = apiInstance.joinConference(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#joinConference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JoinConferenceRequest**](JoinConferenceRequest.md)| New Messaging Profile object |
 **id** | **String**| Uniquely identifies the conference |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="muteConference"></a>
# **muteConference**
> ConferenceCommandResponse muteConference(body, id)

Mute conference participants

Mute a list of participants in a conference call

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
ConferenceMuteRequest body = new ConferenceMuteRequest(); // ConferenceMuteRequest | 
String id = "id_example"; // String | Uniquely identifies the conference
try {
    ConferenceCommandResponse result = apiInstance.muteConference(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#muteConference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConferenceMuteRequest**](ConferenceMuteRequest.md)|  |
 **id** | **String**| Uniquely identifies the conference |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unholdConference"></a>
# **unholdConference**
> ConferenceCommandResponse unholdConference(body, id)

Unhold conference participants

Unhold a list of participants in a conference call

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
ConferenceUnholdRequest body = new ConferenceUnholdRequest(); // ConferenceUnholdRequest | 
String id = "id_example"; // String | Uniquely identifies the conference
try {
    ConferenceCommandResponse result = apiInstance.unholdConference(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#unholdConference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConferenceUnholdRequest**](ConferenceUnholdRequest.md)|  |
 **id** | **String**| Uniquely identifies the conference |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unmuteConference"></a>
# **unmuteConference**
> ConferenceCommandResponse unmuteConference(body, id)

Unmute conference participants

Unmute a list of participants in a conference call

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConferenceCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConferenceCommandsApi apiInstance = new ConferenceCommandsApi();
ConferenceUnmuteRequest body = new ConferenceUnmuteRequest(); // ConferenceUnmuteRequest | 
String id = "id_example"; // String | Uniquely identifies the conference
try {
    ConferenceCommandResponse result = apiInstance.unmuteConference(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConferenceCommandsApi#unmuteConference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConferenceUnmuteRequest**](ConferenceUnmuteRequest.md)|  |
 **id** | **String**| Uniquely identifies the conference |

### Return type

[**ConferenceCommandResponse**](ConferenceCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


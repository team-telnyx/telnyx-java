# TeXmlRestCommandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTexmlSecret**](TeXmlRestCommandsApi.md#createTexmlSecret) | **POST** /texml/secrets | Create a TeXML secret
[**deleteTeXMLCallRecording**](TeXmlRestCommandsApi.md#deleteTeXMLCallRecording) | **DELETE** /texml/Accounts/{account_sid}/Recordings/{recording_sid}.json | Delete recording resource
[**deleteTexmlConferenceParticipant**](TeXmlRestCommandsApi.md#deleteTexmlConferenceParticipant) | **DELETE** /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants/{call_sid} | Delete a conference participant
[**dialTexmlConferenceParticipant**](TeXmlRestCommandsApi.md#dialTexmlConferenceParticipant) | **POST** /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants | Dial a new conference participant
[**fetchTeXMLCallRecordings**](TeXmlRestCommandsApi.md#fetchTeXMLCallRecordings) | **GET** /texml/Accounts/{account_sid}/Calls/{call_sid}/Recordings.json | Fetch recordings for a call
[**fetchTeXMLConferenceRecordings**](TeXmlRestCommandsApi.md#fetchTeXMLConferenceRecordings) | **GET** /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Recordings.json | Fetch recordings for a conference
[**getTeXMLCallRecording**](TeXmlRestCommandsApi.md#getTeXMLCallRecording) | **GET** /texml/Accounts/{account_sid}/Recordings/{recording_sid}.json | Fetch recording resource
[**getTeXMLCallRecordings**](TeXmlRestCommandsApi.md#getTeXMLCallRecordings) | **GET** /texml/Accounts/{account_sid}/Recordings.json | Fetch multiple recording resources
[**getTexmlCall**](TeXmlRestCommandsApi.md#getTexmlCall) | **GET** /texml/Accounts/{account_sid}/Calls/{call_sid} | Fetch a call
[**getTexmlCalls**](TeXmlRestCommandsApi.md#getTexmlCalls) | **GET** /texml/Accounts/{account_sid}/Calls | Fetch multiple call resources
[**getTexmlConference**](TeXmlRestCommandsApi.md#getTexmlConference) | **GET** /texml/Accounts/{account_sid}/Conferences/{conference_sid} | Fetch a conference resource
[**getTexmlConferenceParticipant**](TeXmlRestCommandsApi.md#getTexmlConferenceParticipant) | **GET** /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants/{call_sid} | Get conference participant resource
[**getTexmlConferenceParticipants**](TeXmlRestCommandsApi.md#getTexmlConferenceParticipants) | **GET** /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants | List conference participants
[**getTexmlConferenceRecordings**](TeXmlRestCommandsApi.md#getTexmlConferenceRecordings) | **GET** /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Recordings | List conference recordings
[**getTexmlConferences**](TeXmlRestCommandsApi.md#getTexmlConferences) | **GET** /texml/Accounts/{account_sid}/Conferences | List conference resources
[**initiateTexmlCall**](TeXmlRestCommandsApi.md#initiateTexmlCall) | **POST** /texml/Accounts/{account_sid}/Calls | Initiate an outbound call
[**initiateTexmlCall_0**](TeXmlRestCommandsApi.md#initiateTexmlCall_0) | **POST** /texml/calls/{application_id} | Initiate an outbound call
[**startTeXMLCallRecording**](TeXmlRestCommandsApi.md#startTeXMLCallRecording) | **POST** /texml/Accounts/{account_sid}/Calls/{call_sid}/Recordings.json | Request recording for a call
[**updateTeXMLCallRecording**](TeXmlRestCommandsApi.md#updateTeXMLCallRecording) | **POST** /texml/Accounts/{account_sid}/Calls/{call_sid}/Recordings/{recording_sid}.json | Update recording on a call
[**updateTexmlCall**](TeXmlRestCommandsApi.md#updateTexmlCall) | **POST** /texml/Accounts/{account_sid}/Calls/{call_sid} | Update call
[**updateTexmlCall_0**](TeXmlRestCommandsApi.md#updateTexmlCall_0) | **POST** /texml/calls/{call_sid}/update | Update call
[**updateTexmlConference**](TeXmlRestCommandsApi.md#updateTexmlConference) | **POST** /texml/Accounts/{account_sid}/Conferences/{conference_sid} | Update a conference resource
[**updateTexmlConferenceParticipant**](TeXmlRestCommandsApi.md#updateTexmlConferenceParticipant) | **POST** /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants/{call_sid} | Update a conference participant



## createTexmlSecret

> CreateTeXMLSecretRequest createTexmlSecret(createTeXMLSecretRequest)

Create a TeXML secret

Create a TeXML secret which can be later used as a Dynamic Parameter for TeXML when using Mustache Templates in your TeXML. In your TeXML you will be able to use your secret name, and this name will be replaced by the actual secret value when processing the TeXML on Telnyx side.  The secrets are not visible in any logs.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        CreateTeXMLSecretRequest createTeXMLSecretRequest = new CreateTeXMLSecretRequest(); // CreateTeXMLSecretRequest | Create TeXML secret request object
        try {
            CreateTeXMLSecretRequest result = apiInstance.createTexmlSecret(createTeXMLSecretRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#createTexmlSecret");
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
 **createTeXMLSecretRequest** | [**CreateTeXMLSecretRequest**](CreateTeXMLSecretRequest.md)| Create TeXML secret request object |

### Return type

[**CreateTeXMLSecretRequest**](CreateTeXMLSecretRequest.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response upon creating a TeXML secret. |  -  |
| **422** | Unprocessable entity |  -  |


## deleteTeXMLCallRecording

> deleteTeXMLCallRecording(accountSid, recordingSid).execute();

Delete recording resource

Deletes recording resource identified by recording id.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        UUID recordingSid = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Uniquely identifies the recording by id.
        try {
            api.deleteTeXMLCallRecording(accountSid, recordingSid)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#deleteTeXMLCallRecording");
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
 **recordingSid** | **UUID**| Uniquely identifies the recording by id. |

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


## deleteTexmlConferenceParticipant

> deleteTexmlConferenceParticipant(accountSid, conferenceSid, callSid)

Delete a conference participant

Deletes a conference participant

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        String conferenceSid = "conferenceSid_example"; // String | The ConferenceSid that uniquely identifies a conference.
        String callSid = "callSid_example"; // String | The CallSid that identifies the call to update.
        try {
            apiInstance.deleteTexmlConferenceParticipant(accountSid, conferenceSid, callSid);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#deleteTexmlConferenceParticipant");
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
 **conferenceSid** | **String**| The ConferenceSid that uniquely identifies a conference. |
 **callSid** | **String**| The CallSid that identifies the call to update. |

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


## dialTexmlConferenceParticipant

> NewParticipantResource dialTexmlConferenceParticipant(accountSid, conferenceSid, beep, statusCallback, statusCallbackMethod, statusCallbackEvent, to, from, timeout, muted, startConferenceOnEnter, endConferenceOnExit, waitUrl, maxParticipants, coaching, callSidToCoach, callerId, timeLimit, machineDetection, machineDetectionTimeout, machineDetectionSpeechThreshold, machineDetectionSpeechEndThreshold, machineDetectionSilenceTimeout, amdStatusCallback, amdStatusCallbackMethod, cancelPlaybackOnMachineDetection, cancelPlaybackOnDetectMessageEnd, preferredCodecs, record, recordingChannels, recordingStatusCallback, recordingStatusCallbackMethod, recordingStatusCallbackEvent, recordingTrack, sipAuthPassword, sipAuthUsername, trim, conferenceRecord, conferenceRecordingStatusCallback, conferenceRecordingStatusCallbackMethod, conferenceRecordingStatusCallbackEvent, conferenceRecordingTimeout, conferenceTrim)

Dial a new conference participant

Dials a new conference participant

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        String conferenceSid = "conferenceSid_example"; // String | The ConferenceSid that uniquely identifies a conference.
        String beep = "true"; // String | Whether to play a notification beep to the conference when the participant enters and exits.
        String statusCallback = "statusCallback_example"; // String | URL destination for Telnyx to send status callback events to for the call.
        String statusCallbackMethod = "GET"; // String | HTTP request type used for `StatusCallback`.
        String statusCallbackEvent = "statusCallbackEvent_example"; // String | The changes to the call's state that should generate a call to `StatusCallback`. Can be: `initiated`, `ringing`, `answered`, and `completed`. Separate multiple values with a space. The default value is `completed`.
        String to = "to_example"; // String | The phone number of the called party. Phone numbers are formatted with a `+` and country code.
        String from = "from_example"; // String | The phone number of the party that initiated the call. Phone numbers are formatted with a `+` and country code.
        Integer timeout = 56; // Integer | The number of seconds that we should allow the phone to ring before assuming there is no answer. Can be an integer between 5 and 120, inclusive. The default value is 30.
        Boolean muted = true; // Boolean | Whether the participant should be muted.
        Boolean startConferenceOnEnter = true; // Boolean | Whether to start the conference when the participant enters. Defaults to `true`.
        Boolean endConferenceOnExit = true; // Boolean | Whether to end the conference when the participant leaves. Defaults to `false`.
        String waitUrl = "waitUrl_example"; // String | The URL to call for an audio file to play while the participant is waiting for the conference to start.
        Integer maxParticipants = 56; // Integer | The maximum number of participants in the conference. Can be a positive integer from 2 to 800. The default value is 250.
        Boolean coaching = true; // Boolean | Whether the participant is coaching another call. When `true`, `CallSidToCoach` has to be given.
        String callSidToCoach = "callSidToCoach_example"; // String | The SID of the participant who is being coached. The participant being coached is the only participant who can hear the participant who is coaching.
        String callerId = "callerId_example"; // String | To be used as the caller id name (SIP From Display Name) presented to the destination (`To` number). The string should have a maximum of 128 characters, containing only letters, numbers, spaces, and `-_~!.+` special characters. If ommited, the display name will be the same as the number in the `From` field.
        Integer timeLimit = 56; // Integer | The maximum duration of the call in seconds.
        String machineDetection = "Enable"; // String | Whether to detect if a human or an answering machine picked up the call. Use `Enable` if you would like to ne notified as soon as the called party is identified. Use `DetectMessageEnd`, if you would like to leave a message on an answering machine.
        Integer machineDetectionTimeout = 56; // Integer | How long answering machine detection should go on for before sending an `Unknown` result. Given in milliseconds.
        Integer machineDetectionSpeechThreshold = 3500; // Integer | Maximum threshold of a human greeting. If greeting longer than this value, considered machine. Ignored when `premium` detection is used.
        Integer machineDetectionSpeechEndThreshold = 800; // Integer | Silence duration threshold after a greeting message or voice for it be considered human. Ignored when `premium` detection is used.
        Integer machineDetectionSilenceTimeout = 3500; // Integer | If initial silence duration is greater than this value, consider it a machine. Ignored when `premium` detection is used.
        String amdStatusCallback = "amdStatusCallback_example"; // String | The URL the result of answering machine detection will be sent to.
        String amdStatusCallbackMethod = "GET"; // String | HTTP request type used for `AmdStatusCallback`. Defaults to `POST`.
        Boolean cancelPlaybackOnMachineDetection = true; // Boolean | Whether to cancel ongoing playback on `machine` detection. Defaults to `true`.
        Boolean cancelPlaybackOnDetectMessageEnd = true; // Boolean | Whether to cancel ongoing playback on `greeting ended` detection. Defaults to `true`.
        String preferredCodecs = "preferredCodecs_example"; // String | The list of comma-separated codecs to be offered on a call.
        Boolean record = true; // Boolean | Whether to record the entire participant's call leg. Defaults to `false`.
        String recordingChannels = "mono"; // String | The number of channels in the final recording. Defaults to `mono`.
        String recordingStatusCallback = "recordingStatusCallback_example"; // String | The URL the recording callbacks will be sent to.
        String recordingStatusCallbackMethod = "GET"; // String | HTTP request type used for `RecordingStatusCallback`. Defaults to `POST`.
        String recordingStatusCallbackEvent = "recordingStatusCallbackEvent_example"; // String | The changes to the recording's state that should generate a call to `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate multiple values with a space. Defaults to `completed`.
        String recordingTrack = "inbound"; // String | The audio track to record for the call. The default is `both`.
        String sipAuthPassword = "sipAuthPassword_example"; // String | The password to use for SIP authentication.
        String sipAuthUsername = "sipAuthUsername_example"; // String | The username to use for SIP authentication.
        String trim = "trim-silence"; // String | Whether to trim any leading and trailing silence from the recording. Defaults to `trim-silence`.
        String conferenceRecord = "true"; // String | Whether to record the conference the participant is joining. Defualts to `do-not-record`. The boolean values `true` and `false` are synonymous with `record-from-start` and `do-not-record` respectively.
        String conferenceRecordingStatusCallback = "conferenceRecordingStatusCallback_example"; // String | The URL the conference recording callbacks will be sent to.
        String conferenceRecordingStatusCallbackMethod = "GET"; // String | HTTP request type used for `ConferenceRecordingStatusCallback`. Defaults to `POST`.
        String conferenceRecordingStatusCallbackEvent = "conferenceRecordingStatusCallbackEvent_example"; // String | The changes to the conference recording's state that should generate a call to `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate multiple values with a space. Defaults to `completed`. `failed` and `absent` are synonymous.
        Integer conferenceRecordingTimeout = 0; // Integer | The number of seconds that Telnyx will wait for the recording to be stopped if silence is detected. The timer only starts when the speech is detected. Please note that the transcription is used to detect silence and the related charge will be applied. The minimum value is 0. The default value is 0 (infinite)
        String conferenceTrim = "trim-silence"; // String | Whether to trim any leading and trailing silence from the conference recording. Defaults to `trim-silence`.
        try {
            NewParticipantResource result = apiInstance.dialTexmlConferenceParticipant(accountSid, conferenceSid, beep, statusCallback, statusCallbackMethod, statusCallbackEvent, to, from, timeout, muted, startConferenceOnEnter, endConferenceOnExit, waitUrl, maxParticipants, coaching, callSidToCoach, callerId, timeLimit, machineDetection, machineDetectionTimeout, machineDetectionSpeechThreshold, machineDetectionSpeechEndThreshold, machineDetectionSilenceTimeout, amdStatusCallback, amdStatusCallbackMethod, cancelPlaybackOnMachineDetection, cancelPlaybackOnDetectMessageEnd, preferredCodecs, record, recordingChannels, recordingStatusCallback, recordingStatusCallbackMethod, recordingStatusCallbackEvent, recordingTrack, sipAuthPassword, sipAuthUsername, trim, conferenceRecord, conferenceRecordingStatusCallback, conferenceRecordingStatusCallbackMethod, conferenceRecordingStatusCallbackEvent, conferenceRecordingTimeout, conferenceTrim);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#dialTexmlConferenceParticipant");
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
 **conferenceSid** | **String**| The ConferenceSid that uniquely identifies a conference. |
 **beep** | **String**| Whether to play a notification beep to the conference when the participant enters and exits. | [optional] [enum: true, false, onEnter, onExit]
 **statusCallback** | **String**| URL destination for Telnyx to send status callback events to for the call. | [optional]
 **statusCallbackMethod** | **String**| HTTP request type used for &#x60;StatusCallback&#x60;. | [optional] [enum: GET, POST]
 **statusCallbackEvent** | **String**| The changes to the call&#39;s state that should generate a call to &#x60;StatusCallback&#x60;. Can be: &#x60;initiated&#x60;, &#x60;ringing&#x60;, &#x60;answered&#x60;, and &#x60;completed&#x60;. Separate multiple values with a space. The default value is &#x60;completed&#x60;. | [optional]
 **to** | **String**| The phone number of the called party. Phone numbers are formatted with a &#x60;+&#x60; and country code. | [optional]
 **from** | **String**| The phone number of the party that initiated the call. Phone numbers are formatted with a &#x60;+&#x60; and country code. | [optional]
 **timeout** | **Integer**| The number of seconds that we should allow the phone to ring before assuming there is no answer. Can be an integer between 5 and 120, inclusive. The default value is 30. | [optional]
 **muted** | **Boolean**| Whether the participant should be muted. | [optional]
 **startConferenceOnEnter** | **Boolean**| Whether to start the conference when the participant enters. Defaults to &#x60;true&#x60;. | [optional]
 **endConferenceOnExit** | **Boolean**| Whether to end the conference when the participant leaves. Defaults to &#x60;false&#x60;. | [optional]
 **waitUrl** | **String**| The URL to call for an audio file to play while the participant is waiting for the conference to start. | [optional]
 **maxParticipants** | **Integer**| The maximum number of participants in the conference. Can be a positive integer from 2 to 800. The default value is 250. | [optional]
 **coaching** | **Boolean**| Whether the participant is coaching another call. When &#x60;true&#x60;, &#x60;CallSidToCoach&#x60; has to be given. | [optional]
 **callSidToCoach** | **String**| The SID of the participant who is being coached. The participant being coached is the only participant who can hear the participant who is coaching. | [optional]
 **callerId** | **String**| To be used as the caller id name (SIP From Display Name) presented to the destination (&#x60;To&#x60; number). The string should have a maximum of 128 characters, containing only letters, numbers, spaces, and &#x60;-_~!.+&#x60; special characters. If ommited, the display name will be the same as the number in the &#x60;From&#x60; field. | [optional]
 **timeLimit** | **Integer**| The maximum duration of the call in seconds. | [optional]
 **machineDetection** | **String**| Whether to detect if a human or an answering machine picked up the call. Use &#x60;Enable&#x60; if you would like to ne notified as soon as the called party is identified. Use &#x60;DetectMessageEnd&#x60;, if you would like to leave a message on an answering machine. | [optional] [enum: Enable, DetectMessageEnd]
 **machineDetectionTimeout** | **Integer**| How long answering machine detection should go on for before sending an &#x60;Unknown&#x60; result. Given in milliseconds. | [optional]
 **machineDetectionSpeechThreshold** | **Integer**| Maximum threshold of a human greeting. If greeting longer than this value, considered machine. Ignored when &#x60;premium&#x60; detection is used. | [optional] [default to 3500]
 **machineDetectionSpeechEndThreshold** | **Integer**| Silence duration threshold after a greeting message or voice for it be considered human. Ignored when &#x60;premium&#x60; detection is used. | [optional] [default to 800]
 **machineDetectionSilenceTimeout** | **Integer**| If initial silence duration is greater than this value, consider it a machine. Ignored when &#x60;premium&#x60; detection is used. | [optional] [default to 3500]
 **amdStatusCallback** | **String**| The URL the result of answering machine detection will be sent to. | [optional]
 **amdStatusCallbackMethod** | **String**| HTTP request type used for &#x60;AmdStatusCallback&#x60;. Defaults to &#x60;POST&#x60;. | [optional] [enum: GET, POST]
 **cancelPlaybackOnMachineDetection** | **Boolean**| Whether to cancel ongoing playback on &#x60;machine&#x60; detection. Defaults to &#x60;true&#x60;. | [optional] [default to true]
 **cancelPlaybackOnDetectMessageEnd** | **Boolean**| Whether to cancel ongoing playback on &#x60;greeting ended&#x60; detection. Defaults to &#x60;true&#x60;. | [optional] [default to true]
 **preferredCodecs** | **String**| The list of comma-separated codecs to be offered on a call. | [optional]
 **record** | **Boolean**| Whether to record the entire participant&#39;s call leg. Defaults to &#x60;false&#x60;. | [optional]
 **recordingChannels** | **String**| The number of channels in the final recording. Defaults to &#x60;mono&#x60;. | [optional] [enum: mono, dual]
 **recordingStatusCallback** | **String**| The URL the recording callbacks will be sent to. | [optional]
 **recordingStatusCallbackMethod** | **String**| HTTP request type used for &#x60;RecordingStatusCallback&#x60;. Defaults to &#x60;POST&#x60;. | [optional] [enum: GET, POST]
 **recordingStatusCallbackEvent** | **String**| The changes to the recording&#39;s state that should generate a call to &#x60;RecoridngStatusCallback&#x60;. Can be: &#x60;in-progress&#x60;, &#x60;completed&#x60; and &#x60;absent&#x60;. Separate multiple values with a space. Defaults to &#x60;completed&#x60;. | [optional]
 **recordingTrack** | **String**| The audio track to record for the call. The default is &#x60;both&#x60;. | [optional] [enum: inbound, outbound, both]
 **sipAuthPassword** | **String**| The password to use for SIP authentication. | [optional]
 **sipAuthUsername** | **String**| The username to use for SIP authentication. | [optional]
 **trim** | **String**| Whether to trim any leading and trailing silence from the recording. Defaults to &#x60;trim-silence&#x60;. | [optional] [enum: trim-silence, do-not-trim]
 **conferenceRecord** | **String**| Whether to record the conference the participant is joining. Defualts to &#x60;do-not-record&#x60;. The boolean values &#x60;true&#x60; and &#x60;false&#x60; are synonymous with &#x60;record-from-start&#x60; and &#x60;do-not-record&#x60; respectively. | [optional] [enum: true, false, record-from-start, do-not-record]
 **conferenceRecordingStatusCallback** | **String**| The URL the conference recording callbacks will be sent to. | [optional]
 **conferenceRecordingStatusCallbackMethod** | **String**| HTTP request type used for &#x60;ConferenceRecordingStatusCallback&#x60;. Defaults to &#x60;POST&#x60;. | [optional] [enum: GET, POST]
 **conferenceRecordingStatusCallbackEvent** | **String**| The changes to the conference recording&#39;s state that should generate a call to &#x60;RecoridngStatusCallback&#x60;. Can be: &#x60;in-progress&#x60;, &#x60;completed&#x60; and &#x60;absent&#x60;. Separate multiple values with a space. Defaults to &#x60;completed&#x60;. &#x60;failed&#x60; and &#x60;absent&#x60; are synonymous. | [optional]
 **conferenceRecordingTimeout** | **Integer**| The number of seconds that Telnyx will wait for the recording to be stopped if silence is detected. The timer only starts when the speech is detected. Please note that the transcription is used to detect silence and the related charge will be applied. The minimum value is 0. The default value is 0 (infinite) | [optional] [default to 0]
 **conferenceTrim** | **String**| Whether to trim any leading and trailing silence from the conference recording. Defaults to &#x60;trim-silence&#x60;. | [optional] [enum: trim-silence, do-not-trim]

### Return type

[**NewParticipantResource**](NewParticipantResource.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | New participant resource. |  -  |
| **404** | Resource not found |  -  |


## fetchTeXMLCallRecordings

> TexmlGetCallRecordingsResponseBody fetchTeXMLCallRecordings(accountSid, callSid).execute();

Fetch recordings for a call

Returns recordings for a call identified by call_sid.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        String callSid = "callSid_example"; // String | The CallSid that identifies the call to update.
        try {
            TexmlGetCallRecordingsResponseBody result = api.fetchTeXMLCallRecordings(accountSid, callSid)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#fetchTeXMLCallRecordings");
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
 **callSid** | **String**| The CallSid that identifies the call to update. |

### Return type

[**TexmlGetCallRecordingsResponseBody**](TexmlGetCallRecordingsResponseBody.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Get Call Recordings Response |  -  |
| **404** | Resource not found |  -  |


## fetchTeXMLConferenceRecordings

> TexmlGetCallRecordingsResponseBody fetchTeXMLConferenceRecordings(accountSid, conferenceSid).execute();

Fetch recordings for a conference

Returns recordings for a conference identified by conference_sid.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        String conferenceSid = "conferenceSid_example"; // String | The ConferenceSid that uniquely identifies a conference.
        try {
            TexmlGetCallRecordingsResponseBody result = api.fetchTeXMLConferenceRecordings(accountSid, conferenceSid)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#fetchTeXMLConferenceRecordings");
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
 **conferenceSid** | **String**| The ConferenceSid that uniquely identifies a conference. |

### Return type

[**TexmlGetCallRecordingsResponseBody**](TexmlGetCallRecordingsResponseBody.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Get Call Recordings Response |  -  |
| **404** | Resource not found |  -  |


## getTeXMLCallRecording

> TexmlGetCallRecordingResponseBody getTeXMLCallRecording(accountSid, recordingSid).execute();

Fetch recording resource

Returns recording resource identified by recording id.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        UUID recordingSid = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Uniquely identifies the recording by id.
        try {
            TexmlGetCallRecordingResponseBody result = api.getTeXMLCallRecording(accountSid, recordingSid)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#getTeXMLCallRecording");
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
 **recordingSid** | **UUID**| Uniquely identifies the recording by id. |

### Return type

[**TexmlGetCallRecordingResponseBody**](TexmlGetCallRecordingResponseBody.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieves call recording resource. |  -  |
| **404** | Resource not found |  -  |


## getTeXMLCallRecordings

> TexmlGetCallRecordingsResponseBody getTeXMLCallRecordings(accountSid).page(page).pageSize(pageSize).dateCreated(dateCreated).execute();

Fetch multiple recording resources

Returns multiple recording resources for an account.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        Integer page = 1; // Integer | The number of the page to be displayed, zero-indexed, should be used in conjuction with PageToken.
        Integer pageSize = 10; // Integer | The number of records to be displayed on a page
        String dateCreated = "2023-05-22"; // String | Filters recording by the creation date. Expected format is ISO8601 date or date-time, ie. {YYYY}-{MM}-{DD} or {YYYY}-{MM}-{DD}T{hh}:{mm}:{ss}Z. Also accepts inequality operators, e.g. DateCreated>=2023-05-22.
        try {
            TexmlGetCallRecordingsResponseBody result = api.getTeXMLCallRecordings(accountSid)
                .page(page)
                .pageSize(pageSize)
                .dateCreated(dateCreated)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#getTeXMLCallRecordings");
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
 **page** | **Integer**| The number of the page to be displayed, zero-indexed, should be used in conjuction with PageToken. | [optional]
 **pageSize** | **Integer**| The number of records to be displayed on a page | [optional]
 **dateCreated** | **String**| Filters recording by the creation date. Expected format is ISO8601 date or date-time, ie. {YYYY}-{MM}-{DD} or {YYYY}-{MM}-{DD}T{hh}:{mm}:{ss}Z. Also accepts inequality operators, e.g. DateCreated&gt;&#x3D;2023-05-22. | [optional]

### Return type

[**TexmlGetCallRecordingsResponseBody**](TexmlGetCallRecordingsResponseBody.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Get Call Recordings Response |  -  |
| **404** | Resource not found |  -  |


## getTexmlCall

> CallResource getTexmlCall(callSid, accountSid)

Fetch a call

Returns an individual call identified by its CallSid. This endpoint is eventually consistent.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String callSid = "callSid_example"; // String | The CallSid that identifies the call to update.
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        try {
            CallResource result = apiInstance.getTexmlCall(callSid, accountSid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#getTexmlCall");
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
 **callSid** | **String**| The CallSid that identifies the call to update. |
 **accountSid** | **String**| The id of the account the resource belongs to. |

### Return type

[**CallResource**](CallResource.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Call resource. |  -  |
| **404** | Resource not found |  -  |


## getTexmlCalls

> MultipleCallResources getTexmlCalls(accountSid, page, pageSize, pageToken, to, from, status, startTime, endTime)

Fetch multiple call resources

Returns multiple call resouces for an account. This endpoint is eventually consistent.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        Integer page = 1; // Integer | The number of the page to be displayed, zero-indexed, should be used in conjuction with PageToken.
        Integer pageSize = 20; // Integer | The size of the page
        String pageToken = "pageToken_example"; // String | Used to request the next page of results.
        String to = "+1312345678"; // String | Filters calls by the to number.
        String from = "+1312345678"; // String | Filters calls by the from number.
        String status = "canceled"; // String | Filters calls by status.
        String startTime = ">=2023-05-22"; // String | Filters calls by the start date. Expected format is YYYY-MM-DD. Also accepts inequality operators, e.g. StartTime>=2023-05-22.
        String endTime = ">=2023-05-22"; // String | Filters calls by their end date. Expected format is YYYY-MM-DD. Also accepts inequality operators, e.g. EndTime>=2023-05-22.
        try {
            MultipleCallResources result = apiInstance.getTexmlCalls(accountSid, page, pageSize, pageToken, to, from, status, startTime, endTime);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#getTexmlCalls");
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
 **page** | **Integer**| The number of the page to be displayed, zero-indexed, should be used in conjuction with PageToken. | [optional]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **pageToken** | **String**| Used to request the next page of results. | [optional]
 **to** | **String**| Filters calls by the to number. | [optional]
 **from** | **String**| Filters calls by the from number. | [optional]
 **status** | **String**| Filters calls by status. | [optional] [enum: canceled, completed, failed, busy, no-answer]
 **startTime** | **String**| Filters calls by the start date. Expected format is YYYY-MM-DD. Also accepts inequality operators, e.g. StartTime&gt;&#x3D;2023-05-22. | [optional]
 **endTime** | **String**| Filters calls by their end date. Expected format is YYYY-MM-DD. Also accepts inequality operators, e.g. EndTime&gt;&#x3D;2023-05-22. | [optional]

### Return type

[**MultipleCallResources**](MultipleCallResources.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Multiple call resources. |  -  |
| **404** | Resource not found |  -  |


## getTexmlConference

> ConferenceResource getTexmlConference(accountSid, conferenceSid)

Fetch a conference resource

Returns a conference resource.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        String conferenceSid = "conferenceSid_example"; // String | The ConferenceSid that uniquely identifies a conference.
        try {
            ConferenceResource result = apiInstance.getTexmlConference(accountSid, conferenceSid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#getTexmlConference");
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
 **conferenceSid** | **String**| The ConferenceSid that uniquely identifies a conference. |

### Return type

[**ConferenceResource**](ConferenceResource.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Conference resource. |  -  |
| **404** | Resource not found |  -  |


## getTexmlConferenceParticipant

> ParticipantResource getTexmlConferenceParticipant(accountSid, conferenceSid, callSid)

Get conference participant resource

Gets conference participant resource

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        String conferenceSid = "conferenceSid_example"; // String | The ConferenceSid that uniquely identifies a conference.
        String callSid = "callSid_example"; // String | The CallSid that identifies the call to update.
        try {
            ParticipantResource result = apiInstance.getTexmlConferenceParticipant(accountSid, conferenceSid, callSid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#getTexmlConferenceParticipant");
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
 **conferenceSid** | **String**| The ConferenceSid that uniquely identifies a conference. |
 **callSid** | **String**| The CallSid that identifies the call to update. |

### Return type

[**ParticipantResource**](ParticipantResource.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Participant resource. |  -  |
| **404** | Resource not found |  -  |


## getTexmlConferenceParticipants

> MultipleParticipantResources getTexmlConferenceParticipants(accountSid, conferenceSid)

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
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        String conferenceSid = "conferenceSid_example"; // String | The ConferenceSid that uniquely identifies a conference.
        try {
            MultipleParticipantResources result = apiInstance.getTexmlConferenceParticipants(accountSid, conferenceSid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#getTexmlConferenceParticipants");
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
 **conferenceSid** | **String**| The ConferenceSid that uniquely identifies a conference. |

### Return type

[**MultipleParticipantResources**](MultipleParticipantResources.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Multiple participant resources. |  -  |
| **404** | Resource not found |  -  |


## getTexmlConferenceRecordings

> MultipleConferenceRecordingResources getTexmlConferenceRecordings(accountSid, conferenceSid)

List conference recordings

Lists conference recordings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        String conferenceSid = "conferenceSid_example"; // String | The ConferenceSid that uniquely identifies a conference.
        try {
            MultipleConferenceRecordingResources result = apiInstance.getTexmlConferenceRecordings(accountSid, conferenceSid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#getTexmlConferenceRecordings");
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
 **conferenceSid** | **String**| The ConferenceSid that uniquely identifies a conference. |

### Return type

[**MultipleConferenceRecordingResources**](MultipleConferenceRecordingResources.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Multiple conference recording resources. |  -  |
| **404** | Resource not found |  -  |


## getTexmlConferences

> MultipleConferenceResources getTexmlConferences(accountSid, page, pageSize, pageToken, friendlyName, status, dateCreated, dateUpdated)

List conference resources

Lists conference resources.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        Integer page = 1; // Integer | The number of the page to be displayed, zero-indexed, should be used in conjuction with PageToken.
        Integer pageSize = 20; // Integer | The size of the page
        String pageToken = "pageToken_example"; // String | Used to request the next page of results.
        String friendlyName = "weekly_review_call"; // String | Filters conferences by their friendly name.
        String status = "init"; // String | Filters conferences by status.
        String dateCreated = ">=2023-05-22"; // String | Filters conferences by the creation date. Expected format is YYYY-MM-DD. Also accepts inequality operators, e.g. DateCreated>=2023-05-22.
        String dateUpdated = ">=2023-05-22"; // String | Filters conferences by the time they were last updated. Expected format is YYYY-MM-DD. Also accepts inequality operators, e.g. DateUpdated>=2023-05-22.
        try {
            MultipleConferenceResources result = apiInstance.getTexmlConferences(accountSid, page, pageSize, pageToken, friendlyName, status, dateCreated, dateUpdated);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#getTexmlConferences");
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
 **page** | **Integer**| The number of the page to be displayed, zero-indexed, should be used in conjuction with PageToken. | [optional]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **pageToken** | **String**| Used to request the next page of results. | [optional]
 **friendlyName** | **String**| Filters conferences by their friendly name. | [optional]
 **status** | **String**| Filters conferences by status. | [optional] [enum: init, in-progress, completed]
 **dateCreated** | **String**| Filters conferences by the creation date. Expected format is YYYY-MM-DD. Also accepts inequality operators, e.g. DateCreated&gt;&#x3D;2023-05-22. | [optional]
 **dateUpdated** | **String**| Filters conferences by the time they were last updated. Expected format is YYYY-MM-DD. Also accepts inequality operators, e.g. DateUpdated&gt;&#x3D;2023-05-22. | [optional]

### Return type

[**MultipleConferenceResources**](MultipleConferenceResources.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Multiple conference resources. |  -  |
| **404** | Resource not found |  -  |


## initiateTexmlCall

> InitiateTeXMLCallResponse initiateTexmlCall(accountSid).initiateCallRequest(initiateCallRequest).execute();

Initiate an outbound call

Initiate an outbound TeXML call. Telnyx will request TeXML from the XML Request URL configured for the connection in the Mission Control Portal.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        InitiateCallRequest initiateCallRequest = new InitiateCallRequest(); // InitiateCallRequest | Iniatiate Call request object
        try {
            InitiateTeXMLCallResponse result = api.initiateTexmlCall(accountSid)
                .initiateCallRequest(initiateCallRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#initiateTexmlCall");
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
 **initiateCallRequest** | [**InitiateCallRequest**](InitiateCallRequest.md)| Iniatiate Call request object |

### Return type

[**InitiateTeXMLCallResponse**](InitiateTeXMLCallResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon initiating a TeXML call. |  -  |


## initiateTexmlCall_0

> InitiateTeXMLCallResponse initiateTexmlCall_0(applicationId).initiateCallRequest(initiateCallRequest).execute();

Initiate an outbound call

Initiate an outbound TeXML call. Telnyx will request TeXML from the XML Request URL configured for the connection in the Mission Control Portal.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the TeXML application used for the call.
        InitiateCallRequest initiateCallRequest = new InitiateCallRequest(); // InitiateCallRequest | Iniatiate Call request object
        try {
            InitiateTeXMLCallResponse result = api.initiateTexmlCall_0(applicationId)
                .initiateCallRequest(initiateCallRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#initiateTexmlCall_0");
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
 **applicationId** | **String**| The ID of the TeXML application used for the call. |
 **initiateCallRequest** | [**InitiateCallRequest**](InitiateCallRequest.md)| Iniatiate Call request object |

### Return type

[**InitiateTeXMLCallResponse**](InitiateTeXMLCallResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon initiating a TeXML call. |  -  |


## startTeXMLCallRecording

> TexmlCreateCallRecordingResponseBody startTeXMLCallRecording(accountSid, callSid).texmlCreateCallRecordingRequestBody(texmlCreateCallRecordingRequestBody).execute();

Request recording for a call

Starts recording with specified parameters for call idientified by call_sid.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        String callSid = "callSid_example"; // String | The CallSid that identifies the call to update.
        TexmlCreateCallRecordingRequestBody texmlCreateCallRecordingRequestBody = new TexmlCreateCallRecordingRequestBody(); // TexmlCreateCallRecordingRequestBody | Starts call recording on a call.
        try {
            TexmlCreateCallRecordingResponseBody result = api.startTeXMLCallRecording(accountSid, callSid)
                .texmlCreateCallRecordingRequestBody(texmlCreateCallRecordingRequestBody)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#startTeXMLCallRecording");
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
 **callSid** | **String**| The CallSid that identifies the call to update. |
 **texmlCreateCallRecordingRequestBody** | [**TexmlCreateCallRecordingRequestBody**](TexmlCreateCallRecordingRequestBody.md)| Starts call recording on a call. | [optional]

### Return type

[**TexmlCreateCallRecordingResponseBody**](TexmlCreateCallRecordingResponseBody.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful call recording create response |  -  |
| **404** | Resource not found |  -  |


## updateTeXMLCallRecording

> TexmlCreateCallRecordingResponseBody updateTeXMLCallRecording(accountSid, callSid, recordingSid).texmlUpdateCallRecordingRequestBody(texmlUpdateCallRecordingRequestBody).execute();

Update recording on a call

Updates recording resource for particular call.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        String callSid = "callSid_example"; // String | The CallSid that identifies the call to update.
        UUID recordingSid = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Uniquely identifies the recording by id.
        TexmlUpdateCallRecordingRequestBody texmlUpdateCallRecordingRequestBody = new TexmlUpdateCallRecordingRequestBody(); // TexmlUpdateCallRecordingRequestBody | Update call recording on a call.
        try {
            TexmlCreateCallRecordingResponseBody result = api.updateTeXMLCallRecording(accountSid, callSid, recordingSid)
                .texmlUpdateCallRecordingRequestBody(texmlUpdateCallRecordingRequestBody)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#updateTeXMLCallRecording");
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
 **callSid** | **String**| The CallSid that identifies the call to update. |
 **recordingSid** | **UUID**| Uniquely identifies the recording by id. |
 **texmlUpdateCallRecordingRequestBody** | [**TexmlUpdateCallRecordingRequestBody**](TexmlUpdateCallRecordingRequestBody.md)| Update call recording on a call. | [optional]

### Return type

[**TexmlCreateCallRecordingResponseBody**](TexmlCreateCallRecordingResponseBody.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful call recording create response |  -  |
| **404** | Resource not found |  -  |


## updateTexmlCall

> CallResource updateTexmlCall(callSid, accountSid).status(status).url(url).method(method).fallbackUrl(fallbackUrl).fallbackMethod(fallbackMethod).statusCallback(statusCallback).statusCallbackMethod(statusCallbackMethod).texml(texml).execute();

Update call

Update TeXML call. Please note that the keys present in the payload MUST BE formatted in CamelCase as specified in the example.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String callSid = "callSid_example"; // String | The CallSid that identifies the call to update.
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        String status = "status_example"; // String | The value to set the call status to. Setting the status to completed ends the call.
        String url = "url_example"; // String | The URL where TeXML will make a request to retrieve a new set of TeXML instructions to continue the call flow.
        String method = "GET"; // String | HTTP request type used for `Url`.
        String fallbackUrl = "fallbackUrl_example"; // String | A failover URL for which Telnyx will retrieve the TeXML call instructions if the Url is not responding.
        String fallbackMethod = "GET"; // String | HTTP request type used for `FallbackUrl`.
        String statusCallback = "statusCallback_example"; // String | URL destination for Telnyx to send status callback events to for the call.
        String statusCallbackMethod = "GET"; // String | HTTP request type used for `StatusCallback`.
        String texml = "texml_example"; // String | TeXML to replace the current one with.
        try {
            CallResource result = api.updateTexmlCall(callSid, accountSid)
                .status(status)
                .url(url)
                .method(method)
                .fallbackUrl(fallbackUrl)
                .fallbackMethod(fallbackMethod)
                .statusCallback(statusCallback)
                .statusCallbackMethod(statusCallbackMethod)
                .texml(texml)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#updateTexmlCall");
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
 **callSid** | **String**| The CallSid that identifies the call to update. |
 **accountSid** | **String**| The id of the account the resource belongs to. |
 **status** | **String**| The value to set the call status to. Setting the status to completed ends the call. | [optional]
 **url** | **String**| The URL where TeXML will make a request to retrieve a new set of TeXML instructions to continue the call flow. | [optional]
 **method** | **String**| HTTP request type used for &#x60;Url&#x60;. | [optional] [enum: GET, POST]
 **fallbackUrl** | **String**| A failover URL for which Telnyx will retrieve the TeXML call instructions if the Url is not responding. | [optional]
 **fallbackMethod** | **String**| HTTP request type used for &#x60;FallbackUrl&#x60;. | [optional] [enum: GET, POST]
 **statusCallback** | **String**| URL destination for Telnyx to send status callback events to for the call. | [optional]
 **statusCallbackMethod** | **String**| HTTP request type used for &#x60;StatusCallback&#x60;. | [optional] [enum: GET, POST]
 **texml** | **String**| TeXML to replace the current one with. | [optional]

### Return type

[**CallResource**](CallResource.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Call resource. |  -  |


## updateTexmlCall_0

> TeXMLRESTCommandResponse updateTexmlCall_0(callSid).updateCallRequest(updateCallRequest).execute();

Update call

Update TeXML call. Please note that the keys present in the payload MUST BE formatted in CamelCase as specified in the example.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String callSid = "callSid_example"; // String | The CallSid that identifies the call to update.
        UpdateCallRequest updateCallRequest = new UpdateCallRequest(); // UpdateCallRequest | Update Call request object
        try {
            TeXMLRESTCommandResponse result = api.updateTexmlCall_0(callSid)
                .updateCallRequest(updateCallRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#updateTexmlCall_0");
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
 **callSid** | **String**| The CallSid that identifies the call to update. |
 **updateCallRequest** | [**UpdateCallRequest**](UpdateCallRequest.md)| Update Call request object |

### Return type

[**TeXMLRESTCommandResponse**](TeXMLRESTCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon updating a TeXML call. |  -  |


## updateTexmlConference

> ConferenceResource updateTexmlConference(accountSid, conferenceSid, status, announceUrl, announceMethod)

Update a conference resource

Updates a conference resource.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        String conferenceSid = "conferenceSid_example"; // String | The ConferenceSid that uniquely identifies a conference.
        String status = "status_example"; // String | The new status of the resource. Specifying `completed` will end the conference and hang up all participants.
        String announceUrl = "announceUrl_example"; // String | The URL we should call to announce something into the conference. The URL may return an MP3 file, a WAV file, or a TwiML document that contains <Play>, <Say>, <Pause>, or <Redirect> verbs.
        String announceMethod = "GET"; // String | The HTTP method used to call the `AnnounceUrl`. Defaults to `POST`.
        try {
            ConferenceResource result = apiInstance.updateTexmlConference(accountSid, conferenceSid, status, announceUrl, announceMethod);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#updateTexmlConference");
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
 **conferenceSid** | **String**| The ConferenceSid that uniquely identifies a conference. |
 **status** | **String**| The new status of the resource. Specifying &#x60;completed&#x60; will end the conference and hang up all participants. | [optional]
 **announceUrl** | **String**| The URL we should call to announce something into the conference. The URL may return an MP3 file, a WAV file, or a TwiML document that contains &lt;Play&gt;, &lt;Say&gt;, &lt;Pause&gt;, or &lt;Redirect&gt; verbs. | [optional]
 **announceMethod** | **String**| The HTTP method used to call the &#x60;AnnounceUrl&#x60;. Defaults to &#x60;POST&#x60;. | [optional] [enum: GET, POST]

### Return type

[**ConferenceResource**](ConferenceResource.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Conference resource. |  -  |
| **404** | Resource not found |  -  |


## updateTexmlConferenceParticipant

> ParticipantResource updateTexmlConferenceParticipant(accountSid, conferenceSid, callSid, muted, hold, holdURL, holdMethod, announceUrl, announceMethod, waitUrl, beepOnExit, endConferenceOnExit, coaching, callSidToCoach)

Update a conference participant

Updates a conference participant

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String accountSid = "accountSid_example"; // String | The id of the account the resource belongs to.
        String conferenceSid = "conferenceSid_example"; // String | The ConferenceSid that uniquely identifies a conference.
        String callSid = "callSid_example"; // String | The CallSid that identifies the call to update.
        Boolean muted = true; // Boolean | Whether the participant should be muted.
        Boolean hold = true; // Boolean | Whether the participant should be on hold.
        String holdURL = "holdURL_example"; // String | The URL to be called using the `HoldMethod` for music that plays when the participant is on hold. The URL may return an MP3 file, a WAV file, or a TwiML document that contains <Play>, <Say>, <Pause>, or <Redirect> verbs.
        String holdMethod = "GET"; // String | The HTTP method to use when calling the `HoldURL`.
        String announceUrl = "announceUrl_example"; // String | The URL to call to announce something to the participant. The URL may return an MP3 fileo a WAV file, or a TwiML document that contains <Play>, <Say>, <Pause>, or <Redirect> verbs.
        String announceMethod = "GET"; // String | The HTTP method used to call the `AnnounceUrl`. Defaults to `POST`.
        String waitUrl = "waitUrl_example"; // String | The URL to call for an audio file to play while the participant is waiting for the conference to start.
        Boolean beepOnExit = true; // Boolean | Whether to play a notification beep to the conference when the participant exits.
        Boolean endConferenceOnExit = true; // Boolean | Whether to end the conference when the participant leaves.
        Boolean coaching = true; // Boolean | Whether the participant is coaching another call. When `true`, `CallSidToCoach` has to be given.
        String callSidToCoach = "callSidToCoach_example"; // String | The SID of the participant who is being coached. The participant being coached is the only participant who can hear the participant who is coaching.
        try {
            ParticipantResource result = apiInstance.updateTexmlConferenceParticipant(accountSid, conferenceSid, callSid, muted, hold, holdURL, holdMethod, announceUrl, announceMethod, waitUrl, beepOnExit, endConferenceOnExit, coaching, callSidToCoach);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#updateTexmlConferenceParticipant");
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
 **conferenceSid** | **String**| The ConferenceSid that uniquely identifies a conference. |
 **callSid** | **String**| The CallSid that identifies the call to update. |
 **muted** | **Boolean**| Whether the participant should be muted. | [optional]
 **hold** | **Boolean**| Whether the participant should be on hold. | [optional]
 **holdURL** | **String**| The URL to be called using the &#x60;HoldMethod&#x60; for music that plays when the participant is on hold. The URL may return an MP3 file, a WAV file, or a TwiML document that contains &lt;Play&gt;, &lt;Say&gt;, &lt;Pause&gt;, or &lt;Redirect&gt; verbs. | [optional]
 **holdMethod** | **String**| The HTTP method to use when calling the &#x60;HoldURL&#x60;. | [optional] [enum: GET, POST]
 **announceUrl** | **String**| The URL to call to announce something to the participant. The URL may return an MP3 fileo a WAV file, or a TwiML document that contains &lt;Play&gt;, &lt;Say&gt;, &lt;Pause&gt;, or &lt;Redirect&gt; verbs. | [optional]
 **announceMethod** | **String**| The HTTP method used to call the &#x60;AnnounceUrl&#x60;. Defaults to &#x60;POST&#x60;. | [optional] [enum: GET, POST]
 **waitUrl** | **String**| The URL to call for an audio file to play while the participant is waiting for the conference to start. | [optional]
 **beepOnExit** | **Boolean**| Whether to play a notification beep to the conference when the participant exits. | [optional]
 **endConferenceOnExit** | **Boolean**| Whether to end the conference when the participant leaves. | [optional]
 **coaching** | **Boolean**| Whether the participant is coaching another call. When &#x60;true&#x60;, &#x60;CallSidToCoach&#x60; has to be given. | [optional]
 **callSidToCoach** | **String**| The SID of the participant who is being coached. The participant being coached is the only participant who can hear the participant who is coaching. | [optional]

### Return type

[**ParticipantResource**](ParticipantResource.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Participant resource. |  -  |
| **404** | Resource not found |  -  |


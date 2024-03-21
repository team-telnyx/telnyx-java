# BulkPhoneNumberCampaignsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAssignmentTaskStatus**](BulkPhoneNumberCampaignsApi.md#getAssignmentTaskStatus) | **GET** /phoneNumberAssignmentByProfile/{taskId} | Get Assignment Task Status
[**getPhoneNumberStatus**](BulkPhoneNumberCampaignsApi.md#getPhoneNumberStatus) | **GET** /phoneNumberAssignmentByProfile/{taskId}/phoneNumbers | Get Phone Number Status
[**postAssignMessagingProfileToCampaign**](BulkPhoneNumberCampaignsApi.md#postAssignMessagingProfileToCampaign) | **POST** /phoneNumberAssignmentByProfile | Assign Messaging Profile To Campaign



## getAssignmentTaskStatus

> AssignmentTaskStatusResponse getAssignmentTaskStatus(taskId)

Get Assignment Task Status

Check the status of the task associated with assigning all phone numbers on a messaging profile to a campaign by `taskId`.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BulkPhoneNumberCampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BulkPhoneNumberCampaignsApi apiInstance = new BulkPhoneNumberCampaignsApi(defaultClient);
        String taskId = "taskId_example"; // String | 
        try {
            AssignmentTaskStatusResponse result = apiInstance.getAssignmentTaskStatus(taskId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkPhoneNumberCampaignsApi#getAssignmentTaskStatus");
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
 **taskId** | **String**|  |

### Return type

[**AssignmentTaskStatusResponse**](AssignmentTaskStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getPhoneNumberStatus

> PhoneNumberStatusResponsePaginated getPhoneNumberStatus(taskId, recordsPerPage, page)

Get Phone Number Status

Check the status of the individual phone number/campaign assignments associated with the supplied `taskId`.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BulkPhoneNumberCampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BulkPhoneNumberCampaignsApi apiInstance = new BulkPhoneNumberCampaignsApi(defaultClient);
        String taskId = "taskId_example"; // String | 
        Object recordsPerPage = 20; // Object | 
        Object page = 1; // Object | 
        try {
            PhoneNumberStatusResponsePaginated result = apiInstance.getPhoneNumberStatus(taskId, recordsPerPage, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkPhoneNumberCampaignsApi#getPhoneNumberStatus");
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
 **taskId** | **String**|  |
 **recordsPerPage** | **Object**|  | [optional] [default to 20]
 **page** | **Object**|  | [optional] [default to 1]

### Return type

[**PhoneNumberStatusResponsePaginated**](PhoneNumberStatusResponsePaginated.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## postAssignMessagingProfileToCampaign

> ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost postAssignMessagingProfileToCampaign(assignProfileToCampaignRequest)

Assign Messaging Profile To Campaign

This endpoint allows you to link all phone numbers associated with a Messaging Profile to a campaign. **Please note:** if you want to assign phone numbers to a campaign that you did not create with Telnyx 10DLC services, this endpoint allows that provided that you've shared the campaign with Telnyx. In this case, only provide the parameter, `tcrCampaignId`, and not `campaignId`. In all other cases (where the campaign you're assigning was created with Telnyx 10DLC services), only provide `campaignId`, not `tcrCampaignId`.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BulkPhoneNumberCampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BulkPhoneNumberCampaignsApi apiInstance = new BulkPhoneNumberCampaignsApi(defaultClient);
        AssignProfileToCampaignRequest assignProfileToCampaignRequest = new AssignProfileToCampaignRequest(); // AssignProfileToCampaignRequest | 
        try {
            ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost result = apiInstance.postAssignMessagingProfileToCampaign(assignProfileToCampaignRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkPhoneNumberCampaignsApi#postAssignMessagingProfileToCampaign");
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
 **assignProfileToCampaignRequest** | [**AssignProfileToCampaignRequest**](AssignProfileToCampaignRequest.md)|  |

### Return type

[**ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost**](ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **422** | Validation Error |  -  |


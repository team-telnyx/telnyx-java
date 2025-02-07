# SharedCampaignsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPartnerCampaignSharingStatus**](SharedCampaignsApi.md#getPartnerCampaignSharingStatus) | **GET** /partnerCampaign/{campaignId}/sharing | Get Sharing Status
[**getPartnerCampaignsSharedByUser**](SharedCampaignsApi.md#getPartnerCampaignsSharedByUser) | **GET** /partnerCampaign/sharedByMe | Get Partner Campaigns Shared By User
[**getSharedCampaign**](SharedCampaignsApi.md#getSharedCampaign) | **GET** /partner_campaigns/{campaignId} | Get Single Shared Campaign
[**getSharedCampaigns**](SharedCampaignsApi.md#getSharedCampaigns) | **GET** /partner_campaigns | List Shared Campaigns
[**updateSharedCampaign**](SharedCampaignsApi.md#updateSharedCampaign) | **PATCH** /partner_campaigns/{campaignId} | Update Single Shared Campaign



## getPartnerCampaignSharingStatus

> Map&lt;String, CampaignSharingStatus&gt; getPartnerCampaignSharingStatus(campaignId)

Get Sharing Status

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SharedCampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SharedCampaignsApi apiInstance = new SharedCampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | ID of the campaign in question
        try {
            Map<String, CampaignSharingStatus> result = apiInstance.getPartnerCampaignSharingStatus(campaignId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharedCampaignsApi#getPartnerCampaignSharingStatus");
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
 **campaignId** | **String**| ID of the campaign in question |

### Return type

[**Map&lt;String, CampaignSharingStatus&gt;**](CampaignSharingStatus.md)

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


## getPartnerCampaignsSharedByUser

> SharedCampaignRecordSet getPartnerCampaignsSharedByUser(page, recordsPerPage)

Get Partner Campaigns Shared By User

Get all partner campaigns you have shared to Telnyx in a paginated fashion

This endpoint is currently limited to only returning shared campaigns that Telnyx
has accepted. In other words, shared but pending campaigns are currently omitted
from the response from this endpoint.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SharedCampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SharedCampaignsApi apiInstance = new SharedCampaignsApi(defaultClient);
        Integer page = 1; // Integer | The 1-indexed page number to get. The default value is `1`.
        Integer recordsPerPage = 10; // Integer | The amount of records per page, limited to between 1 and 500 inclusive. The default value is `10`.
        try {
            SharedCampaignRecordSet result = apiInstance.getPartnerCampaignsSharedByUser(page, recordsPerPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharedCampaignsApi#getPartnerCampaignsSharedByUser");
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
 **page** | **Integer**| The 1-indexed page number to get. The default value is &#x60;1&#x60;. | [optional] [default to 1]
 **recordsPerPage** | **Integer**| The amount of records per page, limited to between 1 and 500 inclusive. The default value is &#x60;10&#x60;. | [optional] [default to 10]

### Return type

[**SharedCampaignRecordSet**](SharedCampaignRecordSet.md)

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


## getSharedCampaign

> TelnyxDownstreamCampaign getSharedCampaign(campaignId)

Get Single Shared Campaign

Retrieve campaign details by `campaignId`.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SharedCampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SharedCampaignsApi apiInstance = new SharedCampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | 
        try {
            TelnyxDownstreamCampaign result = apiInstance.getSharedCampaign(campaignId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharedCampaignsApi#getSharedCampaign");
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
 **campaignId** | **String**|  |

### Return type

[**TelnyxDownstreamCampaign**](TelnyxDownstreamCampaign.md)

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


## getSharedCampaigns

> TelnyxDownstreamCampaignRecordSet getSharedCampaigns(page, recordsPerPage, sort)

List Shared Campaigns

Retrieve all partner campaigns you have shared to Telnyx in a paginated fashion.

This endpoint is currently limited to only returning shared campaigns that Telnyx has accepted. In other words, shared but pending campaigns are currently omitted from the response from this endpoint.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SharedCampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SharedCampaignsApi apiInstance = new SharedCampaignsApi(defaultClient);
        Integer page = 1; // Integer | The 1-indexed page number to get. The default value is `1`.
        Integer recordsPerPage = 10; // Integer | The amount of records per page, limited to between 1 and 500 inclusive. The default value is `10`.
        String sort = "assignedPhoneNumbersCount"; // String | Specifies the sort order for results. If not given, results are sorted by createdAt in descending order.
        try {
            TelnyxDownstreamCampaignRecordSet result = apiInstance.getSharedCampaigns(page, recordsPerPage, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharedCampaignsApi#getSharedCampaigns");
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
 **page** | **Integer**| The 1-indexed page number to get. The default value is &#x60;1&#x60;. | [optional] [default to 1]
 **recordsPerPage** | **Integer**| The amount of records per page, limited to between 1 and 500 inclusive. The default value is &#x60;10&#x60;. | [optional] [default to 10]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by createdAt in descending order. | [optional] [default to -createdAt] [enum: assignedPhoneNumbersCount, -assignedPhoneNumbersCount, brandDisplayName, -brandDisplayName, tcrBrandId, -tcrBranId, tcrCampaignId, -tcrCampaignId, createdAt, -createdAt, campaignStatus, -campaignStatus]

### Return type

[**TelnyxDownstreamCampaignRecordSet**](TelnyxDownstreamCampaignRecordSet.md)

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


## updateSharedCampaign

> TelnyxDownstreamCampaign updateSharedCampaign(campaignId, updatePartnerCampaignRequest)

Update Single Shared Campaign

Update campaign details by `campaignId`. **Please note:** Only webhook urls are editable.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SharedCampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SharedCampaignsApi apiInstance = new SharedCampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | 
        UpdatePartnerCampaignRequest updatePartnerCampaignRequest = new UpdatePartnerCampaignRequest(); // UpdatePartnerCampaignRequest | 
        try {
            TelnyxDownstreamCampaign result = apiInstance.updateSharedCampaign(campaignId, updatePartnerCampaignRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SharedCampaignsApi#updateSharedCampaign");
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
 **campaignId** | **String**|  |
 **updatePartnerCampaignRequest** | [**UpdatePartnerCampaignRequest**](UpdatePartnerCampaignRequest.md)|  |

### Return type

[**TelnyxDownstreamCampaign**](TelnyxDownstreamCampaign.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


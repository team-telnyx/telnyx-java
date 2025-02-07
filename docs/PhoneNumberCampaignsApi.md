# PhoneNumberCampaignsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPhoneNumberCampaign**](PhoneNumberCampaignsApi.md#createPhoneNumberCampaign) | **POST** /phone_number_campaigns | Create New Phone Number Campaign
[**deletePhoneNumberCampaign**](PhoneNumberCampaignsApi.md#deletePhoneNumberCampaign) | **DELETE** /phone_number_campaigns/{phoneNumber} | Delete Phone Number Campaign
[**getAllPhoneNumberCampaigns**](PhoneNumberCampaignsApi.md#getAllPhoneNumberCampaigns) | **GET** /phone_number_campaigns | Retrieve All Phone Number Campaigns
[**getSinglePhoneNumberCampaign**](PhoneNumberCampaignsApi.md#getSinglePhoneNumberCampaign) | **GET** /phone_number_campaigns/{phoneNumber} | Get Single Phone Number Campaign
[**putPhoneNumberCampaign**](PhoneNumberCampaignsApi.md#putPhoneNumberCampaign) | **PUT** /phone_number_campaigns/{phoneNumber} | Create New Phone Number Campaign



## createPhoneNumberCampaign

> PhoneNumberCampaign createPhoneNumberCampaign(phoneNumberCampaignCreate)

Create New Phone Number Campaign

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberCampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberCampaignsApi apiInstance = new PhoneNumberCampaignsApi(defaultClient);
        PhoneNumberCampaignCreate phoneNumberCampaignCreate = new PhoneNumberCampaignCreate(); // PhoneNumberCampaignCreate | 
        try {
            PhoneNumberCampaign result = apiInstance.createPhoneNumberCampaign(phoneNumberCampaignCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberCampaignsApi#createPhoneNumberCampaign");
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
 **phoneNumberCampaignCreate** | [**PhoneNumberCampaignCreate**](PhoneNumberCampaignCreate.md)|  |

### Return type

[**PhoneNumberCampaign**](PhoneNumberCampaign.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## deletePhoneNumberCampaign

> PhoneNumberCampaign deletePhoneNumberCampaign(phoneNumber)

Delete Phone Number Campaign

This endpoint allows you to remove a campaign assignment from the supplied `phoneNumber`.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberCampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberCampaignsApi apiInstance = new PhoneNumberCampaignsApi(defaultClient);
        String phoneNumber = "phoneNumber_example"; // String | 
        try {
            PhoneNumberCampaign result = apiInstance.deletePhoneNumberCampaign(phoneNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberCampaignsApi#deletePhoneNumberCampaign");
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
 **phoneNumber** | **String**|  |

### Return type

[**PhoneNumberCampaign**](PhoneNumberCampaign.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## getAllPhoneNumberCampaigns

> PhoneNumberCampaignPaginated getAllPhoneNumberCampaigns(recordsPerPage, page, filterTelnyxCampaignId, filterTelnyxBrandId, filterTcrCampaignId, filterTcrBrandId, sort)

Retrieve All Phone Number Campaigns

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberCampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberCampaignsApi apiInstance = new PhoneNumberCampaignsApi(defaultClient);
        Object recordsPerPage = 20; // Object | 
        Object page = 1; // Object | 
        UUID filterTelnyxCampaignId = UUID.fromString("f3575e15-32ce-400e-a4c0-dd78800c20b0"); // UUID | Filter results by the Telnyx Campaign id
        UUID filterTelnyxBrandId = UUID.fromString("f3575e15-32ce-400e-a4c0-dd78800c20b0"); // UUID | Filter results by the Telnyx Brand id
        String filterTcrCampaignId = "CAMPID3"; // String | Filter results by the TCR Campaign id
        String filterTcrBrandId = "BRANDID"; // String | Filter results by the TCR Brand id
        String sort = "assignmentStatus"; // String | Specifies the sort order for results. If not given, results are sorted by createdAt in descending order.
        try {
            PhoneNumberCampaignPaginated result = apiInstance.getAllPhoneNumberCampaigns(recordsPerPage, page, filterTelnyxCampaignId, filterTelnyxBrandId, filterTcrCampaignId, filterTcrBrandId, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberCampaignsApi#getAllPhoneNumberCampaigns");
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
 **recordsPerPage** | **Object**|  | [optional] [default to 20]
 **page** | **Object**|  | [optional] [default to 1]
 **filterTelnyxCampaignId** | **UUID**| Filter results by the Telnyx Campaign id | [optional]
 **filterTelnyxBrandId** | **UUID**| Filter results by the Telnyx Brand id | [optional]
 **filterTcrCampaignId** | **String**| Filter results by the TCR Campaign id | [optional]
 **filterTcrBrandId** | **String**| Filter results by the TCR Brand id | [optional]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by createdAt in descending order. | [optional] [default to -createdAt] [enum: assignmentStatus, -assignmentStatus, createdAt, -createdAt, phoneNumber, -phoneNumber]

### Return type

[**PhoneNumberCampaignPaginated**](PhoneNumberCampaignPaginated.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## getSinglePhoneNumberCampaign

> PhoneNumberCampaign getSinglePhoneNumberCampaign(phoneNumber)

Get Single Phone Number Campaign

Retrieve an individual phone number/campaign assignment by `phoneNumber`.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberCampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberCampaignsApi apiInstance = new PhoneNumberCampaignsApi(defaultClient);
        String phoneNumber = "phoneNumber_example"; // String | 
        try {
            PhoneNumberCampaign result = apiInstance.getSinglePhoneNumberCampaign(phoneNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberCampaignsApi#getSinglePhoneNumberCampaign");
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
 **phoneNumber** | **String**|  |

### Return type

[**PhoneNumberCampaign**](PhoneNumberCampaign.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## putPhoneNumberCampaign

> PhoneNumberCampaign putPhoneNumberCampaign(phoneNumber, phoneNumberCampaignCreate)

Create New Phone Number Campaign

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberCampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberCampaignsApi apiInstance = new PhoneNumberCampaignsApi(defaultClient);
        String phoneNumber = "phoneNumber_example"; // String | 
        PhoneNumberCampaignCreate phoneNumberCampaignCreate = new PhoneNumberCampaignCreate(); // PhoneNumberCampaignCreate | 
        try {
            PhoneNumberCampaign result = apiInstance.putPhoneNumberCampaign(phoneNumber, phoneNumberCampaignCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberCampaignsApi#putPhoneNumberCampaign");
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
 **phoneNumber** | **String**|  |
 **phoneNumberCampaignCreate** | [**PhoneNumberCampaignCreate**](PhoneNumberCampaignCreate.md)|  |

### Return type

[**PhoneNumberCampaign**](PhoneNumberCampaign.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


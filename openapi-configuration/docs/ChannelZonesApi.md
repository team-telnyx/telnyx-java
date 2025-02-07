# ChannelZonesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignPhoneNumber**](ChannelZonesApi.md#assignPhoneNumber) | **POST** /channel_zones/{channel_zone_id}/channel_zone_phone_numbers | Assign a phone number to a channel zone
[**getChannelZone**](ChannelZonesApi.md#getChannelZone) | **GET** /channel_zones/{channel_zone_id} | Get a specific channel zone
[**getChannelZones**](ChannelZonesApi.md#getChannelZones) | **GET** /channel_zones | Get list of channel zones
[**getPhoneNumbers**](ChannelZonesApi.md#getPhoneNumbers) | **GET** /channel_zones/{channel_zone_id}/channel_zone_phone_numbers | Get the list of phone numbers assigned to a channel zone
[**patchChannelZone**](ChannelZonesApi.md#patchChannelZone) | **PATCH** /channel_zones/{channel_zone_id} | Patch a channel zone
[**unassignPhoneNumber**](ChannelZonesApi.md#unassignPhoneNumber) | **DELETE** /channel_zones/{channel_zone_id}/channel_zone_phone_numbers/{phone_number} | Unassign a phone number from a channel zone



## assignPhoneNumber

> GcbPhoneNumber assignPhoneNumber(channelZoneId, body)

Assign a phone number to a channel zone

You should own the phone number being assigned to the channel zone. Remember that you should reserve channels in this channel zone, otherwise you won't be able to receive incoming calls.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ChannelZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ChannelZonesApi apiInstance = new ChannelZonesApi(defaultClient);
        String channelZoneId = "channelZoneId_example"; // String | Channel zone identifier
        AssignPhoneNumberRequest body = new AssignPhoneNumberRequest(); // AssignPhoneNumberRequest | Phone number to assign to the channel zone. The phone number should be in E.164 format.
        try {
            GcbPhoneNumber result = apiInstance.assignPhoneNumber(channelZoneId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelZonesApi#assignPhoneNumber");
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
 **channelZoneId** | **String**| Channel zone identifier |
 **body** | [**AssignPhoneNumberRequest**](AssignPhoneNumberRequest.md)| Phone number to assign to the channel zone. The phone number should be in E.164 format. |

### Return type

[**GcbPhoneNumber**](GcbPhoneNumber.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A new inserted phone number |  -  |
| **0** | Unexpected error |  -  |


## getChannelZone

> GcbChannelZone getChannelZone(channelZoneId)

Get a specific channel zone

Get a specific channel zone

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ChannelZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ChannelZonesApi apiInstance = new ChannelZonesApi(defaultClient);
        String channelZoneId = "channelZoneId_example"; // String | Channel zone identifier
        try {
            GcbChannelZone result = apiInstance.getChannelZone(channelZoneId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelZonesApi#getChannelZone");
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
 **channelZoneId** | **String**| Channel zone identifier |

### Return type

[**GcbChannelZone**](GcbChannelZone.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested channel zone |  -  |
| **0** | Unexpected error |  -  |


## getChannelZones

> GetChannelZones200Response getChannelZones(pageNumber, pageSize)

Get list of channel zones

List of channel zones with their countries

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ChannelZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ChannelZonesApi apiInstance = new ChannelZonesApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            GetChannelZones200Response result = apiInstance.getChannelZones(pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelZonesApi#getChannelZones");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**GetChannelZones200Response**](GetChannelZones200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of channel zones |  -  |


## getPhoneNumbers

> GetPhoneNumbers200Response getPhoneNumbers(channelZoneId, pageNumber, pageSize)

Get the list of phone numbers assigned to a channel zone

Retrieve the assigned phone numbers in a channel zone. Phone numbers assigned to a channel zone can receive concurrent calls up to the quantity reserved in that channel zone. Additional concurrent calls are rejected with a busy signal.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ChannelZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ChannelZonesApi apiInstance = new ChannelZonesApi(defaultClient);
        String channelZoneId = "channelZoneId_example"; // String | Channel zone identifier
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            GetPhoneNumbers200Response result = apiInstance.getPhoneNumbers(channelZoneId, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelZonesApi#getPhoneNumbers");
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
 **channelZoneId** | **String**| Channel zone identifier |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**GetPhoneNumbers200Response**](GetPhoneNumbers200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of phone numbers |  -  |


## patchChannelZone

> GcbChannelZone patchChannelZone(channelZoneId, body)

Patch a channel zone

Change the amount of reserved channels at a given channel zone

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ChannelZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ChannelZonesApi apiInstance = new ChannelZonesApi(defaultClient);
        String channelZoneId = "channelZoneId_example"; // String | Channel zone identifier
        PatchChannelZoneRequest body = new PatchChannelZoneRequest(); // PatchChannelZoneRequest | Quantity of reserved channels
        try {
            GcbChannelZone result = apiInstance.patchChannelZone(channelZoneId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelZonesApi#patchChannelZone");
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
 **channelZoneId** | **String**| Channel zone identifier |
 **body** | [**PatchChannelZoneRequest**](PatchChannelZoneRequest.md)| Quantity of reserved channels |

### Return type

[**GcbChannelZone**](GcbChannelZone.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfuly patched channel zone |  -  |
| **0** | Unexpected error |  -  |


## unassignPhoneNumber

> unassignPhoneNumber(channelZoneId, phoneNumber)

Unassign a phone number from a channel zone

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ChannelZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ChannelZonesApi apiInstance = new ChannelZonesApi(defaultClient);
        String channelZoneId = "channelZoneId_example"; // String | Channel zone identifier
        String phoneNumber = "+15554441234"; // String | The phone number to be looked up
        try {
            apiInstance.unassignPhoneNumber(channelZoneId, phoneNumber);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelZonesApi#unassignPhoneNumber");
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
 **channelZoneId** | **String**| Channel zone identifier |
 **phoneNumber** | **String**| The phone number to be looked up |

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
| **200** | The phone number is successfully deleted |  -  |
| **0** | Unexpected error |  -  |


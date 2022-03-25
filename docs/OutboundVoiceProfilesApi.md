# OutboundVoiceProfilesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOutboundVoiceProfile**](OutboundVoiceProfilesApi.md#createOutboundVoiceProfile) | **POST** /outbound_voice_profiles | Create an outbound voice profile
[**deleteOutboundVoiceProfile**](OutboundVoiceProfilesApi.md#deleteOutboundVoiceProfile) | **DELETE** /outbound_voice_profiles/{id} | Delete an outbound voice profile
[**listOutboundVoiceProfiles**](OutboundVoiceProfilesApi.md#listOutboundVoiceProfiles) | **GET** /outbound_voice_profiles | Get all outbound voice profiles
[**retrieveOutboundVoiceProfile**](OutboundVoiceProfilesApi.md#retrieveOutboundVoiceProfile) | **GET** /outbound_voice_profiles/{id} | Retrieve an outbound voice profile
[**updateOutboundVoiceProfile**](OutboundVoiceProfilesApi.md#updateOutboundVoiceProfile) | **PATCH** /outbound_voice_profiles/{id} | Updates an existing outbound voice profile.



## createOutboundVoiceProfile

> OutboundVoiceProfileResponse createOutboundVoiceProfile(createOutboundVoiceProfileRequest)

Create an outbound voice profile

Create an outbound voice profile.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.OutboundVoiceProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OutboundVoiceProfilesApi apiInstance = new OutboundVoiceProfilesApi(defaultClient);
        CreateOutboundVoiceProfileRequest createOutboundVoiceProfileRequest = new CreateOutboundVoiceProfileRequest(); // CreateOutboundVoiceProfileRequest | Parameters that can be defined when creating an outbound voice profile
        try {
            OutboundVoiceProfileResponse result = apiInstance.createOutboundVoiceProfile(createOutboundVoiceProfileRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OutboundVoiceProfilesApi#createOutboundVoiceProfile");
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
 **createOutboundVoiceProfileRequest** | [**CreateOutboundVoiceProfileRequest**](CreateOutboundVoiceProfileRequest.md)| Parameters that can be defined when creating an outbound voice profile |

### Return type

[**OutboundVoiceProfileResponse**](OutboundVoiceProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## deleteOutboundVoiceProfile

> OutboundVoiceProfileResponse deleteOutboundVoiceProfile(id)

Delete an outbound voice profile

Deletes an existing outbound voice profile.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.OutboundVoiceProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OutboundVoiceProfilesApi apiInstance = new OutboundVoiceProfilesApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        try {
            OutboundVoiceProfileResponse result = apiInstance.deleteOutboundVoiceProfile(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OutboundVoiceProfilesApi#deleteOutboundVoiceProfile");
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
 **id** | **String**| Identifies the resource. |

### Return type

[**OutboundVoiceProfileResponse**](OutboundVoiceProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## listOutboundVoiceProfiles

> ListOutboundVoiceProfilesResponse listOutboundVoiceProfiles().pageNumber(pageNumber).pageSize(pageSize).filterNameContains(filterNameContains).sort(sort).execute();

Get all outbound voice profiles

Get all outbound voice profiles belonging to the user that match the given filters.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.OutboundVoiceProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OutboundVoiceProfilesApi apiInstance = new OutboundVoiceProfilesApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterNameContains = "office-profile"; // String | Optional filter on outbound voice profile name.
        String sort = "enabled"; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code>-</code> prefix.<br/><br/> That is: <ul>   <li>     <code>name</code>: sorts the result by the     <code>name</code> field in ascending order.   </li>    <li>     <code>-name</code>: sorts the result by the     <code>name</code> field in descending order.   </li> </ul> <br/>
        try {
            ListOutboundVoiceProfilesResponse result = api.listOutboundVoiceProfiles()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterNameContains(filterNameContains)
                .sort(sort)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OutboundVoiceProfilesApi#listOutboundVoiceProfiles");
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
 **filterNameContains** | **String**| Optional filter on outbound voice profile name. | [optional]
 **sort** | **String**| Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt;-&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;name&lt;/code&gt;: sorts the result by the     &lt;code&gt;name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-name&lt;/code&gt;: sorts the result by the     &lt;code&gt;name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; | [optional] [default to -created_at] [enum: enabled, -enabled, created_at, -created_at, name, -name, service_plan, -service_plan, traffic_type, -traffic_type, usage_payment_method, -usage_payment_method]

### Return type

[**ListOutboundVoiceProfilesResponse**](ListOutboundVoiceProfilesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **422** | Bad request |  -  |


## retrieveOutboundVoiceProfile

> OutboundVoiceProfileResponse retrieveOutboundVoiceProfile(id)

Retrieve an outbound voice profile

Retrieves the details of an existing outbound voice profile.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.OutboundVoiceProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OutboundVoiceProfilesApi apiInstance = new OutboundVoiceProfilesApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        try {
            OutboundVoiceProfileResponse result = apiInstance.retrieveOutboundVoiceProfile(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OutboundVoiceProfilesApi#retrieveOutboundVoiceProfile");
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
 **id** | **String**| Identifies the resource. |

### Return type

[**OutboundVoiceProfileResponse**](OutboundVoiceProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## updateOutboundVoiceProfile

> OutboundVoiceProfileResponse updateOutboundVoiceProfile(id, updateOutboundVoiceProfileRequest)

Updates an existing outbound voice profile.

Updates an existing outbound voice profile.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.OutboundVoiceProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OutboundVoiceProfilesApi apiInstance = new OutboundVoiceProfilesApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        UpdateOutboundVoiceProfileRequest updateOutboundVoiceProfileRequest = new UpdateOutboundVoiceProfileRequest(); // UpdateOutboundVoiceProfileRequest | Parameters that can be updated on an outbound voice profile
        try {
            OutboundVoiceProfileResponse result = apiInstance.updateOutboundVoiceProfile(id, updateOutboundVoiceProfileRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OutboundVoiceProfilesApi#updateOutboundVoiceProfile");
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
 **id** | **String**| Identifies the resource. |
 **updateOutboundVoiceProfileRequest** | [**UpdateOutboundVoiceProfileRequest**](UpdateOutboundVoiceProfileRequest.md)| Parameters that can be updated on an outbound voice profile |

### Return type

[**OutboundVoiceProfileResponse**](OutboundVoiceProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


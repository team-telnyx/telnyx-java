# VerifiedCallsDisplayProfileApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVerifiedCallsDisplayProfile**](VerifiedCallsDisplayProfileApi.md#createVerifiedCallsDisplayProfile) | **POST** /verified_calls_display_profiles | Creates a Verified Calls Display Profile
[**createVerifiedCallsDisplayProfileVerificationRequest**](VerifiedCallsDisplayProfileApi.md#createVerifiedCallsDisplayProfileVerificationRequest) | **POST** /verified_calls_display_profiles/{id}/verification_request | Creates a Verification Request
[**deleteVerifiedCallsDisplayProfile**](VerifiedCallsDisplayProfileApi.md#deleteVerifiedCallsDisplayProfile) | **DELETE** /verified_calls_display_profiles/{id} | Deletes the Verified Calls Display Profile
[**displayVerifiedCallsDisplayProfile**](VerifiedCallsDisplayProfileApi.md#displayVerifiedCallsDisplayProfile) | **GET** /verified_calls_display_profiles/{id} | Display the Verified Calls Display Profile
[**listVerifiedCallsDisplayProfiles**](VerifiedCallsDisplayProfileApi.md#listVerifiedCallsDisplayProfiles) | **GET** /verified_calls_display_profiles | Lists the Verified Calls Display Profiles owned by the current user/organization
[**updateVerifiedCallsDisplayProfile**](VerifiedCallsDisplayProfileApi.md#updateVerifiedCallsDisplayProfile) | **PATCH** /verified_calls_display_profiles/{id} | Update a Verified Calls Display Profile



## createVerifiedCallsDisplayProfile

> ShowVerifiedCallsDisplayProfileResponse createVerifiedCallsDisplayProfile().createVerifiedCallsDisplayProfileRequest(createVerifiedCallsDisplayProfileRequest).execute();

Creates a Verified Calls Display Profile

Creates a Verified Calls Display Profile associated with the given Business Identity

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifiedCallsDisplayProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifiedCallsDisplayProfileApi apiInstance = new VerifiedCallsDisplayProfileApi(defaultClient);
        CreateVerifiedCallsDisplayProfileRequest createVerifiedCallsDisplayProfileRequest = new CreateVerifiedCallsDisplayProfileRequest(); // CreateVerifiedCallsDisplayProfileRequest | 
        try {
            ShowVerifiedCallsDisplayProfileResponse result = api.createVerifiedCallsDisplayProfile()
                .createVerifiedCallsDisplayProfileRequest(createVerifiedCallsDisplayProfileRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifiedCallsDisplayProfileApi#createVerifiedCallsDisplayProfile");
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
 **createVerifiedCallsDisplayProfileRequest** | [**CreateVerifiedCallsDisplayProfileRequest**](CreateVerifiedCallsDisplayProfileRequest.md)|  |

### Return type

[**ShowVerifiedCallsDisplayProfileResponse**](ShowVerifiedCallsDisplayProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response with a Verified Calls Display Profile. |  -  |
| **0** | Unexpected error |  -  |


## createVerifiedCallsDisplayProfileVerificationRequest

> createVerifiedCallsDisplayProfileVerificationRequest(id)

Creates a Verification Request

Starts a new Verified Calls Display Profile verification process.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifiedCallsDisplayProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifiedCallsDisplayProfileApi apiInstance = new VerifiedCallsDisplayProfileApi(defaultClient);
        String id = "id_example"; // String | Identifies the Verified Calls Display Profile
        try {
            apiInstance.createVerifiedCallsDisplayProfileVerificationRequest(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifiedCallsDisplayProfileApi#createVerifiedCallsDisplayProfileVerificationRequest");
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
 **id** | **String**| Identifies the Verified Calls Display Profile |

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
| **201** | The Verification Request was issued. |  -  |
| **0** | Unexpected error |  -  |


## deleteVerifiedCallsDisplayProfile

> ShowVerifiedCallsDisplayProfileResponse deleteVerifiedCallsDisplayProfile(id).execute();

Deletes the Verified Calls Display Profile

Deletes the Verified Calls Display Profile. This action will fail if any verification requests have been made for this Verified Calls Display Profile. Please contact support@telnyx.com in case you want to delete a Verified Calls Display Profile in that situation.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifiedCallsDisplayProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifiedCallsDisplayProfileApi apiInstance = new VerifiedCallsDisplayProfileApi(defaultClient);
        String id = "id_example"; // String | Identifies the Verified Calls Display Profile
        try {
            ShowVerifiedCallsDisplayProfileResponse result = api.deleteVerifiedCallsDisplayProfile(id)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifiedCallsDisplayProfileApi#deleteVerifiedCallsDisplayProfile");
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
 **id** | **String**| Identifies the Verified Calls Display Profile |

### Return type

[**ShowVerifiedCallsDisplayProfileResponse**](ShowVerifiedCallsDisplayProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a Verified Calls Display Profile. |  -  |
| **0** | Unexpected error |  -  |


## displayVerifiedCallsDisplayProfile

> ShowVerifiedCallsDisplayProfileResponse displayVerifiedCallsDisplayProfile(id).execute();

Display the Verified Calls Display Profile

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifiedCallsDisplayProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifiedCallsDisplayProfileApi apiInstance = new VerifiedCallsDisplayProfileApi(defaultClient);
        String id = "id_example"; // String | Identifies the Verified Calls Display Profile
        try {
            ShowVerifiedCallsDisplayProfileResponse result = api.displayVerifiedCallsDisplayProfile(id)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifiedCallsDisplayProfileApi#displayVerifiedCallsDisplayProfile");
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
 **id** | **String**| Identifies the Verified Calls Display Profile |

### Return type

[**ShowVerifiedCallsDisplayProfileResponse**](ShowVerifiedCallsDisplayProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a Verified Calls Display Profile. |  -  |
| **0** | Unexpected error |  -  |


## listVerifiedCallsDisplayProfiles

> ListVerifiedCallsDisplayProfilesResponse listVerifiedCallsDisplayProfiles().pageNumber(pageNumber).pageSize(pageSize).execute();

Lists the Verified Calls Display Profiles owned by the current user/organization

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifiedCallsDisplayProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifiedCallsDisplayProfileApi apiInstance = new VerifiedCallsDisplayProfileApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListVerifiedCallsDisplayProfilesResponse result = api.listVerifiedCallsDisplayProfiles()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifiedCallsDisplayProfileApi#listVerifiedCallsDisplayProfiles");
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

[**ListVerifiedCallsDisplayProfilesResponse**](ListVerifiedCallsDisplayProfilesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of Verified Calls Display Profiles. |  -  |
| **0** | Unexpected error |  -  |


## updateVerifiedCallsDisplayProfile

> updateVerifiedCallsDisplayProfile(id).updateVerifiedCallsDisplayProfileRequest(updateVerifiedCallsDisplayProfileRequest).execute();

Update a Verified Calls Display Profile

Update an existing Verified Calls Display Profile and allows adding/removing nested Call Reasons and Phone Numbers. Different attributes can be updated depending on the Verified Calls Display Profile's status: For the VERIFICATION_STATE_PENDING status, no fields can be updated. For the VERIFICATION_STATE_VERIFIED status, it is allowed only to add/remove Call Reaons and Phone Numbers. For the other statuses, all fields can be updated. All existing Call Reasons and Phone Numbers must be sent during the request, or the update will fail.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VerifiedCallsDisplayProfileApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VerifiedCallsDisplayProfileApi apiInstance = new VerifiedCallsDisplayProfileApi(defaultClient);
        String id = "id_example"; // String | Identifies the Verified Calls Display Profile
        UpdateVerifiedCallsDisplayProfileRequest updateVerifiedCallsDisplayProfileRequest = new UpdateVerifiedCallsDisplayProfileRequest(); // UpdateVerifiedCallsDisplayProfileRequest | 
        try {
            api.updateVerifiedCallsDisplayProfile(id)
                .updateVerifiedCallsDisplayProfileRequest(updateVerifiedCallsDisplayProfileRequest)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifiedCallsDisplayProfileApi#updateVerifiedCallsDisplayProfile");
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
 **id** | **String**| Identifies the Verified Calls Display Profile |
 **updateVerifiedCallsDisplayProfileRequest** | [**UpdateVerifiedCallsDisplayProfileRequest**](UpdateVerifiedCallsDisplayProfileRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Verified Calls Display Profile was updated. |  -  |
| **0** | Unexpected error |  -  |


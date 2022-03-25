# MobileApplicationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMobileApplication**](MobileApplicationsApi.md#addMobileApplication) | **POST** /mobile_applications | Adds a mobile application
[**addPushCredential**](MobileApplicationsApi.md#addPushCredential) | **POST** /mobile_applications/{mobile_application_id}/push_credentials | Adds push credential to a given mobile application
[**deleteMobileApplicationById**](MobileApplicationsApi.md#deleteMobileApplicationById) | **DELETE** /mobile_applications/{mobile_application_id} | Deletes a mobile application
[**getAllMobileApplications**](MobileApplicationsApi.md#getAllMobileApplications) | **GET** /mobile_applications | Retrieves mobile applications
[**getMobileApplicationById**](MobileApplicationsApi.md#getMobileApplicationById) | **GET** /mobile_applications/{mobile_application_id} | Retrieves a given mobile application
[**updateMobileApplicationById**](MobileApplicationsApi.md#updateMobileApplicationById) | **PATCH** /mobile_applications/{mobile_application_id} | Updates a mobile application



## addMobileApplication

> MobileApplicationResponse addMobileApplication(createMobileApplicationRequest)

Adds a mobile application

Creates a new mobile application which can be android or ios based on the `type` parameter

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MobileApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MobileApplicationsApi apiInstance = new MobileApplicationsApi(defaultClient);
        CreateMobileApplicationRequest createMobileApplicationRequest = new CreateMobileApplicationRequest(); // CreateMobileApplicationRequest | Mobile application parameters that need to be sent in the request
        try {
            MobileApplicationResponse result = apiInstance.addMobileApplication(createMobileApplicationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MobileApplicationsApi#addMobileApplication");
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
 **createMobileApplicationRequest** | [**CreateMobileApplicationRequest**](CreateMobileApplicationRequest.md)| Mobile application parameters that need to be sent in the request |

### Return type

[**MobileApplicationResponse**](MobileApplicationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mobile application created |  -  |
| **401** | Unauthorized request |  -  |
| **422** | Unable to process request |  -  |


## addPushCredential

> PushCredentialResponse addPushCredential(mobileApplicationId, UNKNOWN_BASE_TYPE)

Adds push credential to a given mobile application

Creates a new credential for a given mobile application

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MobileApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MobileApplicationsApi apiInstance = new MobileApplicationsApi(defaultClient);
        UUID mobileApplicationId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a mobile application
        UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE = new UNKNOWN_BASE_TYPE(); // UNKNOWN_BASE_TYPE | Push credential parameters that need to be sent in the request
        try {
            PushCredentialResponse result = apiInstance.addPushCredential(mobileApplicationId, UNKNOWN_BASE_TYPE);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MobileApplicationsApi#addPushCredential");
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
 **mobileApplicationId** | **UUID**| The unique identifier of a mobile application |
 **UNKNOWN_BASE_TYPE** | **UNKNOWN_BASE_TYPE**| Push credential parameters that need to be sent in the request |

### Return type

[**PushCredentialResponse**](PushCredentialResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Push credential created |  -  |
| **401** | Unauthorized request |  -  |
| **422** | Unable to process request |  -  |


## deleteMobileApplicationById

> deleteMobileApplicationById(mobileApplicationId)

Deletes a mobile application

Deletes a mobile application based on the given `id`

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MobileApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MobileApplicationsApi apiInstance = new MobileApplicationsApi(defaultClient);
        UUID mobileApplicationId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a mobile application
        try {
            apiInstance.deleteMobileApplicationById(mobileApplicationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling MobileApplicationsApi#deleteMobileApplicationById");
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
 **mobileApplicationId** | **UUID**| The unique identifier of a mobile application |

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
| **204** | The mobile application was deleted successfully |  -  |
| **401** | Unauthorized request |  -  |
| **404** | Resource not found |  -  |
| **422** | Unable to process request |  -  |


## getAllMobileApplications

> List&lt;MobileApplicationResponse&gt; getAllMobileApplications()

Retrieves mobile applications

Retrieves all mobile applications for a user

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MobileApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MobileApplicationsApi apiInstance = new MobileApplicationsApi(defaultClient);
        try {
            List<MobileApplicationResponse> result = apiInstance.getAllMobileApplications();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MobileApplicationsApi#getAllMobileApplications");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;MobileApplicationResponse&gt;**](MobileApplicationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mobile application created |  -  |
| **401** | Unauthorized request |  -  |
| **404** | Resource not found |  -  |
| **422** | Unable to process request |  -  |


## getMobileApplicationById

> MobileApplicationResponse getMobileApplicationById(mobileApplicationId)

Retrieves a given mobile application

Retrieves a mobile application based on the given `id`

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MobileApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MobileApplicationsApi apiInstance = new MobileApplicationsApi(defaultClient);
        UUID mobileApplicationId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a mobile application
        try {
            MobileApplicationResponse result = apiInstance.getMobileApplicationById(mobileApplicationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MobileApplicationsApi#getMobileApplicationById");
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
 **mobileApplicationId** | **UUID**| The unique identifier of a mobile application |

### Return type

[**MobileApplicationResponse**](MobileApplicationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful get mobile application response |  -  |
| **401** | Unauthorized request |  -  |
| **404** | Resource not found |  -  |
| **422** | Unable to process request |  -  |


## updateMobileApplicationById

> MobileApplicationResponse updateMobileApplicationById(mobileApplicationId, createMobileApplicationRequest)

Updates a mobile application

Updates a mobile application based on the given `id`

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MobileApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MobileApplicationsApi apiInstance = new MobileApplicationsApi(defaultClient);
        UUID mobileApplicationId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a mobile application
        CreateMobileApplicationRequest createMobileApplicationRequest = new CreateMobileApplicationRequest(); // CreateMobileApplicationRequest | Mobile application parameters that need to be sent in the request
        try {
            MobileApplicationResponse result = apiInstance.updateMobileApplicationById(mobileApplicationId, createMobileApplicationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MobileApplicationsApi#updateMobileApplicationById");
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
 **mobileApplicationId** | **UUID**| The unique identifier of a mobile application |
 **createMobileApplicationRequest** | [**CreateMobileApplicationRequest**](CreateMobileApplicationRequest.md)| Mobile application parameters that need to be sent in the request |

### Return type

[**MobileApplicationResponse**](MobileApplicationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The modile application was updated successfully |  -  |
| **401** | Unauthorized request |  -  |
| **404** | Resource not found |  -  |
| **422** | Unable to process request |  -  |


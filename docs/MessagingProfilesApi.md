# MessagingProfilesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMessagingProfile**](MessagingProfilesApi.md#createMessagingProfile) | **POST** /messaging_profiles | Create a messaging profile
[**deleteMessagingProfile**](MessagingProfilesApi.md#deleteMessagingProfile) | **DELETE** /messaging_profiles/{id} | Delete a messaging profile
[**getMessagingProfileMetrics**](MessagingProfilesApi.md#getMessagingProfileMetrics) | **GET** /messaging_profiles/{id}/metrics | Retrieve messaging profile metrics
[**listMessagingProfiles**](MessagingProfilesApi.md#listMessagingProfiles) | **GET** /messaging_profiles | List messaging profiles
[**listProfileMetrics**](MessagingProfilesApi.md#listProfileMetrics) | **GET** /messaging_profile_metrics | List messaging profile metrics
[**listProfilePhoneNumbers**](MessagingProfilesApi.md#listProfilePhoneNumbers) | **GET** /messaging_profiles/{id}/phone_numbers | List phone numbers associated with a messaging profile
[**listProfileShortCodes**](MessagingProfilesApi.md#listProfileShortCodes) | **GET** /messaging_profiles/{id}/short_codes | List short codes associated with a messaging profile
[**retrieveMessagingProfile**](MessagingProfilesApi.md#retrieveMessagingProfile) | **GET** /messaging_profiles/{id} | Retrieve a messaging profile
[**updateMessagingProfile**](MessagingProfilesApi.md#updateMessagingProfile) | **PATCH** /messaging_profiles/{id} | Update a messaging profile



## createMessagingProfile

> MessagingProfileResponse createMessagingProfile(createMessagingProfileRequest)

Create a messaging profile

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        CreateMessagingProfileRequest createMessagingProfileRequest = new CreateMessagingProfileRequest(); // CreateMessagingProfileRequest | New Messaging Profile object
        try {
            MessagingProfileResponse result = apiInstance.createMessagingProfile(createMessagingProfileRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#createMessagingProfile");
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
 **createMessagingProfileRequest** | [**CreateMessagingProfileRequest**](CreateMessagingProfileRequest.md)| New Messaging Profile object |

### Return type

[**MessagingProfileResponse**](MessagingProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging profile. |  -  |
| **0** | Unexpected error |  -  |


## deleteMessagingProfile

> MessagingProfileResponse deleteMessagingProfile(id)

Delete a messaging profile

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The id of the messaging profile to retrieve
        try {
            MessagingProfileResponse result = apiInstance.deleteMessagingProfile(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#deleteMessagingProfile");
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
 **id** | **UUID**| The id of the messaging profile to retrieve |

### Return type

[**MessagingProfileResponse**](MessagingProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging profile. |  -  |
| **0** | Unexpected error |  -  |


## getMessagingProfileMetrics

> RetrieveMessagingProfileMetricsResponse getMessagingProfileMetrics(id).timeFrame(timeFrame).execute();

Retrieve messaging profile metrics

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The id of the messaging profile to retrieve
        String timeFrame = "1h"; // String | The timeframe for which you'd like to retrieve metrics.
        try {
            RetrieveMessagingProfileMetricsResponse result = api.getMessagingProfileMetrics(id)
                .timeFrame(timeFrame)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#getMessagingProfileMetrics");
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
 **id** | **UUID**| The id of the messaging profile to retrieve |
 **timeFrame** | **String**| The timeframe for which you&#39;d like to retrieve metrics. | [optional] [default to 24h] [enum: 1h, 3h, 24h, 3d, 7d, 30d]

### Return type

[**RetrieveMessagingProfileMetricsResponse**](RetrieveMessagingProfileMetricsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging profile&#39;s metrics. |  -  |
| **0** | Unexpected error |  -  |


## listMessagingProfiles

> ListMessagingProfilesResponse listMessagingProfiles().pageNumber(pageNumber).pageSize(pageSize).filterName(filterName).execute();

List messaging profiles

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterName = "filterName_example"; // String | Filter by name
        try {
            ListMessagingProfilesResponse result = api.listMessagingProfiles()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterName(filterName)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfiles");
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
 **filterName** | **String**| Filter by name | [optional]

### Return type

[**ListMessagingProfilesResponse**](ListMessagingProfilesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of messaging profiles. |  -  |
| **0** | Unexpected error |  -  |


## listProfileMetrics

> ListMessagingProfileMetricsResponse listProfileMetrics().pageNumber(pageNumber).pageSize(pageSize).id(id).timeFrame(timeFrame).execute();

List messaging profile metrics

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        UUID id = UUID.randomUUID(); // UUID | The id of the messaging profile(s) to retrieve
        String timeFrame = "1h"; // String | The timeframe for which you'd like to retrieve metrics.
        try {
            ListMessagingProfileMetricsResponse result = api.listProfileMetrics()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .id(id)
                .timeFrame(timeFrame)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#listProfileMetrics");
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
 **id** | **UUID**| The id of the messaging profile(s) to retrieve | [optional]
 **timeFrame** | **String**| The timeframe for which you&#39;d like to retrieve metrics. | [optional] [default to 24h] [enum: 1h, 3h, 24h, 3d, 7d, 30d]

### Return type

[**ListMessagingProfileMetricsResponse**](ListMessagingProfileMetricsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of messaging profile metrics. |  -  |
| **0** | Unexpected error |  -  |


## listProfilePhoneNumbers

> ListMessagingProfilePhoneNumbersResponse listProfilePhoneNumbers(id).pageNumber(pageNumber).pageSize(pageSize).execute();

List phone numbers associated with a messaging profile

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The id of the messaging profile to retrieve
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListMessagingProfilePhoneNumbersResponse result = api.listProfilePhoneNumbers(id)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#listProfilePhoneNumbers");
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
 **id** | **UUID**| The id of the messaging profile to retrieve |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListMessagingProfilePhoneNumbersResponse**](ListMessagingProfilePhoneNumbersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of messaging profile phone numbers. |  -  |
| **0** | Unexpected error |  -  |


## listProfileShortCodes

> ListMessagingProfileShortCodesResponse listProfileShortCodes(id).pageNumber(pageNumber).pageSize(pageSize).execute();

List short codes associated with a messaging profile

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The id of the messaging profile to retrieve
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListMessagingProfileShortCodesResponse result = api.listProfileShortCodes(id)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#listProfileShortCodes");
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
 **id** | **UUID**| The id of the messaging profile to retrieve |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListMessagingProfileShortCodesResponse**](ListMessagingProfileShortCodesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of messaging profile short codes. |  -  |
| **0** | Unexpected error |  -  |


## retrieveMessagingProfile

> MessagingProfileResponse retrieveMessagingProfile(id)

Retrieve a messaging profile

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The id of the messaging profile to retrieve
        try {
            MessagingProfileResponse result = apiInstance.retrieveMessagingProfile(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#retrieveMessagingProfile");
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
 **id** | **UUID**| The id of the messaging profile to retrieve |

### Return type

[**MessagingProfileResponse**](MessagingProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging profile. |  -  |
| **0** | Unexpected error |  -  |


## updateMessagingProfile

> MessagingProfileResponse updateMessagingProfile(id, updateMessagingProfileRequest)

Update a messaging profile

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingProfilesApi apiInstance = new MessagingProfilesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The id of the messaging profile to retrieve
        UpdateMessagingProfileRequest updateMessagingProfileRequest = new UpdateMessagingProfileRequest(); // UpdateMessagingProfileRequest | New Messaging Profile object
        try {
            MessagingProfileResponse result = apiInstance.updateMessagingProfile(id, updateMessagingProfileRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#updateMessagingProfile");
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
 **id** | **UUID**| The id of the messaging profile to retrieve |
 **updateMessagingProfileRequest** | [**UpdateMessagingProfileRequest**](UpdateMessagingProfileRequest.md)| New Messaging Profile object |

### Return type

[**MessagingProfileResponse**](MessagingProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging profile. |  -  |
| **0** | Unexpected error |  -  |


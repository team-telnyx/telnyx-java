# MessagingProfilesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMessagingProfile**](MessagingProfilesApi.md#createMessagingProfile) | **POST** /messaging_profiles | Create a messaging profile
[**deleteMessagingProfile**](MessagingProfilesApi.md#deleteMessagingProfile) | **DELETE** /messaging_profiles/{id} | Delete a messaging profile
[**listMessagingProfileMetrics**](MessagingProfilesApi.md#listMessagingProfileMetrics) | **GET** /messaging_profile_metrics | List messaging profile metrics
[**listMessagingProfilePhoneNumbers**](MessagingProfilesApi.md#listMessagingProfilePhoneNumbers) | **GET** /messaging_profiles/{id}/phone_numbers | List phone numbers associated with a messaging profile
[**listMessagingProfileShortCodes**](MessagingProfilesApi.md#listMessagingProfileShortCodes) | **GET** /messaging_profiles/{id}/short_codes | List short codes associated with a messaging profile
[**listMessagingProfiles**](MessagingProfilesApi.md#listMessagingProfiles) | **GET** /messaging_profiles | List messaging profiles
[**retrieveMessagingProfile**](MessagingProfilesApi.md#retrieveMessagingProfile) | **GET** /messaging_profiles/{id} | Retrieve a messaging profile
[**retrieveMessagingProfileDetailedMetrics**](MessagingProfilesApi.md#retrieveMessagingProfileDetailedMetrics) | **GET** /messaging_profiles/{id}/metrics | Retrieve messaging profile metrics
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
| **0** | Bad Request |  -  |


## deleteMessagingProfile

> MessagingProfileResponse deleteMessagingProfile(id)

Delete a messaging profile

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
        UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
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
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |

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
| **0** | Bad Request |  -  |


## listMessagingProfileMetrics

> ListMessagingProfileMetricsResponse listMessagingProfileMetrics().pageNumber(pageNumber).pageSize(pageSize).id(id).timeFrame(timeFrame).execute();

List messaging profile metrics

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
        Integer pageSize = 50; // Integer | The size of the page
        UUID id = new UUID(); // UUID | The id of the messaging profile(s) to retrieve
        String timeFrame = "24h"; // String | The timeframe for which you'd like to retrieve metrics.
        try {
            ListMessagingProfileMetricsResponse result = api.listMessagingProfileMetrics()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .id(id)
                .timeFrame(timeFrame)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfileMetrics");
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
 **pageSize** | **Integer**| The size of the page | [optional] [default to 50]
 **id** | [**UUID**](.md)| The id of the messaging profile(s) to retrieve | [optional]
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
| **0** | Bad Request |  -  |


## listMessagingProfilePhoneNumbers

> ListMessagingProfilePhoneNumbersResponse listMessagingProfilePhoneNumbers(id).pageNumber(pageNumber).pageSize(pageSize).execute();

List phone numbers associated with a messaging profile

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
        UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 50; // Integer | The size of the page
        try {
            ListMessagingProfilePhoneNumbersResponse result = api.listMessagingProfilePhoneNumbers(id)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfilePhoneNumbers");
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
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 50]

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
| **0** | Bad Request |  -  |


## listMessagingProfileShortCodes

> ListMessagingProfileShortCodesResponse listMessagingProfileShortCodes(id).pageNumber(pageNumber).pageSize(pageSize).execute();

List short codes associated with a messaging profile

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
        UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 50; // Integer | The size of the page
        try {
            ListMessagingProfileShortCodesResponse result = api.listMessagingProfileShortCodes(id)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfileShortCodes");
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
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 50]

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
| **0** | Bad Request |  -  |


## listMessagingProfiles

> ListMessagingProfilesResponse listMessagingProfiles().pageNumber(pageNumber).pageSize(pageSize).execute();

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
        Integer pageSize = 50; // Integer | The size of the page
        try {
            ListMessagingProfilesResponse result = api.listMessagingProfiles()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
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
 **pageSize** | **Integer**| The size of the page | [optional] [default to 50]

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
| **0** | Bad Request |  -  |


## retrieveMessagingProfile

> MessagingProfileResponse retrieveMessagingProfile(id)

Retrieve a messaging profile

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
        UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
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
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |

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
| **0** | Bad Request |  -  |


## retrieveMessagingProfileDetailedMetrics

> RetrieveMessagingProfileMetricsResponse retrieveMessagingProfileDetailedMetrics(id).timeFrame(timeFrame).execute();

Retrieve messaging profile metrics

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
        UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
        String timeFrame = "24h"; // String | The timeframe for which you'd like to retrieve metrics.
        try {
            RetrieveMessagingProfileMetricsResponse result = api.retrieveMessagingProfileDetailedMetrics(id)
                .timeFrame(timeFrame)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingProfilesApi#retrieveMessagingProfileDetailedMetrics");
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
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |
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
| **0** | Bad Request |  -  |


## updateMessagingProfile

> MessagingProfileResponse updateMessagingProfile(id, updateMessagingProfileRequest)

Update a messaging profile

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
        UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
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
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |
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
| **0** | Bad Request |  -  |


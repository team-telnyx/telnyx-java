# MessagingProfilesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMessagingProfile**](MessagingProfilesApi.md#createMessagingProfile) | **POST** /messaging_profiles | Create a messaging profile
[**deleteMessagingProfile**](MessagingProfilesApi.md#deleteMessagingProfile) | **DELETE** /messaging_profiles/{id} | Delete a messaging profile
[**getMessagingProfileDetailedMetrics**](MessagingProfilesApi.md#getMessagingProfileDetailedMetrics) | **GET** /messaging_profiles/{id}/metrics | Retrieve messaging profile metrics
[**listMessagingProfileMetrics**](MessagingProfilesApi.md#listMessagingProfileMetrics) | **GET** /messaging_profile_metrics | List messaging profile metrics
[**listMessagingProfilePhoneNumbers**](MessagingProfilesApi.md#listMessagingProfilePhoneNumbers) | **GET** /messaging_profiles/{id}/phone_numbers | List phone numbers associated with a messaging profile
[**listMessagingProfileShortCodes**](MessagingProfilesApi.md#listMessagingProfileShortCodes) | **GET** /messaging_profiles/{id}/short_codes | List short codes associated with a messaging profile
[**listMessagingProfiles**](MessagingProfilesApi.md#listMessagingProfiles) | **GET** /messaging_profiles | List messaging profiles
[**retrieveMessagingProfile**](MessagingProfilesApi.md#retrieveMessagingProfile) | **GET** /messaging_profiles/{id} | Retrieve a messaging profile
[**updateMessagingProfile**](MessagingProfilesApi.md#updateMessagingProfile) | **PATCH** /messaging_profiles/{id} | Update a messaging profile

<a name="createMessagingProfile"></a>
# **createMessagingProfile**
> MessagingProfileResponse createMessagingProfile(body)

Create a messaging profile

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagingProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingProfilesApi apiInstance = new MessagingProfilesApi();
CreateMessagingProfileRequest body = new CreateMessagingProfileRequest(); // CreateMessagingProfileRequest | New Messaging Profile object
try {
    MessagingProfileResponse result = apiInstance.createMessagingProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingProfilesApi#createMessagingProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateMessagingProfileRequest**](CreateMessagingProfileRequest.md)| New Messaging Profile object |

### Return type

[**MessagingProfileResponse**](MessagingProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMessagingProfile"></a>
# **deleteMessagingProfile**
> MessagingProfileResponse deleteMessagingProfile(id)

Delete a messaging profile

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagingProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingProfilesApi apiInstance = new MessagingProfilesApi();
UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
try {
    MessagingProfileResponse result = apiInstance.deleteMessagingProfile(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingProfilesApi#deleteMessagingProfile");
    e.printStackTrace();
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

<a name="getMessagingProfileDetailedMetrics"></a>
# **getMessagingProfileDetailedMetrics**
> RetrieveMessagingProfileMetricsResponse getMessagingProfileDetailedMetrics(id, timeFrame)

Retrieve messaging profile metrics

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagingProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingProfilesApi apiInstance = new MessagingProfilesApi();
UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
String timeFrame = "24h"; // String | The timeframe for which you'd like to retrieve metrics.
try {
    RetrieveMessagingProfileMetricsResponse result = apiInstance.getMessagingProfileDetailedMetrics(id, timeFrame);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingProfilesApi#getMessagingProfileDetailedMetrics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |
 **timeFrame** | **String**| The timeframe for which you&#x27;d like to retrieve metrics. | [optional] [default to 24h] [enum: 1h, 3h, 24h, 3d, 7d, 30d]

### Return type

[**RetrieveMessagingProfileMetricsResponse**](RetrieveMessagingProfileMetricsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMessagingProfileMetrics"></a>
# **listMessagingProfileMetrics**
> ListMessagingProfileMetricsResponse listMessagingProfileMetrics(pageNumber, pageSize, id, timeFrame)

List messaging profile metrics

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagingProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingProfilesApi apiInstance = new MessagingProfilesApi();
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
UUID id = new UUID(); // UUID | The id of the messaging profile(s) to retrieve
String timeFrame = "24h"; // String | The timeframe for which you'd like to retrieve metrics.
try {
    ListMessagingProfileMetricsResponse result = apiInstance.listMessagingProfileMetrics(pageNumber, pageSize, id, timeFrame);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfileMetrics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]
 **id** | [**UUID**](.md)| The id of the messaging profile(s) to retrieve | [optional]
 **timeFrame** | **String**| The timeframe for which you&#x27;d like to retrieve metrics. | [optional] [default to 24h] [enum: 1h, 3h, 24h, 3d, 7d, 30d]

### Return type

[**ListMessagingProfileMetricsResponse**](ListMessagingProfileMetricsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMessagingProfilePhoneNumbers"></a>
# **listMessagingProfilePhoneNumbers**
> ListMessagingProfilePhoneNumbersResponse listMessagingProfilePhoneNumbers(id, pageNumber, pageSize)

List phone numbers associated with a messaging profile

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagingProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingProfilesApi apiInstance = new MessagingProfilesApi();
UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
try {
    ListMessagingProfilePhoneNumbersResponse result = apiInstance.listMessagingProfilePhoneNumbers(id, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfilePhoneNumbers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]

### Return type

[**ListMessagingProfilePhoneNumbersResponse**](ListMessagingProfilePhoneNumbersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMessagingProfileShortCodes"></a>
# **listMessagingProfileShortCodes**
> ListMessagingProfileShortCodesResponse listMessagingProfileShortCodes(id, pageNumber, pageSize)

List short codes associated with a messaging profile

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagingProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingProfilesApi apiInstance = new MessagingProfilesApi();
UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
try {
    ListMessagingProfileShortCodesResponse result = apiInstance.listMessagingProfileShortCodes(id, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfileShortCodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]

### Return type

[**ListMessagingProfileShortCodesResponse**](ListMessagingProfileShortCodesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMessagingProfiles"></a>
# **listMessagingProfiles**
> ListMessagingProfilesResponse listMessagingProfiles(pageNumber, pageSize)

List messaging profiles

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagingProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingProfilesApi apiInstance = new MessagingProfilesApi();
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
try {
    ListMessagingProfilesResponse result = apiInstance.listMessagingProfiles(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingProfilesApi#listMessagingProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]

### Return type

[**ListMessagingProfilesResponse**](ListMessagingProfilesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveMessagingProfile"></a>
# **retrieveMessagingProfile**
> MessagingProfileResponse retrieveMessagingProfile(id)

Retrieve a messaging profile

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagingProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingProfilesApi apiInstance = new MessagingProfilesApi();
UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
try {
    MessagingProfileResponse result = apiInstance.retrieveMessagingProfile(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingProfilesApi#retrieveMessagingProfile");
    e.printStackTrace();
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

<a name="updateMessagingProfile"></a>
# **updateMessagingProfile**
> MessagingProfileResponse updateMessagingProfile(body, id)

Update a messaging profile

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagingProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingProfilesApi apiInstance = new MessagingProfilesApi();
UpdateMessagingProfileRequest body = new UpdateMessagingProfileRequest(); // UpdateMessagingProfileRequest | New Messaging Profile object
UUID id = new UUID(); // UUID | The id of the messaging profile to retrieve
try {
    MessagingProfileResponse result = apiInstance.updateMessagingProfile(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingProfilesApi#updateMessagingProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateMessagingProfileRequest**](UpdateMessagingProfileRequest.md)| New Messaging Profile object |
 **id** | [**UUID**](.md)| The id of the messaging profile to retrieve |

### Return type

[**MessagingProfileResponse**](MessagingProfileResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# PhoneNumberCampaignsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPhoneNumberCampaign**](PhoneNumberCampaignsApi.md#createPhoneNumberCampaign) | **POST** /phoneNumberCampaign | Create New Phone Number Campaign
[**createPhoneNumberCampaign_0**](PhoneNumberCampaignsApi.md#createPhoneNumberCampaign_0) | **PUT** /phoneNumberCampaign/{phoneNumber} | Create New Phone Number Campaign
[**createPhoneNumberCampaign_1**](PhoneNumberCampaignsApi.md#createPhoneNumberCampaign_1) | **POST** /phone_number_campaigns | Create New Phone Number Campaign
[**deletePhoneNumberCampaign**](PhoneNumberCampaignsApi.md#deletePhoneNumberCampaign) | **DELETE** /phoneNumberCampaign/{phoneNumber} | Delete Phone Number Campaign
[**deletePhoneNumberCampaign_0**](PhoneNumberCampaignsApi.md#deletePhoneNumberCampaign_0) | **DELETE** /phone_number_campaigns/{phoneNumber} | Delete Phone Number Campaign
[**getAllPhoneNumberCampaigns**](PhoneNumberCampaignsApi.md#getAllPhoneNumberCampaigns) | **GET** /phoneNumberCampaign | Retrieve All Phone Number Campaigns
[**getAllPhoneNumberCampaigns_0**](PhoneNumberCampaignsApi.md#getAllPhoneNumberCampaigns_0) | **GET** /phone_number_campaigns | Retrieve All Phone Number Campaigns
[**getPhoneNumberCampaign**](PhoneNumberCampaignsApi.md#getPhoneNumberCampaign) | **GET** /phoneNumberCampaign/{phoneNumber} | Get Single Phone Number Campaign
[**getSinglePhoneNumberCampaign**](PhoneNumberCampaignsApi.md#getSinglePhoneNumberCampaign) | **GET** /phone_number_campaigns/{phoneNumber} | Get Single Phone Number Campaign
[**putPhoneNumberCampaign**](PhoneNumberCampaignsApi.md#putPhoneNumberCampaign) | **PUT** /phone_number_campaigns/{phoneNumber} | Create New Phone Number Campaign



## createPhoneNumberCampaign

> ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost createPhoneNumberCampaign(phoneNumberCampaignCreate)

Create New Phone Number Campaign

Assign an individual phone number to campaign.

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
            ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost result = apiInstance.createPhoneNumberCampaign(phoneNumberCampaignCreate);
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

[**ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost**](ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost.md)

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


## createPhoneNumberCampaign_0

> ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut createPhoneNumberCampaign_0(phoneNumber, phoneNumberCampaignCreate)

Create New Phone Number Campaign

This endpoint allows you to assign a different campaign to a supplied `phoneNumber`.

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
            ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut result = apiInstance.createPhoneNumberCampaign_0(phoneNumber, phoneNumberCampaignCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberCampaignsApi#createPhoneNumberCampaign_0");
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

[**ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut**](ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut.md)

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


## createPhoneNumberCampaign_1

> Object createPhoneNumberCampaign_1(phoneNumberCampaignCreate)

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
            Object result = apiInstance.createPhoneNumberCampaign_1(phoneNumberCampaignCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberCampaignsApi#createPhoneNumberCampaign_1");
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

**Object**

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
| **422** | Validation Error |  -  |


## deletePhoneNumberCampaign_0

> Object deletePhoneNumberCampaign_0(phoneNumber)

Delete Phone Number Campaign

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
            Object result = apiInstance.deletePhoneNumberCampaign_0(phoneNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberCampaignsApi#deletePhoneNumberCampaign_0");
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

**Object**

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


## getAllPhoneNumberCampaigns

> PhoneNumberCampaignPaginated getAllPhoneNumberCampaigns(recordsPerPage, page)

Retrieve All Phone Number Campaigns

Retrieve all of your organization's phone number/campaign assignments.

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
        Object recordsPerPage = 20; // Object | 
        Object page = 1; // Object | 
        try {
            PhoneNumberCampaignPaginated result = apiInstance.getAllPhoneNumberCampaigns(recordsPerPage, page);
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
| **422** | Validation Error |  -  |


## getAllPhoneNumberCampaigns_0

> Object getAllPhoneNumberCampaigns_0(recordsPerPage, page)

Retrieve All Phone Number Campaigns

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
        Object recordsPerPage = 20; // Object | 
        Object page = 1; // Object | 
        try {
            Object result = apiInstance.getAllPhoneNumberCampaigns_0(recordsPerPage, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberCampaignsApi#getAllPhoneNumberCampaigns_0");
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

### Return type

**Object**

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


## getPhoneNumberCampaign

> PhoneNumberCampaign getPhoneNumberCampaign(phoneNumber)

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
            PhoneNumberCampaign result = apiInstance.getPhoneNumberCampaign(phoneNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberCampaignsApi#getPhoneNumberCampaign");
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
| **422** | Validation Error |  -  |


## getSinglePhoneNumberCampaign

> Object getSinglePhoneNumberCampaign(phoneNumber)

Get Single Phone Number Campaign

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
            Object result = apiInstance.getSinglePhoneNumberCampaign(phoneNumber);
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

**Object**

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


## putPhoneNumberCampaign

> Object putPhoneNumberCampaign(phoneNumber, phoneNumberCampaignCreate)

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
            Object result = apiInstance.putPhoneNumberCampaign(phoneNumber, phoneNumberCampaignCreate);
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

**Object**

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


# CountryCoverageApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retreiveCountryCoverage**](CountryCoverageApi.md#retreiveCountryCoverage) | **GET** /country_coverage | Get country coverage
[**retreiveSpecificCountryCoverage**](CountryCoverageApi.md#retreiveSpecificCountryCoverage) | **GET** /country_coverage/countries/{country_code} | Get coverage for a specific country



## retreiveCountryCoverage

> RetreiveCountryCoverage200Response retreiveCountryCoverage()

Get country coverage

Get country coverage

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CountryCoverageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CountryCoverageApi apiInstance = new CountryCoverageApi(defaultClient);
        try {
            RetreiveCountryCoverage200Response result = apiInstance.retreiveCountryCoverage();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CountryCoverageApi#retreiveCountryCoverage");
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

[**RetreiveCountryCoverage200Response**](RetreiveCountryCoverage200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for country coverage |  -  |
| **0** | Unexpected error |  -  |


## retreiveSpecificCountryCoverage

> RetreiveSpecificCountryCoverage200Response retreiveSpecificCountryCoverage(countryCode)

Get coverage for a specific country

Get coverage for a specific country

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CountryCoverageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CountryCoverageApi apiInstance = new CountryCoverageApi(defaultClient);
        String countryCode = "US"; // String | Country ISO code.
        try {
            RetreiveSpecificCountryCoverage200Response result = apiInstance.retreiveSpecificCountryCoverage(countryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CountryCoverageApi#retreiveSpecificCountryCoverage");
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
 **countryCode** | **String**| Country ISO code. |

### Return type

[**RetreiveSpecificCountryCoverage200Response**](RetreiveSpecificCountryCoverage200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response for specific country coverage |  -  |
| **0** | Unexpected error |  -  |


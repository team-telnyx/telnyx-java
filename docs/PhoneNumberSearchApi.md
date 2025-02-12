# PhoneNumberSearchApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAvailablePhoneNumberBlocks**](PhoneNumberSearchApi.md#listAvailablePhoneNumberBlocks) | **GET** /available_phone_number_blocks | List available phone number blocks
[**listAvailablePhoneNumbers**](PhoneNumberSearchApi.md#listAvailablePhoneNumbers) | **GET** /available_phone_numbers | List available phone numbers



## listAvailablePhoneNumberBlocks

> ListAvailablePhoneNumbersBlocksResponse listAvailablePhoneNumberBlocks(filterLocality, filterCountryCode, filterNationalDestinationCode, filterPhoneNumberType)

List available phone number blocks

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberSearchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberSearchApi apiInstance = new PhoneNumberSearchApi(defaultClient);
        String filterLocality = "Chicago"; // String | Filter phone numbers by city.
        String filterCountryCode = "US"; // String | Filter phone numbers by country.
        String filterNationalDestinationCode = "312"; // String | Filter by the national destination code of the number.
        String filterPhoneNumberType = "local"; // String | Filter phone numbers by number type.
        try {
            ListAvailablePhoneNumbersBlocksResponse result = apiInstance.listAvailablePhoneNumberBlocks(filterLocality, filterCountryCode, filterNationalDestinationCode, filterPhoneNumberType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberSearchApi#listAvailablePhoneNumberBlocks");
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
 **filterLocality** | **String**| Filter phone numbers by city. | [optional]
 **filterCountryCode** | **String**| Filter phone numbers by country. | [optional]
 **filterNationalDestinationCode** | **String**| Filter by the national destination code of the number. | [optional]
 **filterPhoneNumberType** | **String**| Filter phone numbers by number type. | [optional] [enum: local, toll_free, mobile, national, shared_cost]

### Return type

[**ListAvailablePhoneNumbersBlocksResponse**](ListAvailablePhoneNumbersBlocksResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of available phone numbers blocks. |  -  |
| **0** | Unexpected error |  -  |


## listAvailablePhoneNumbers

> ListAvailablePhoneNumbersResponse listAvailablePhoneNumbers().filterPhoneNumberStartsWith(filterPhoneNumberStartsWith).filterPhoneNumberEndsWith(filterPhoneNumberEndsWith).filterPhoneNumberContains(filterPhoneNumberContains).filterLocality(filterLocality).filterAdministrativeArea(filterAdministrativeArea).filterCountryCode(filterCountryCode).filterNationalDestinationCode(filterNationalDestinationCode).filterRateCenter(filterRateCenter).filterPhoneNumberType(filterPhoneNumberType).filterFeatures(filterFeatures).filterLimit(filterLimit).filterBestEffort(filterBestEffort).filterQuickship(filterQuickship).filterReservable(filterReservable).filterExcludeHeldNumbers(filterExcludeHeldNumbers).execute();

List available phone numbers

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberSearchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberSearchApi apiInstance = new PhoneNumberSearchApi(defaultClient);
        String filterPhoneNumberStartsWith = "TACO"; // String | Filter numbers starting with a pattern (excludes NDC if used with `national_destination_code` filter).
        String filterPhoneNumberEndsWith = "TACO"; // String | Filter numbers ending with a pattern (excludes NDC if used with `national_destination_code` filter).
        String filterPhoneNumberContains = "TACO"; // String | Filter numbers containing a pattern (excludes NDC if used with `national_destination_code` filter).
        String filterLocality = "Chicago"; // String | Filter phone numbers by city.
        String filterAdministrativeArea = "IL"; // String | Find numbers in a particular US state or CA province.
        String filterCountryCode = "US"; // String | Filter phone numbers by country.
        String filterNationalDestinationCode = "312"; // String | Filter by the national destination code of the number.
        String filterRateCenter = "Chicago Heights"; // String | Filter phone numbers by rate center. This filter is only applicable to USA and Canada numbers.
        String filterPhoneNumberType = "local"; // String | Filter phone numbers by number type.
        List<String> filterFeatures = Arrays.asList(); // List<String> | Filter phone numbers with specific features.
        Integer filterLimit = 100; // Integer | Limits the number of results.
        Boolean filterBestEffort = true; // Boolean | Filter to determine if best effort results should be included. Only available in USA/CANADA.
        Boolean filterQuickship = true; // Boolean | Filter to exclude phone numbers that need additional time after to purchase to activate. Only applicable for +1 toll_free numbers.
        Boolean filterReservable = true; // Boolean | Filter to ensure only numbers that can be reserved are included in the results.
        Boolean filterExcludeHeldNumbers = true; // Boolean | Filter to exclude phone numbers that are currently on hold/reserved for your account.
        try {
            ListAvailablePhoneNumbersResponse result = api.listAvailablePhoneNumbers()
                .filterPhoneNumberStartsWith(filterPhoneNumberStartsWith)
                .filterPhoneNumberEndsWith(filterPhoneNumberEndsWith)
                .filterPhoneNumberContains(filterPhoneNumberContains)
                .filterLocality(filterLocality)
                .filterAdministrativeArea(filterAdministrativeArea)
                .filterCountryCode(filterCountryCode)
                .filterNationalDestinationCode(filterNationalDestinationCode)
                .filterRateCenter(filterRateCenter)
                .filterPhoneNumberType(filterPhoneNumberType)
                .filterFeatures(filterFeatures)
                .filterLimit(filterLimit)
                .filterBestEffort(filterBestEffort)
                .filterQuickship(filterQuickship)
                .filterReservable(filterReservable)
                .filterExcludeHeldNumbers(filterExcludeHeldNumbers)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberSearchApi#listAvailablePhoneNumbers");
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
 **filterPhoneNumberStartsWith** | **String**| Filter numbers starting with a pattern (excludes NDC if used with &#x60;national_destination_code&#x60; filter). | [optional]
 **filterPhoneNumberEndsWith** | **String**| Filter numbers ending with a pattern (excludes NDC if used with &#x60;national_destination_code&#x60; filter). | [optional]
 **filterPhoneNumberContains** | **String**| Filter numbers containing a pattern (excludes NDC if used with &#x60;national_destination_code&#x60; filter). | [optional]
 **filterLocality** | **String**| Filter phone numbers by city. | [optional]
 **filterAdministrativeArea** | **String**| Find numbers in a particular US state or CA province. | [optional]
 **filterCountryCode** | **String**| Filter phone numbers by country. | [optional]
 **filterNationalDestinationCode** | **String**| Filter by the national destination code of the number. | [optional]
 **filterRateCenter** | **String**| Filter phone numbers by rate center. This filter is only applicable to USA and Canada numbers. | [optional]
 **filterPhoneNumberType** | **String**| Filter phone numbers by number type. | [optional] [enum: local, toll_free, mobile, national, shared_cost]
 **filterFeatures** | **List&lt;String&gt;**| Filter phone numbers with specific features. | [optional] [enum: sms, mms, voice, fax, emergency, hd_voice, international_sms, local_calling]
 **filterLimit** | **Integer**| Limits the number of results. | [optional]
 **filterBestEffort** | **Boolean**| Filter to determine if best effort results should be included. Only available in USA/CANADA. | [optional]
 **filterQuickship** | **Boolean**| Filter to exclude phone numbers that need additional time after to purchase to activate. Only applicable for +1 toll_free numbers. | [optional]
 **filterReservable** | **Boolean**| Filter to ensure only numbers that can be reserved are included in the results. | [optional]
 **filterExcludeHeldNumbers** | **Boolean**| Filter to exclude phone numbers that are currently on hold/reserved for your account. | [optional]

### Return type

[**ListAvailablePhoneNumbersResponse**](ListAvailablePhoneNumbersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of available phone numbers. |  -  |
| **0** | Unexpected error |  -  |


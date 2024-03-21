# PhoneNumberSearchApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAvailablePhoneNumberBlocks**](PhoneNumberSearchApi.md#listAvailablePhoneNumberBlocks) | **GET** /available_phone_number_blocks | List available phone number blocks
[**listAvailablePhoneNumbers**](PhoneNumberSearchApi.md#listAvailablePhoneNumbers) | **GET** /available_phone_numbers | List available phone numbers



## listAvailablePhoneNumberBlocks

> ListAvailablePhoneNumbersBlocksResponse listAvailablePhoneNumberBlocks(filterPhoneNumberStartsWith, filterPhoneNumberEndsWith, filterPhoneNumberContains, filterLocality, filterAdministrativeArea, filterCountryCode, filterNationalDestinationCode, filterRateCenter, filterNumberType, filterFeatures, filterMinimumBlockSize, filterLimit)

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
        String filterPhoneNumberStartsWith = "201"; // String | Filter number blocks that start with a pattern (meant to be used after `national_destination_code` filter has been set).
        String filterPhoneNumberEndsWith = "8000"; // String | Filter numbers ending with a pattern.
        String filterPhoneNumberContains = "456"; // String | Filter numbers containing a pattern.
        String filterLocality = "Chicago"; // String | Filter phone numbers by city.
        String filterAdministrativeArea = "IL"; // String | Filter phone numbers by US state/CA province.
        String filterCountryCode = "US"; // String | Filter phone numbers by ISO alpha-2 country code.
        String filterNationalDestinationCode = "312"; // String | Filter by the national destination code of the number. This filter is only applicable to North American numbers.
        String filterRateCenter = "CHICAGO HEIGHTS"; // String | Filter phone numbers by NANP rate center. This filter is only applicable to North American numbers.
        String filterNumberType = "toll-free"; // String | Filter phone numbers by number type.
        List<String> filterFeatures = Arrays.asList(); // List<String> | Filter if the phone number should be used for voice, fax, mms, sms, emergency.
        Integer filterMinimumBlockSize = 100; // Integer | Filter number blocks by minimum blocks size
        Integer filterLimit = 100; // Integer | Limits the number of results.
        try {
            ListAvailablePhoneNumbersBlocksResponse result = apiInstance.listAvailablePhoneNumberBlocks(filterPhoneNumberStartsWith, filterPhoneNumberEndsWith, filterPhoneNumberContains, filterLocality, filterAdministrativeArea, filterCountryCode, filterNationalDestinationCode, filterRateCenter, filterNumberType, filterFeatures, filterMinimumBlockSize, filterLimit);
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
 **filterPhoneNumberStartsWith** | **String**| Filter number blocks that start with a pattern (meant to be used after &#x60;national_destination_code&#x60; filter has been set). | [optional]
 **filterPhoneNumberEndsWith** | **String**| Filter numbers ending with a pattern. | [optional]
 **filterPhoneNumberContains** | **String**| Filter numbers containing a pattern. | [optional]
 **filterLocality** | **String**| Filter phone numbers by city. | [optional]
 **filterAdministrativeArea** | **String**| Filter phone numbers by US state/CA province. | [optional]
 **filterCountryCode** | **String**| Filter phone numbers by ISO alpha-2 country code. | [optional]
 **filterNationalDestinationCode** | **String**| Filter by the national destination code of the number. This filter is only applicable to North American numbers. | [optional]
 **filterRateCenter** | **String**| Filter phone numbers by NANP rate center. This filter is only applicable to North American numbers. | [optional]
 **filterNumberType** | **String**| Filter phone numbers by number type. | [optional] [enum: toll-free]
 **filterFeatures** | **List&lt;String&gt;**| Filter if the phone number should be used for voice, fax, mms, sms, emergency. | [optional] [enum: sms, mms, voice, fax, emergency]
 **filterMinimumBlockSize** | **Integer**| Filter number blocks by minimum blocks size | [optional]
 **filterLimit** | **Integer**| Limits the number of results. | [optional]

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
        String filterPhoneNumberStartsWith = "FREE"; // String | Filter numbers starting with a pattern (exclude NDC from start of this filter if used with `national_destination_code` filter).
        String filterPhoneNumberEndsWith = "CALL"; // String | Filter numbers ending with a pattern (max length of 4 digits if used with `national_destination_code` filter).
        String filterPhoneNumberContains = "FOO"; // String | Filter numbers containing a pattern (must be used with `national_destination_code` filter and only searches within last 4 digits).
        String filterLocality = "Chicago"; // String | Filter phone numbers by city.
        String filterAdministrativeArea = "IL"; // String | Filter phone numbers by US state/CA province.
        String filterCountryCode = "US"; // String | Filter phone numbers by ISO alpha-2 country code.
        String filterNationalDestinationCode = "312"; // String | Filter by the national destination code of the number. This filter is only applicable to North American numbers.
        String filterRateCenter = "CHICAGO HEIGHTS"; // String | Filter phone numbers by NANP rate center. This filter is only applicable to North American numbers.
        String filterPhoneNumberType = "local"; // String | Filter phone numbers by number type.
        List<String> filterFeatures = Arrays.asList(); // List<String> | Filter if the phone number should be used for voice, fax, mms, sms, emergency.
        Integer filterLimit = 100; // Integer | Limits the number of results.
        Boolean filterBestEffort = false; // Boolean | Filter to determine if best effort results should be included. Only available in NANPA countries.
        Boolean filterQuickship = true; // Boolean | Filter to exclude phone numbers that need additional time after to purchase to receive phone calls. Only available for toll-free numbers.
        Boolean filterReservable = true; // Boolean | Filter to exclude phone numbers that cannot be reserved before purchase.
        Boolean filterExcludeHeldNumbers = false; // Boolean | Filter to exclude phone numbers that are currently on hold for your account.
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
 **filterPhoneNumberStartsWith** | **String**| Filter numbers starting with a pattern (exclude NDC from start of this filter if used with &#x60;national_destination_code&#x60; filter). | [optional]
 **filterPhoneNumberEndsWith** | **String**| Filter numbers ending with a pattern (max length of 4 digits if used with &#x60;national_destination_code&#x60; filter). | [optional]
 **filterPhoneNumberContains** | **String**| Filter numbers containing a pattern (must be used with &#x60;national_destination_code&#x60; filter and only searches within last 4 digits). | [optional]
 **filterLocality** | **String**| Filter phone numbers by city. | [optional]
 **filterAdministrativeArea** | **String**| Filter phone numbers by US state/CA province. | [optional]
 **filterCountryCode** | **String**| Filter phone numbers by ISO alpha-2 country code. | [optional]
 **filterNationalDestinationCode** | **String**| Filter by the national destination code of the number. This filter is only applicable to North American numbers. | [optional]
 **filterRateCenter** | **String**| Filter phone numbers by NANP rate center. This filter is only applicable to North American numbers. | [optional]
 **filterPhoneNumberType** | **String**| Filter phone numbers by number type. | [optional] [enum: local, toll_free, mobile, national, shared_cost, landline]
 **filterFeatures** | **List&lt;String&gt;**| Filter if the phone number should be used for voice, fax, mms, sms, emergency. | [optional] [enum: sms, mms, voice, fax, emergency]
 **filterLimit** | **Integer**| Limits the number of results. | [optional]
 **filterBestEffort** | **Boolean**| Filter to determine if best effort results should be included. Only available in NANPA countries. | [optional]
 **filterQuickship** | **Boolean**| Filter to exclude phone numbers that need additional time after to purchase to receive phone calls. Only available for toll-free numbers. | [optional]
 **filterReservable** | **Boolean**| Filter to exclude phone numbers that cannot be reserved before purchase. | [optional]
 **filterExcludeHeldNumbers** | **Boolean**| Filter to exclude phone numbers that are currently on hold for your account. | [optional]

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


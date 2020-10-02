# NumberSearchApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAvailablePhoneNumbers**](NumberSearchApi.md#listAvailablePhoneNumbers) | **GET** /available_phone_numbers | List available phone numbers

<a name="listAvailablePhoneNumbers"></a>
# **listAvailablePhoneNumbers**
> ListAvailablePhoneNumbersResponse listAvailablePhoneNumbers(filterPhoneNumberStartsWith, filterPhoneNumberEndsWith, filterPhoneNumberContains, filterLocality, filterAdministrativeArea, filterCountryCode, filterNationalDestinationCode, filterRateCenter, filterNumberType, filterFeatures, filterLimit, filterBestEffort, filterQuickship, filterReservable)

List available phone numbers

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberSearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberSearchApi apiInstance = new NumberSearchApi();
String filterPhoneNumberStartsWith = "filterPhoneNumberStartsWith_example"; // String | Filter numbers starting with a pattern (meant to be used after `national_destination_code` filter has been set).
String filterPhoneNumberEndsWith = "filterPhoneNumberEndsWith_example"; // String | Filter numbers ending with a pattern.
String filterPhoneNumberContains = "filterPhoneNumberContains_example"; // String | Filter numbers containing a pattern.
String filterLocality = "filterLocality_example"; // String | Filter phone numbers by city.
String filterAdministrativeArea = "filterAdministrativeArea_example"; // String | Filter phone numbers by US state/CA province.
String filterCountryCode = "filterCountryCode_example"; // String | Filter phone numbers by ISO alpha-2 country code.
String filterNationalDestinationCode = "filterNationalDestinationCode_example"; // String | Filter by the national destination code of the number. This filter is only applicable to North American numbers.
String filterRateCenter = "filterRateCenter_example"; // String | Filter phone numbers by NANP rate center. This filter is only applicable to North American numbers.
String filterNumberType = "filterNumberType_example"; // String | Filter phone numbers by number type.
List<String> filterFeatures = Arrays.asList("filterFeatures_example"); // List<String> | Filter if the phone number should be used for voice, fax, mms, sms, emergency.
Integer filterLimit = 56; // Integer | Limits the number of results.
Boolean filterBestEffort = true; // Boolean | Filter to determine if best effort results should be included.
Boolean filterQuickship = true; // Boolean | Filter to exclude phone numbers that need additional time after to purchase to receive phone calls.
Boolean filterReservable = true; // Boolean | Filter to exclude phone numbers that cannot be reserved before purchase.
try {
    ListAvailablePhoneNumbersResponse result = apiInstance.listAvailablePhoneNumbers(filterPhoneNumberStartsWith, filterPhoneNumberEndsWith, filterPhoneNumberContains, filterLocality, filterAdministrativeArea, filterCountryCode, filterNationalDestinationCode, filterRateCenter, filterNumberType, filterFeatures, filterLimit, filterBestEffort, filterQuickship, filterReservable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberSearchApi#listAvailablePhoneNumbers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterPhoneNumberStartsWith** | **String**| Filter numbers starting with a pattern (meant to be used after &#x60;national_destination_code&#x60; filter has been set). | [optional]
 **filterPhoneNumberEndsWith** | **String**| Filter numbers ending with a pattern. | [optional]
 **filterPhoneNumberContains** | **String**| Filter numbers containing a pattern. | [optional]
 **filterLocality** | **String**| Filter phone numbers by city. | [optional]
 **filterAdministrativeArea** | **String**| Filter phone numbers by US state/CA province. | [optional]
 **filterCountryCode** | **String**| Filter phone numbers by ISO alpha-2 country code. | [optional]
 **filterNationalDestinationCode** | **String**| Filter by the national destination code of the number. This filter is only applicable to North American numbers. | [optional]
 **filterRateCenter** | **String**| Filter phone numbers by NANP rate center. This filter is only applicable to North American numbers. | [optional]
 **filterNumberType** | **String**| Filter phone numbers by number type. | [optional] [enum: toll-free, national, mobile, local]
 **filterFeatures** | [**List&lt;String&gt;**](String.md)| Filter if the phone number should be used for voice, fax, mms, sms, emergency. | [optional] [enum: sms, mms, voice, fax, emergency]
 **filterLimit** | **Integer**| Limits the number of results. | [optional]
 **filterBestEffort** | **Boolean**| Filter to determine if best effort results should be included. | [optional]
 **filterQuickship** | **Boolean**| Filter to exclude phone numbers that need additional time after to purchase to receive phone calls. | [optional]
 **filterReservable** | **Boolean**| Filter to exclude phone numbers that cannot be reserved before purchase. | [optional]

### Return type

[**ListAvailablePhoneNumbersResponse**](ListAvailablePhoneNumbersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


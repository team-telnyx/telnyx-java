

# SimpleSIMCard


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifies the resource. |  [optional] [readonly] |
|**recordType** | **String** |  |  [optional] [readonly] |
|**status** | [**SIMCardStatus**](SIMCardStatus.md) |  |  [optional] |
|**iccid** | **String** | The ICCID is the identifier of the specific SIM card/chip. Each SIM is internationally identified by its integrated circuit card identifier (ICCID). ICCIDs are stored in the SIM card&#39;s memory and are also engraved or printed on the SIM card body during a process called personalization.  |  [optional] [readonly] |
|**imsi** | **String** | SIM cards are identified on their individual operator networks by a unique International Mobile Subscriber Identity (IMSI). &lt;br/&gt; Mobile network operators connect mobile phone calls and communicate with their market SIM cards using their IMSIs. The IMSI is stored in the Subscriber  Identity Module (SIM) inside the device and is sent by the device to the appropriate network. It is used to acquire the details of the device in the Home  Location Register (HLR) or the Visitor Location Register (VLR).  |  [optional] [readonly] |
|**msisdn** | **String** | Mobile Station International Subscriber Directory Number (MSISDN) is a number used to identify a mobile phone number internationally. &lt;br/&gt; MSISDN is defined by the E.164 numbering plan. It includes a country code and a National Destination Code which identifies the subscriber&#39;s operator.  |  [optional] [readonly] |
|**simCardGroupId** | **UUID** | The group SIMCardGroup identification. This attribute can be &lt;code&gt;null&lt;/code&gt; when it&#39;s present in an associated resource. |  [optional] |
|**tags** | **List&lt;String&gt;** | Searchable tags associated with the SIM card |  [optional] |
|**dataLimit** | [**SimpleSIMCardDataLimit**](SimpleSIMCardDataLimit.md) |  |  [optional] |
|**currentBillingPeriodConsumedData** | [**SIMCardCurrentBillingPeriodConsumedData**](SIMCardCurrentBillingPeriodConsumedData.md) |  |  [optional] |
|**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was updated. |  [optional] [readonly] |




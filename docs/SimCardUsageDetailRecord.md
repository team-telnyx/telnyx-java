

# SimCardUsageDetailRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier for this SIM Card Usage |  [optional] |
|**createdAt** | **OffsetDateTime** | Event creation time |  [optional] |
|**closedAt** | **OffsetDateTime** | Event close time |  [optional] |
|**ipAddress** | **String** | Ip address that generated the event |  [optional] |
|**downlinkData** | **BigDecimal** | Number of megabytes downloaded |  [optional] |
|**imsi** | **String** | International Mobile Subscriber Identity |  [optional] |
|**mcc** | **String** | Mobile country code |  [optional] |
|**mnc** | **String** | Mobile network code |  [optional] |
|**currency** | **String** | Telnyx account currency used to describe monetary values, including billing cost |  [optional] |
|**dataUnit** | **String** | Unit of wireless link consumption |  [optional] |
|**dataRate** | **String** | Currency amount per billing unit used to calculate the Telnyx billing cost |  [optional] |
|**simGroupName** | **String** | Sim group name for sim card |  [optional] |
|**simCardId** | **String** | Unique identifier for SIM card |  [optional] |
|**simGroupId** | **String** | Unique identifier for SIM group |  [optional] |
|**simCardTags** | **String** | User-provided tags |  [optional] |
|**phoneNumber** | **String** | Telephone number associated to SIM card |  [optional] |
|**uplinkData** | **BigDecimal** | Number of megabytes uploaded |  [optional] |
|**dataCost** | **BigDecimal** | Data cost |  [optional] |
|**recordType** | **String** |  |  |




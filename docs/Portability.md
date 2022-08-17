

# Portability


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lrn** | **String** | Local Routing Number, if assigned to the requested phone number |  [optional] |
|**portedStatus** | [**PortedStatusEnum**](#PortedStatusEnum) | Indicates whether or not the requested phone number has been ported |  [optional] |
|**portedDate** | **String** | ISO-formatted date when the requested phone number has been ported |  [optional] |
|**ocn** | **String** | Operating Company Name (OCN) as per the Local Exchange Routing Guide (LERG) database |  [optional] |
|**lineType** | **String** | Type of number |  [optional] |
|**spid** | **String** | SPID (Service Provider ID) |  [optional] |
|**spidCarrierName** | **String** | Service provider name |  [optional] |
|**spidCarrierType** | **String** | Service provider type |  [optional] |
|**altspid** | **String** | Alternative SPID (Service Provider ID). Often used when a carrier is using a number from another carrier |  [optional] |
|**altspidCarrierName** | **String** | Alternative service provider name |  [optional] |
|**altspidCarrierType** | **String** | Alternative service provider type |  [optional] |
|**city** | **String** | City name extracted from the locality in the Local Exchange Routing Guide (LERG) database |  [optional] |
|**state** | **String** |  |  [optional] |



## Enum: PortedStatusEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |
| EMPTY | &quot;&quot; |




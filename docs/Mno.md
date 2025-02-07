

# Mno


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**networkId** | **Integer** | Unique network identifier assigned to MNO. |  |
|**displayName** | **String** | Display name of the mobile network operator. |  |
|**osrBitmaskIndex** | **Integer** | NetNumber OSR &#39;campaign_id&#39; property&#39;s &#39;status&#39; attribute holds individual MNO campaign operation status. The &#39;status&#39; attribute leverages bitmasking technique to store multiple MNOs&#39; operating status. The campaign operation status is reduced to &#39;1&#39; or &#39;0&#39; value where &#39;1&#39; indicate an &#39;ACTIVE&#39; status and &#39;0&#39; represents every other non-active statuses, including REVIEW, REJECT and SUSPEND. The &#39;osrBitmaskIndex&#39; holds the bitmask index of the MNO. For example, T-Mobile&#39;s bitmask index is 2, which implies T-Mobile&#39;s campaign operation status is stored in bit #2, or 3rd bit when counting from right. |  |




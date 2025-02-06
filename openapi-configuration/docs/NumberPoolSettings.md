

# NumberPoolSettings

Number Pool allows you to send messages from a pool of numbers of different types, assigning weights to each type. The pool consists of all the long code and toll free numbers assigned to the messaging profile.  To disable this feature, set the object field to `null`. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tollFreeWeight** | **BigDecimal** | Defines the probability weight for a Toll Free number to be selected when sending a message. The higher the weight the higher the probability. The sum of the weights for all number types does not necessarily need to add to 100. Weight must be a non-negative number, and when equal to zero it will remove the number type from the pool.  |  |
|**longCodeWeight** | **BigDecimal** | Defines the probability weight for a Long Code number to be selected when sending a message. The higher the weight the higher the probability. The sum of the weights for all number types does not necessarily need to add to 100.  Weight must be a non-negative number, and when equal to zero it will remove the number type from the pool.  |  |
|**skipUnhealthy** | **Boolean** | If set to true all unhealthy numbers will be automatically excluded from the pool. Health metrics per number are calculated on a regular basis, taking into account the deliverability rate and the amount of messages marked as spam by upstream carriers. Numbers with a deliverability rate below 25% or spam ratio over 75% will be considered unhealthy.  |  |
|**stickySender** | **Boolean** | If set to true, Number Pool will try to choose the same sending number for all messages to a particular recipient. If the sending number becomes unhealthy and &#x60;skip_unhealthy&#x60; is set to true, a new number will be chosen.  |  [optional] |
|**geomatch** | **Boolean** | If set to true, Number Pool will try to choose a sending number with the same area code as the destination number. If there are no such numbers available, a nunber with a different area code will be chosen. Currently only NANP numbers are supported.  |  [optional] |




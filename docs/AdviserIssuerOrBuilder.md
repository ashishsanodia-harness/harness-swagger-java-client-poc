# AdviserIssuerOrBuilder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adviserTypeValue** | **Integer** |  |  [optional]
**adviserType** | [**AdviserTypeEnum**](#AdviserTypeEnum) |  |  [optional]
**allFields** | **Map&lt;String, Object&gt;** |  |  [optional]
**initializationErrorString** | **String** |  |  [optional]
**descriptorForType** | [**Descriptor**](Descriptor.md) |  |  [optional]
**defaultInstanceForType** | [**Message**](Message.md) |  |  [optional]
**unknownFields** | [**UnknownFieldSet**](UnknownFieldSet.md) |  |  [optional]
**initialized** | **Boolean** |  |  [optional]

<a name="AdviserTypeEnum"></a>
## Enum: AdviserTypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
NEXT_STEP | &quot;NEXT_STEP&quot;
RETRY | &quot;RETRY&quot;
INTERVENTION_WAIT | &quot;INTERVENTION_WAIT&quot;
END_PLAN | &quot;END_PLAN&quot;
MARK_SUCCESS | &quot;MARK_SUCCESS&quot;
IGNORE_FAILURE | &quot;IGNORE_FAILURE&quot;
UNRECOGNIZED | &quot;UNRECOGNIZED&quot;

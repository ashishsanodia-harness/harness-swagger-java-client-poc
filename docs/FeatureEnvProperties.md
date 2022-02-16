# FeatureEnvProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultServe** | [**Serve**](Serve.md) |  | 
**environment** | **String** | The environment identifier | 
**modifiedAt** | **Long** | The last time the flag was modified in this environment | 
**offVariation** | **String** | The variation to serve for this flag in this environment when the flag is off | 
**rules** | [**List&lt;ServingRule&gt;**](ServingRule.md) | A list of rules to use when evaluating this flag in this environment |  [optional]
**state** | [**FeatureState**](FeatureState.md) |  | 
**variationMap** | [**List&lt;VariationMap&gt;**](VariationMap.md) | A list of the variations that will be served to specific targets or target groups in an environment. |  [optional]
**version** | **Long** | The version of the flag.  This is incremented each time it is changed |  [optional]

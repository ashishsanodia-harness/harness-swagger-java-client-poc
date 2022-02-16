# DockerConnector

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dockerRegistryUrl** | **String** |  | 
**providerType** | [**ProviderTypeEnum**](#ProviderTypeEnum) |  | 
**auth** | [**DockerAuthentication**](DockerAuthentication.md) |  |  [optional]
**delegateSelectors** | **List&lt;String&gt;** |  |  [optional]

<a name="ProviderTypeEnum"></a>
## Enum: ProviderTypeEnum
Name | Value
---- | -----
DOCKERHUB | &quot;DockerHub&quot;
HARBOR | &quot;Harbor&quot;
QUAY | &quot;Quay&quot;
OTHER | &quot;Other&quot;

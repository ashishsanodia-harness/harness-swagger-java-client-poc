/*
 * CD NextGen API Reference
 * This is the Open Api Spec 3 for the NextGen Manager. This is under active development. Beware of the breaking change with respect to the generated code stub  # Authentication  <!-- ReDoc-Inject: <security-definitions> -->
 *
 * OpenAPI spec version: 3.0
 * Contact: contact@harness.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.CcmConnectorFilter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Properties of the Connector Filter defined in Harness
 */
@Schema(description = "Properties of the Connector Filter defined in Harness")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ConnectorFilterProperties {
  @SerializedName("connectorNames")
  private List<String> connectorNames = null;

  @SerializedName("connectorIdentifiers")
  private List<String> connectorIdentifiers = null;

  @SerializedName("description")
  private String description = null;

  /**
   * This is the list of the Connector types on which the filter will be applied.
   */
  @JsonAdapter(TypesEnum.Adapter.class)
  public enum TypesEnum {
    K8SCLUSTER("K8sCluster"),
    GIT("Git"),
    SPLUNK("Splunk"),
    APPDYNAMICS("AppDynamics"),
    PROMETHEUS("Prometheus"),
    DYNATRACE("Dynatrace"),
    VAULT("Vault"),
    AZUREKEYVAULT("AzureKeyVault"),
    DOCKERREGISTRY("DockerRegistry"),
    LOCAL("Local"),
    AWSKMS("AwsKms"),
    GCPKMS("GcpKms"),
    AWSSECRETMANAGER("AwsSecretManager"),
    GCP("Gcp"),
    AWS("Aws"),
    ARTIFACTORY("Artifactory"),
    JIRA("Jira"),
    NEXUS("Nexus"),
    GITHUB("Github"),
    GITLAB("Gitlab"),
    BITBUCKET("Bitbucket"),
    CODECOMMIT("Codecommit"),
    CEAWS("CEAws"),
    CEAZURE("CEAzure"),
    GCPCLOUDCOST("GcpCloudCost"),
    CEK8SCLUSTER("CEK8sCluster"),
    HTTPHELMREPO("HttpHelmRepo"),
    NEWRELIC("NewRelic"),
    DATADOG("Datadog"),
    SUMOLOGIC("SumoLogic"),
    PAGERDUTY("PagerDuty"),
    CUSTOMHEALTH("CustomHealth"),
    SERVICENOW("ServiceNow"),
    ERRORTRACKING("ErrorTracking");

    private String value;

    TypesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypesEnum fromValue(String input) {
      for (TypesEnum b : TypesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("types")
  private List<TypesEnum> types = null;

  /**
   * This is the list of the Connector category on which the filter will be applied.
   */
  @JsonAdapter(CategoriesEnum.Adapter.class)
  public enum CategoriesEnum {
    CLOUD_PROVIDER("CLOUD_PROVIDER"),
    SECRET_MANAGER("SECRET_MANAGER"),
    CLOUD_COST("CLOUD_COST"),
    ARTIFACTORY("ARTIFACTORY"),
    CODE_REPO("CODE_REPO"),
    MONITORING("MONITORING"),
    TICKETING("TICKETING");

    private String value;

    CategoriesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CategoriesEnum fromValue(String input) {
      for (CategoriesEnum b : CategoriesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CategoriesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoriesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CategoriesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CategoriesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("categories")
  private List<CategoriesEnum> categories = null;

  /**
   * This is the list of the Connector status on which the filter will be applied.
   */
  @JsonAdapter(ConnectivityStatusesEnum.Adapter.class)
  public enum ConnectivityStatusesEnum {
    SUCCESS("SUCCESS"),
    FAILURE("FAILURE"),
    PARTIAL("PARTIAL"),
    UNKNOWN("UNKNOWN");

    private String value;

    ConnectivityStatusesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ConnectivityStatusesEnum fromValue(String input) {
      for (ConnectivityStatusesEnum b : ConnectivityStatusesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ConnectivityStatusesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConnectivityStatusesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ConnectivityStatusesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ConnectivityStatusesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("connectivityStatuses")
  private List<ConnectivityStatusesEnum> connectivityStatuses = null;

  @SerializedName("inheritingCredentialsFromDelegate")
  private Boolean inheritingCredentialsFromDelegate = null;

  @SerializedName("ccmConnectorFilter")
  private CcmConnectorFilter ccmConnectorFilter = null;

  @SerializedName("tags")
  private Map<String, String> tags = null;

  /**
   * This specifies the corresponding Entity of the filter.
   */
  @JsonAdapter(FilterTypeEnum.Adapter.class)
  public enum FilterTypeEnum {
    CONNECTOR("CONNECTOR"),
    DELEGATEPROFILE("DELEGATEPROFILE"),
    DELEGATE("DELEGATE"),
    PIPELINESETUP("PIPELINESETUP"),
    PIPELINEEXECUTION("PIPELINEEXECUTION"),
    DEPLOYMENT("DEPLOYMENT"),
    AUDIT("AUDIT"),
    TEMPLATE("TEMPLATE");

    private String value;

    FilterTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FilterTypeEnum fromValue(String input) {
      for (FilterTypeEnum b : FilterTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FilterTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FilterTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public FilterTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FilterTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("filterType")
  private FilterTypeEnum filterType = null;

  public ConnectorFilterProperties connectorNames(List<String> connectorNames) {
    this.connectorNames = connectorNames;
    return this;
  }

  public ConnectorFilterProperties addConnectorNamesItem(String connectorNamesItem) {
    if (this.connectorNames == null) {
      this.connectorNames = new ArrayList<String>();
    }
    this.connectorNames.add(connectorNamesItem);
    return this;
  }

   /**
   * This is the list of the Connector names on which the filter will be applied.
   * @return connectorNames
  **/
  @Schema(description = "This is the list of the Connector names on which the filter will be applied.")
  public List<String> getConnectorNames() {
    return connectorNames;
  }

  public void setConnectorNames(List<String> connectorNames) {
    this.connectorNames = connectorNames;
  }

  public ConnectorFilterProperties connectorIdentifiers(List<String> connectorIdentifiers) {
    this.connectorIdentifiers = connectorIdentifiers;
    return this;
  }

  public ConnectorFilterProperties addConnectorIdentifiersItem(String connectorIdentifiersItem) {
    if (this.connectorIdentifiers == null) {
      this.connectorIdentifiers = new ArrayList<String>();
    }
    this.connectorIdentifiers.add(connectorIdentifiersItem);
    return this;
  }

   /**
   * This is the list of the Connector identifiers on which the filter will be applied.
   * @return connectorIdentifiers
  **/
  @Schema(description = "This is the list of the Connector identifiers on which the filter will be applied.")
  public List<String> getConnectorIdentifiers() {
    return connectorIdentifiers;
  }

  public void setConnectorIdentifiers(List<String> connectorIdentifiers) {
    this.connectorIdentifiers = connectorIdentifiers;
  }

  public ConnectorFilterProperties description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of filter created.
   * @return description
  **/
  @Schema(description = "Description of filter created.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ConnectorFilterProperties types(List<TypesEnum> types) {
    this.types = types;
    return this;
  }

  public ConnectorFilterProperties addTypesItem(TypesEnum typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<TypesEnum>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * This is the list of the Connector types on which the filter will be applied.
   * @return types
  **/
  @Schema(description = "This is the list of the Connector types on which the filter will be applied.")
  public List<TypesEnum> getTypes() {
    return types;
  }

  public void setTypes(List<TypesEnum> types) {
    this.types = types;
  }

  public ConnectorFilterProperties categories(List<CategoriesEnum> categories) {
    this.categories = categories;
    return this;
  }

  public ConnectorFilterProperties addCategoriesItem(CategoriesEnum categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<CategoriesEnum>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * This is the list of the Connector category on which the filter will be applied.
   * @return categories
  **/
  @Schema(description = "This is the list of the Connector category on which the filter will be applied.")
  public List<CategoriesEnum> getCategories() {
    return categories;
  }

  public void setCategories(List<CategoriesEnum> categories) {
    this.categories = categories;
  }

  public ConnectorFilterProperties connectivityStatuses(List<ConnectivityStatusesEnum> connectivityStatuses) {
    this.connectivityStatuses = connectivityStatuses;
    return this;
  }

  public ConnectorFilterProperties addConnectivityStatusesItem(ConnectivityStatusesEnum connectivityStatusesItem) {
    if (this.connectivityStatuses == null) {
      this.connectivityStatuses = new ArrayList<ConnectivityStatusesEnum>();
    }
    this.connectivityStatuses.add(connectivityStatusesItem);
    return this;
  }

   /**
   * This is the list of the Connector status on which the filter will be applied.
   * @return connectivityStatuses
  **/
  @Schema(description = "This is the list of the Connector status on which the filter will be applied.")
  public List<ConnectivityStatusesEnum> getConnectivityStatuses() {
    return connectivityStatuses;
  }

  public void setConnectivityStatuses(List<ConnectivityStatusesEnum> connectivityStatuses) {
    this.connectivityStatuses = connectivityStatuses;
  }

  public ConnectorFilterProperties inheritingCredentialsFromDelegate(Boolean inheritingCredentialsFromDelegate) {
    this.inheritingCredentialsFromDelegate = inheritingCredentialsFromDelegate;
    return this;
  }

   /**
   * Boolean value to indicate if the Connector is using credentials from the Delegate to connect.
   * @return inheritingCredentialsFromDelegate
  **/
  @Schema(description = "Boolean value to indicate if the Connector is using credentials from the Delegate to connect.")
  public Boolean isInheritingCredentialsFromDelegate() {
    return inheritingCredentialsFromDelegate;
  }

  public void setInheritingCredentialsFromDelegate(Boolean inheritingCredentialsFromDelegate) {
    this.inheritingCredentialsFromDelegate = inheritingCredentialsFromDelegate;
  }

  public ConnectorFilterProperties ccmConnectorFilter(CcmConnectorFilter ccmConnectorFilter) {
    this.ccmConnectorFilter = ccmConnectorFilter;
    return this;
  }

   /**
   * Get ccmConnectorFilter
   * @return ccmConnectorFilter
  **/
  @Schema(description = "")
  public CcmConnectorFilter getCcmConnectorFilter() {
    return ccmConnectorFilter;
  }

  public void setCcmConnectorFilter(CcmConnectorFilter ccmConnectorFilter) {
    this.ccmConnectorFilter = ccmConnectorFilter;
  }

  public ConnectorFilterProperties tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public ConnectorFilterProperties putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<String, String>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Filter tags as a key-value pair.
   * @return tags
  **/
  @Schema(description = "Filter tags as a key-value pair.")
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public ConnectorFilterProperties filterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
    return this;
  }

   /**
   * This specifies the corresponding Entity of the filter.
   * @return filterType
  **/
  @Schema(description = "This specifies the corresponding Entity of the filter.")
  public FilterTypeEnum getFilterType() {
    return filterType;
  }

  public void setFilterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorFilterProperties connectorFilterProperties = (ConnectorFilterProperties) o;
    return Objects.equals(this.connectorNames, connectorFilterProperties.connectorNames) &&
        Objects.equals(this.connectorIdentifiers, connectorFilterProperties.connectorIdentifiers) &&
        Objects.equals(this.description, connectorFilterProperties.description) &&
        Objects.equals(this.types, connectorFilterProperties.types) &&
        Objects.equals(this.categories, connectorFilterProperties.categories) &&
        Objects.equals(this.connectivityStatuses, connectorFilterProperties.connectivityStatuses) &&
        Objects.equals(this.inheritingCredentialsFromDelegate, connectorFilterProperties.inheritingCredentialsFromDelegate) &&
        Objects.equals(this.ccmConnectorFilter, connectorFilterProperties.ccmConnectorFilter) &&
        Objects.equals(this.tags, connectorFilterProperties.tags) &&
        Objects.equals(this.filterType, connectorFilterProperties.filterType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectorNames, connectorIdentifiers, description, types, categories, connectivityStatuses, inheritingCredentialsFromDelegate, ccmConnectorFilter, tags, filterType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorFilterProperties {\n");
    
    sb.append("    connectorNames: ").append(toIndentedString(connectorNames)).append("\n");
    sb.append("    connectorIdentifiers: ").append(toIndentedString(connectorIdentifiers)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    connectivityStatuses: ").append(toIndentedString(connectivityStatuses)).append("\n");
    sb.append("    inheritingCredentialsFromDelegate: ").append(toIndentedString(inheritingCredentialsFromDelegate)).append("\n");
    sb.append("    ccmConnectorFilter: ").append(toIndentedString(ccmConnectorFilter)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

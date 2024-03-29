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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This has details of the Connector Catalogue in Harness.
 */
@Schema(description = "This has details of the Connector Catalogue in Harness.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ConnectorCatalogueItem {
  /**
   * Category of this Connector.
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    CLOUD_PROVIDER("CLOUD_PROVIDER"),
    SECRET_MANAGER("SECRET_MANAGER"),
    CLOUD_COST("CLOUD_COST"),
    ARTIFACTORY("ARTIFACTORY"),
    CODE_REPO("CODE_REPO"),
    MONITORING("MONITORING"),
    TICKETING("TICKETING");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CategoryEnum fromValue(String input) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CategoryEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("category")
  private CategoryEnum category = null;

  /**
   * List of Connector types corresponding to a specific category.
   */
  @JsonAdapter(ConnectorsEnum.Adapter.class)
  public enum ConnectorsEnum {
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

    ConnectorsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ConnectorsEnum fromValue(String input) {
      for (ConnectorsEnum b : ConnectorsEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ConnectorsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConnectorsEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ConnectorsEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ConnectorsEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("connectors")
  private List<ConnectorsEnum> connectors = null;

  public ConnectorCatalogueItem category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * Category of this Connector.
   * @return category
  **/
  @Schema(description = "Category of this Connector.")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public ConnectorCatalogueItem connectors(List<ConnectorsEnum> connectors) {
    this.connectors = connectors;
    return this;
  }

  public ConnectorCatalogueItem addConnectorsItem(ConnectorsEnum connectorsItem) {
    if (this.connectors == null) {
      this.connectors = new ArrayList<ConnectorsEnum>();
    }
    this.connectors.add(connectorsItem);
    return this;
  }

   /**
   * List of Connector types corresponding to a specific category.
   * @return connectors
  **/
  @Schema(description = "List of Connector types corresponding to a specific category.")
  public List<ConnectorsEnum> getConnectors() {
    return connectors;
  }

  public void setConnectors(List<ConnectorsEnum> connectors) {
    this.connectors = connectors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorCatalogueItem connectorCatalogueItem = (ConnectorCatalogueItem) o;
    return Objects.equals(this.category, connectorCatalogueItem.category) &&
        Objects.equals(this.connectors, connectorCatalogueItem.connectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, connectors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorCatalogueItem {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    connectors: ").append(toIndentedString(connectors)).append("\n");
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

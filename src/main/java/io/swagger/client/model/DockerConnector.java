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
import io.swagger.client.model.ConnectorConfig;
import io.swagger.client.model.DockerAuthentication;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This entity contains the details of the Docker Connectors
 */
@Schema(description = "This entity contains the details of the Docker Connectors")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class DockerConnector extends ConnectorConfig {
  @SerializedName("dockerRegistryUrl")
  private String dockerRegistryUrl = null;

  /**
   * Gets or Sets providerType
   */
  @JsonAdapter(ProviderTypeEnum.Adapter.class)
  public enum ProviderTypeEnum {
    DOCKERHUB("DockerHub"),
    HARBOR("Harbor"),
    QUAY("Quay"),
    OTHER("Other");

    private String value;

    ProviderTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProviderTypeEnum fromValue(String input) {
      for (ProviderTypeEnum b : ProviderTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProviderTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProviderTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ProviderTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ProviderTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("providerType")
  private ProviderTypeEnum providerType = null;

  @SerializedName("auth")
  private DockerAuthentication auth = null;

  @SerializedName("delegateSelectors")
  private List<String> delegateSelectors = null;

  public DockerConnector dockerRegistryUrl(String dockerRegistryUrl) {
    this.dockerRegistryUrl = dockerRegistryUrl;
    return this;
  }

   /**
   * Get dockerRegistryUrl
   * @return dockerRegistryUrl
  **/
  @Schema(required = true, description = "")
  public String getDockerRegistryUrl() {
    return dockerRegistryUrl;
  }

  public void setDockerRegistryUrl(String dockerRegistryUrl) {
    this.dockerRegistryUrl = dockerRegistryUrl;
  }

  public DockerConnector providerType(ProviderTypeEnum providerType) {
    this.providerType = providerType;
    return this;
  }

   /**
   * Get providerType
   * @return providerType
  **/
  @Schema(required = true, description = "")
  public ProviderTypeEnum getProviderType() {
    return providerType;
  }

  public void setProviderType(ProviderTypeEnum providerType) {
    this.providerType = providerType;
  }

  public DockerConnector auth(DockerAuthentication auth) {
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @Schema(description = "")
  public DockerAuthentication getAuth() {
    return auth;
  }

  public void setAuth(DockerAuthentication auth) {
    this.auth = auth;
  }

  public DockerConnector delegateSelectors(List<String> delegateSelectors) {
    this.delegateSelectors = delegateSelectors;
    return this;
  }

  public DockerConnector addDelegateSelectorsItem(String delegateSelectorsItem) {
    if (this.delegateSelectors == null) {
      this.delegateSelectors = new ArrayList<String>();
    }
    this.delegateSelectors.add(delegateSelectorsItem);
    return this;
  }

   /**
   * Get delegateSelectors
   * @return delegateSelectors
  **/
  @Schema(description = "")
  public List<String> getDelegateSelectors() {
    return delegateSelectors;
  }

  public void setDelegateSelectors(List<String> delegateSelectors) {
    this.delegateSelectors = delegateSelectors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DockerConnector dockerConnector = (DockerConnector) o;
    return Objects.equals(this.dockerRegistryUrl, dockerConnector.dockerRegistryUrl) &&
        Objects.equals(this.providerType, dockerConnector.providerType) &&
        Objects.equals(this.auth, dockerConnector.auth) &&
        Objects.equals(this.delegateSelectors, dockerConnector.delegateSelectors) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dockerRegistryUrl, providerType, auth, delegateSelectors, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DockerConnector {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dockerRegistryUrl: ").append(toIndentedString(dockerRegistryUrl)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    delegateSelectors: ").append(toIndentedString(delegateSelectors)).append("\n");
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

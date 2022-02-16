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
import io.swagger.client.model.ArtifactoryAuthentication;
import io.swagger.client.model.ConnectorConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This entity contains the details of the Artifactory Connectors
 */
@Schema(description = "This entity contains the details of the Artifactory Connectors")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ArtifactoryConnector extends ConnectorConfig {
  @SerializedName("artifactoryServerUrl")
  private String artifactoryServerUrl = null;

  @SerializedName("auth")
  private ArtifactoryAuthentication auth = null;

  @SerializedName("delegateSelectors")
  private List<String> delegateSelectors = null;

  public ArtifactoryConnector artifactoryServerUrl(String artifactoryServerUrl) {
    this.artifactoryServerUrl = artifactoryServerUrl;
    return this;
  }

   /**
   * Get artifactoryServerUrl
   * @return artifactoryServerUrl
  **/
  @Schema(required = true, description = "")
  public String getArtifactoryServerUrl() {
    return artifactoryServerUrl;
  }

  public void setArtifactoryServerUrl(String artifactoryServerUrl) {
    this.artifactoryServerUrl = artifactoryServerUrl;
  }

  public ArtifactoryConnector auth(ArtifactoryAuthentication auth) {
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @Schema(description = "")
  public ArtifactoryAuthentication getAuth() {
    return auth;
  }

  public void setAuth(ArtifactoryAuthentication auth) {
    this.auth = auth;
  }

  public ArtifactoryConnector delegateSelectors(List<String> delegateSelectors) {
    this.delegateSelectors = delegateSelectors;
    return this;
  }

  public ArtifactoryConnector addDelegateSelectorsItem(String delegateSelectorsItem) {
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
    ArtifactoryConnector artifactoryConnector = (ArtifactoryConnector) o;
    return Objects.equals(this.artifactoryServerUrl, artifactoryConnector.artifactoryServerUrl) &&
        Objects.equals(this.auth, artifactoryConnector.auth) &&
        Objects.equals(this.delegateSelectors, artifactoryConnector.delegateSelectors) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactoryServerUrl, auth, delegateSelectors, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactoryConnector {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    artifactoryServerUrl: ").append(toIndentedString(artifactoryServerUrl)).append("\n");
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
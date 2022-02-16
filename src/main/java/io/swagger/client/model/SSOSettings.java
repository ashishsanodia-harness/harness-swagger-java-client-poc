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
import io.swagger.client.model.EmbeddedUser;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SSOSettings
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")

public class SSOSettings {
  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("appId")
  private String appId = null;

  @SerializedName("createdBy")
  private EmbeddedUser createdBy = null;

  @SerializedName("createdAt")
  private Long createdAt = null;

  @SerializedName("lastUpdatedBy")
  private EmbeddedUser lastUpdatedBy = null;

  @SerializedName("lastUpdatedAt")
  private Long lastUpdatedAt = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SAML("SAML"),
    LDAP("LDAP"),
    OAUTH("OAUTH");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("nextIteration")
  private Long nextIteration = null;

  @SerializedName("nextIterations")
  private List<Long> nextIterations = null;

  @SerializedName("accountId")
  private String accountId = null;

  public SSOSettings() {
    this.type = this.getClass().getSimpleName();
  }
  public SSOSettings uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(required = true, description = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public SSOSettings appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @Schema(required = true, description = "")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public SSOSettings createdBy(EmbeddedUser createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public EmbeddedUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(EmbeddedUser createdBy) {
    this.createdBy = createdBy;
  }

  public SSOSettings createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public SSOSettings lastUpdatedBy(EmbeddedUser lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

   /**
   * Get lastUpdatedBy
   * @return lastUpdatedBy
  **/
  @Schema(description = "")
  public EmbeddedUser getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(EmbeddedUser lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public SSOSettings lastUpdatedAt(Long lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

   /**
   * Get lastUpdatedAt
   * @return lastUpdatedAt
  **/
  @Schema(required = true, description = "")
  public Long getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  public void setLastUpdatedAt(Long lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public SSOSettings type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SSOSettings displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public SSOSettings url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SSOSettings nextIteration(Long nextIteration) {
    this.nextIteration = nextIteration;
    return this;
  }

   /**
   * Get nextIteration
   * @return nextIteration
  **/
  @Schema(description = "")
  public Long getNextIteration() {
    return nextIteration;
  }

  public void setNextIteration(Long nextIteration) {
    this.nextIteration = nextIteration;
  }

  public SSOSettings nextIterations(List<Long> nextIterations) {
    this.nextIterations = nextIterations;
    return this;
  }

  public SSOSettings addNextIterationsItem(Long nextIterationsItem) {
    if (this.nextIterations == null) {
      this.nextIterations = new ArrayList<Long>();
    }
    this.nextIterations.add(nextIterationsItem);
    return this;
  }

   /**
   * Get nextIterations
   * @return nextIterations
  **/
  @Schema(description = "")
  public List<Long> getNextIterations() {
    return nextIterations;
  }

  public void setNextIterations(List<Long> nextIterations) {
    this.nextIterations = nextIterations;
  }

  public SSOSettings accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSOSettings ssOSettings = (SSOSettings) o;
    return Objects.equals(this.uuid, ssOSettings.uuid) &&
        Objects.equals(this.appId, ssOSettings.appId) &&
        Objects.equals(this.createdBy, ssOSettings.createdBy) &&
        Objects.equals(this.createdAt, ssOSettings.createdAt) &&
        Objects.equals(this.lastUpdatedBy, ssOSettings.lastUpdatedBy) &&
        Objects.equals(this.lastUpdatedAt, ssOSettings.lastUpdatedAt) &&
        Objects.equals(this.type, ssOSettings.type) &&
        Objects.equals(this.displayName, ssOSettings.displayName) &&
        Objects.equals(this.url, ssOSettings.url) &&
        Objects.equals(this.nextIteration, ssOSettings.nextIteration) &&
        Objects.equals(this.nextIterations, ssOSettings.nextIterations) &&
        Objects.equals(this.accountId, ssOSettings.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, appId, createdBy, createdAt, lastUpdatedBy, lastUpdatedAt, type, displayName, url, nextIteration, nextIterations, accountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSOSettings {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    nextIteration: ").append(toIndentedString(nextIteration)).append("\n");
    sb.append("    nextIterations: ").append(toIndentedString(nextIterations)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

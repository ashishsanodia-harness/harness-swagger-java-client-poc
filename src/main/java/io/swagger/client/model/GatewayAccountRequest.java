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
/**
 * Returns Gateway account request details like uuid, account name, company name, default experience, whether or not created from NextGen and whether NextGen is enabled or not.
 */
@Schema(description = "Returns Gateway account request details like uuid, account name, company name, default experience, whether or not created from NextGen and whether NextGen is enabled or not.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class GatewayAccountRequest {
  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("accountName")
  private String accountName = null;

  @SerializedName("companyName")
  private String companyName = null;

  /**
   * Gets or Sets defaultExperience
   */
  @JsonAdapter(DefaultExperienceEnum.Adapter.class)
  public enum DefaultExperienceEnum {
    NG("NG"),
    CG("CG");

    private String value;

    DefaultExperienceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DefaultExperienceEnum fromValue(String input) {
      for (DefaultExperienceEnum b : DefaultExperienceEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DefaultExperienceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultExperienceEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DefaultExperienceEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DefaultExperienceEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("defaultExperience")
  private DefaultExperienceEnum defaultExperience = null;

  @SerializedName("createdFromNG")
  private Boolean createdFromNG = null;

  @SerializedName("isNextGenEnabled")
  private Boolean isNextGenEnabled = null;

  @SerializedName("nextGenEnabled")
  private Boolean nextGenEnabled = null;

  public GatewayAccountRequest uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(description = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public GatewayAccountRequest accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @Schema(description = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public GatewayAccountRequest companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @Schema(description = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public GatewayAccountRequest defaultExperience(DefaultExperienceEnum defaultExperience) {
    this.defaultExperience = defaultExperience;
    return this;
  }

   /**
   * Get defaultExperience
   * @return defaultExperience
  **/
  @Schema(description = "")
  public DefaultExperienceEnum getDefaultExperience() {
    return defaultExperience;
  }

  public void setDefaultExperience(DefaultExperienceEnum defaultExperience) {
    this.defaultExperience = defaultExperience;
  }

  public GatewayAccountRequest createdFromNG(Boolean createdFromNG) {
    this.createdFromNG = createdFromNG;
    return this;
  }

   /**
   * Get createdFromNG
   * @return createdFromNG
  **/
  @Schema(description = "")
  public Boolean isCreatedFromNG() {
    return createdFromNG;
  }

  public void setCreatedFromNG(Boolean createdFromNG) {
    this.createdFromNG = createdFromNG;
  }

  public GatewayAccountRequest isNextGenEnabled(Boolean isNextGenEnabled) {
    this.isNextGenEnabled = isNextGenEnabled;
    return this;
  }

   /**
   * Get isNextGenEnabled
   * @return isNextGenEnabled
  **/
  @Schema(description = "")
  public Boolean isIsNextGenEnabled() {
    return isNextGenEnabled;
  }

  public void setIsNextGenEnabled(Boolean isNextGenEnabled) {
    this.isNextGenEnabled = isNextGenEnabled;
  }

  public GatewayAccountRequest nextGenEnabled(Boolean nextGenEnabled) {
    this.nextGenEnabled = nextGenEnabled;
    return this;
  }

   /**
   * Get nextGenEnabled
   * @return nextGenEnabled
  **/
  @Schema(description = "")
  public Boolean isNextGenEnabled() {
    return nextGenEnabled;
  }

  public void setNextGenEnabled(Boolean nextGenEnabled) {
    this.nextGenEnabled = nextGenEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayAccountRequest gatewayAccountRequest = (GatewayAccountRequest) o;
    return Objects.equals(this.uuid, gatewayAccountRequest.uuid) &&
        Objects.equals(this.accountName, gatewayAccountRequest.accountName) &&
        Objects.equals(this.companyName, gatewayAccountRequest.companyName) &&
        Objects.equals(this.defaultExperience, gatewayAccountRequest.defaultExperience) &&
        Objects.equals(this.createdFromNG, gatewayAccountRequest.createdFromNG) &&
        Objects.equals(this.isNextGenEnabled, gatewayAccountRequest.isNextGenEnabled) &&
        Objects.equals(this.nextGenEnabled, gatewayAccountRequest.nextGenEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, accountName, companyName, defaultExperience, createdFromNG, isNextGenEnabled, nextGenEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayAccountRequest {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    defaultExperience: ").append(toIndentedString(defaultExperience)).append("\n");
    sb.append("    createdFromNG: ").append(toIndentedString(createdFromNG)).append("\n");
    sb.append("    isNextGenEnabled: ").append(toIndentedString(isNextGenEnabled)).append("\n");
    sb.append("    nextGenEnabled: ").append(toIndentedString(nextGenEnabled)).append("\n");
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

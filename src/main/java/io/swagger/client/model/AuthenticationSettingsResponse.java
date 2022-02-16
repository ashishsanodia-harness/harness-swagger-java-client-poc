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
import io.swagger.client.model.NGAuthSettings;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This contains information on the Authentication Settings defined in Harness.
 */
@Schema(description = "This contains information on the Authentication Settings defined in Harness.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class AuthenticationSettingsResponse {
  @SerializedName("ngAuthSettings")
  private List<NGAuthSettings> ngAuthSettings = null;

  @SerializedName("whitelistedDomains")
  private List<String> whitelistedDomains = null;

  /**
   * Indicates if the Authentication Mechanism is SSO or NON-SSO.
   */
  @JsonAdapter(AuthenticationMechanismEnum.Adapter.class)
  public enum AuthenticationMechanismEnum {
    USER_PASSWORD("USER_PASSWORD"),
    SAML("SAML"),
    LDAP("LDAP"),
    OAUTH("OAUTH");

    private String value;

    AuthenticationMechanismEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AuthenticationMechanismEnum fromValue(String input) {
      for (AuthenticationMechanismEnum b : AuthenticationMechanismEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AuthenticationMechanismEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthenticationMechanismEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AuthenticationMechanismEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AuthenticationMechanismEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("authenticationMechanism")
  private AuthenticationMechanismEnum authenticationMechanism = null;

  @SerializedName("twoFactorEnabled")
  private Boolean twoFactorEnabled = null;

  public AuthenticationSettingsResponse ngAuthSettings(List<NGAuthSettings> ngAuthSettings) {
    this.ngAuthSettings = ngAuthSettings;
    return this;
  }

  public AuthenticationSettingsResponse addNgAuthSettingsItem(NGAuthSettings ngAuthSettingsItem) {
    if (this.ngAuthSettings == null) {
      this.ngAuthSettings = new ArrayList<NGAuthSettings>();
    }
    this.ngAuthSettings.add(ngAuthSettingsItem);
    return this;
  }

   /**
   * List of Auth Settings configured for an Account.
   * @return ngAuthSettings
  **/
  @Schema(description = "List of Auth Settings configured for an Account.")
  public List<NGAuthSettings> getNgAuthSettings() {
    return ngAuthSettings;
  }

  public void setNgAuthSettings(List<NGAuthSettings> ngAuthSettings) {
    this.ngAuthSettings = ngAuthSettings;
  }

  public AuthenticationSettingsResponse whitelistedDomains(List<String> whitelistedDomains) {
    this.whitelistedDomains = whitelistedDomains;
    return this;
  }

  public AuthenticationSettingsResponse addWhitelistedDomainsItem(String whitelistedDomainsItem) {
    if (this.whitelistedDomains == null) {
      this.whitelistedDomains = new ArrayList<String>();
    }
    this.whitelistedDomains.add(whitelistedDomainsItem);
    return this;
  }

   /**
   * List of the whitelisted domains.
   * @return whitelistedDomains
  **/
  @Schema(description = "List of the whitelisted domains.")
  public List<String> getWhitelistedDomains() {
    return whitelistedDomains;
  }

  public void setWhitelistedDomains(List<String> whitelistedDomains) {
    this.whitelistedDomains = whitelistedDomains;
  }

  public AuthenticationSettingsResponse authenticationMechanism(AuthenticationMechanismEnum authenticationMechanism) {
    this.authenticationMechanism = authenticationMechanism;
    return this;
  }

   /**
   * Indicates if the Authentication Mechanism is SSO or NON-SSO.
   * @return authenticationMechanism
  **/
  @Schema(description = "Indicates if the Authentication Mechanism is SSO or NON-SSO.")
  public AuthenticationMechanismEnum getAuthenticationMechanism() {
    return authenticationMechanism;
  }

  public void setAuthenticationMechanism(AuthenticationMechanismEnum authenticationMechanism) {
    this.authenticationMechanism = authenticationMechanism;
  }

  public AuthenticationSettingsResponse twoFactorEnabled(Boolean twoFactorEnabled) {
    this.twoFactorEnabled = twoFactorEnabled;
    return this;
  }

   /**
   * If Two Factor Authentication is enabled, this value is true. Otherwise, it is false.
   * @return twoFactorEnabled
  **/
  @Schema(description = "If Two Factor Authentication is enabled, this value is true. Otherwise, it is false.")
  public Boolean isTwoFactorEnabled() {
    return twoFactorEnabled;
  }

  public void setTwoFactorEnabled(Boolean twoFactorEnabled) {
    this.twoFactorEnabled = twoFactorEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationSettingsResponse authenticationSettingsResponse = (AuthenticationSettingsResponse) o;
    return Objects.equals(this.ngAuthSettings, authenticationSettingsResponse.ngAuthSettings) &&
        Objects.equals(this.whitelistedDomains, authenticationSettingsResponse.whitelistedDomains) &&
        Objects.equals(this.authenticationMechanism, authenticationSettingsResponse.authenticationMechanism) &&
        Objects.equals(this.twoFactorEnabled, authenticationSettingsResponse.twoFactorEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ngAuthSettings, whitelistedDomains, authenticationMechanism, twoFactorEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationSettingsResponse {\n");
    
    sb.append("    ngAuthSettings: ").append(toIndentedString(ngAuthSettings)).append("\n");
    sb.append("    whitelistedDomains: ").append(toIndentedString(whitelistedDomains)).append("\n");
    sb.append("    authenticationMechanism: ").append(toIndentedString(authenticationMechanism)).append("\n");
    sb.append("    twoFactorEnabled: ").append(toIndentedString(twoFactorEnabled)).append("\n");
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
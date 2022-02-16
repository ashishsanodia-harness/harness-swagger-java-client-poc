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
 * The API key is used by SDKs to connect to Harness Feature Flags
 */
@Schema(description = "The API key is used by SDKs to connect to Harness Feature Flags")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class CfApiKey {
  @SerializedName("apiKey")
  private String apiKey = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  /**
   * The type of key depending on the SDK that is being used.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SERVER("server"),
    CLIENT("client");

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

  public CfApiKey apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * The Key will be shown only on create. On subsequent GET calls, only the masked APIKeys will be returned
   * @return apiKey
  **/
  @Schema(example = "b03af1cd-bd3f-472b-a4b0-c9c9c09c642e", required = true, description = "The Key will be shown only on create. On subsequent GET calls, only the masked APIKeys will be returned")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public CfApiKey identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The environment that this key was created in
   * @return identifier
  **/
  @Schema(example = "production", required = true, description = "The environment that this key was created in")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public CfApiKey key(String key) {
    this.key = key;
    return this;
  }

   /**
   * A hash of API key
   * @return key
  **/
  @Schema(example = "3c940273c34e8a9b21", description = "A hash of API key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CfApiKey name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The user friendly identifier for the API Key
   * @return name
  **/
  @Schema(example = "Production Server Key", required = true, description = "The user friendly identifier for the API Key")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CfApiKey type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of key depending on the SDK that is being used.
   * @return type
  **/
  @Schema(example = "server", required = true, description = "The type of key depending on the SDK that is being used.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CfApiKey cfApiKey = (CfApiKey) o;
    return Objects.equals(this.apiKey, cfApiKey.apiKey) &&
        Objects.equals(this.identifier, cfApiKey.identifier) &&
        Objects.equals(this.key, cfApiKey.key) &&
        Objects.equals(this.name, cfApiKey.name) &&
        Objects.equals(this.type, cfApiKey.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, identifier, key, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CfApiKey {\n");
    
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

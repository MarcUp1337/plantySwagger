package de.planty.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HumidityInforation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-10T17:19:34.216Z")

public class HumidityInforation   {
  @JsonProperty("plantId")
  private Long plantId = null;

  @JsonProperty("humidity")
  private Long humidity = null;

  @JsonProperty("humiditylog")
  @Valid
  private List<Long> humiditylog = null;

  /**
   * plant status in the system
   */
  public enum StatusEnum {
    OK("ok"),
    
    DRY("dry"),
    
    WATERED("watered");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public HumidityInforation plantId(Long plantId) {
    this.plantId = plantId;
    return this;
  }

   /**
   * Get plantId
   * @return plantId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getPlantId() {
    return plantId;
  }

  public void setPlantId(Long plantId) {
    this.plantId = plantId;
  }

  public HumidityInforation humidity(Long humidity) {
    this.humidity = humidity;
    return this;
  }

   /**
   * Get humidity
   * @return humidity
  **/
  @ApiModelProperty(value = "")


  public Long getHumidity() {
    return humidity;
  }

  public void setHumidity(Long humidity) {
    this.humidity = humidity;
  }

  public HumidityInforation humiditylog(List<Long> humiditylog) {
    this.humiditylog = humiditylog;
    return this;
  }

  public HumidityInforation addHumiditylogItem(Long humiditylogItem) {
    if (this.humiditylog == null) {
      this.humiditylog = new ArrayList<Long>();
    }
    this.humiditylog.add(humiditylogItem);
    return this;
  }

   /**
   * Get humiditylog
   * @return humiditylog
  **/
  @ApiModelProperty(value = "")


  public List<Long> getHumiditylog() {
    return humiditylog;
  }

  public void setHumiditylog(List<Long> humiditylog) {
    this.humiditylog = humiditylog;
  }

  public HumidityInforation status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * plant status in the system
   * @return status
  **/
  @ApiModelProperty(value = "plant status in the system")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HumidityInforation humidityInforation = (HumidityInforation) o;
    return Objects.equals(this.plantId, humidityInforation.plantId) &&
        Objects.equals(this.humidity, humidityInforation.humidity) &&
        Objects.equals(this.humiditylog, humidityInforation.humiditylog) &&
        Objects.equals(this.status, humidityInforation.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plantId, humidity, humiditylog, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HumidityInforation {\n");
    
    sb.append("    plantId: ").append(toIndentedString(plantId)).append("\n");
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
    sb.append("    humiditylog: ").append(toIndentedString(humiditylog)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


package de.planty.api;

import de.planty.model.HumidityInforation;
import de.planty.model.Plant;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-10T17:19:34.216Z")

@Controller
public class PlantApiController implements PlantApi {

    private static final Logger log = LoggerFactory.getLogger(PlantApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PlantApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addPlant(@ApiParam(value = "Plant object that needs to be added to the system" ,required=true )  @Valid @RequestBody Plant body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Plant>> findPlantsByStatus(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true) @Valid @RequestParam(value = "name", required = true) String name) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<List<Plant>>(objectMapper.readValue("<null>  <id>123456789</id>  <name>doggie</name></null>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<Plant>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Plant>>(objectMapper.readValue("[ {  \"name\" : \"doggie\",  \"id\" : 0}, {  \"name\" : \"doggie\",  \"id\" : 0} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Plant>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Plant>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Plant> getPlant(@ApiParam(value = "ID of plant to return",required=true) @PathVariable("plantId") Long plantId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Plant>(objectMapper.readValue("<null>  <id>123456789</id>  <name>doggie</name></null>", Plant.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Plant>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Plant>(objectMapper.readValue("{  \"name\" : \"doggie\",  \"id\" : 0}", Plant.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Plant>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Plant>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<HumidityInforation> getPlantHumidy(@ApiParam(value = "ID of plant to return",required=true) @PathVariable("plantId") Long plantId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<HumidityInforation>(objectMapper.readValue("<null>  <plantId>123456789</plantId>  <humidity>123456789</humidity>  <humiditylog>123456789</humiditylog>  <status>aeiou</status></null>", HumidityInforation.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<HumidityInforation>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<HumidityInforation>(objectMapper.readValue("{  \"plantId\" : 0,  \"humidity\" : 6,  \"humiditylog\" : [ 1, 1 ],  \"status\" : \"ok\"}", HumidityInforation.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<HumidityInforation>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<HumidityInforation>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updatePlant(@ApiParam(value = "Plant object that needs to be added to the system" ,required=true )  @Valid @RequestBody Plant body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updatePlantWithForm(@ApiParam(value = "ID of plant that needs to be updated",required=true) @PathVariable("plantId") Long plantId,@ApiParam(value = "Updated name of the plant") @RequestPart(value="name", required=false)  String name,@ApiParam(value = "Updated status of the plant") @RequestPart(value="status", required=false)  String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> waterPlant(@ApiParam(value = "ID of plant to return",required=true) @PathVariable("plantId") Long plantId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}

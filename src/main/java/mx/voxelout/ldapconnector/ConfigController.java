package mx.voxelout.ldapconnector;

import io.swagger.annotations.*;
import mx.voxelout.ldapconnector.service.ConfigService;
import mx.voxelout.ldapconnector.payload.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ldap-connector/v1")

public class ConfigController {
@Autowired
ConfigService configService;

    @GetMapping("/config")
    @ApiOperation(value = "Returns the current configuration", response = ConfigReponse.class, tags = "authentication")
    public ResponseEntity<?> getConfig() {
        try{
            return new ResponseEntity<String>(configService.getConfig(), HttpStatus.OK);
        }catch(Exception e){
            return noDisclosureOfTechnicalInfo(e);
        }
    }

    @PutMapping("/config")
    @ApiOperation(value = "saves LDAP connection general information", response = String.class, tags = "authentication")
    public ResponseEntity<?> setConfig(@RequestBody ConfigRequest configRequest) {
        try{
            return new ResponseEntity<String>(configService.changeConfig(configRequest), HttpStatus.OK);
        }catch(Exception e){
            return noDisclosureOfTechnicalInfo(e);
        }
    }

    static ResponseEntity<?> noDisclosureOfTechnicalInfo(Exception e){
        System.out.println(e);
        System.out.println("*************Exception filtered, will responde with empty code*********");
        //EmptyResultDataResponse emptyErrorCode;
        //emptyErrorCode = new EmptyResultDataResponse(ResponseCodeMessage.UNEXPECTED_ERROR);
        return new ResponseEntity<String>("Unexpected error", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
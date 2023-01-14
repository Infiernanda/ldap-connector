package mx.voxelout.ldapconnector;

import io.swagger.annotations.*;
import mx.voxelout.ldapconnector.model.*;
import mx.voxelout.ldapconnector.payload.*;
import mx.voxelout.ldapconnector.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/some-api/v1")

public class SomeController {
@Autowired
SomeService someService;

    @GetMapping("/some")
    @ApiOperation(value = "Returns all somethings", response = AllResponse.class, tags = "Some domain")
    public ResponseEntity<?> getAll() {
        try{
            return new ResponseEntity<AllResponse>(new AllResponse(someService.getAll(), "OK"), HttpStatus.OK);
        }catch(Exception e){
            return noDisclosureOfTechnicalInfo(e);
        }
    }

    @GetMapping("/some/{id}")
    @ApiOperation(value = "Returns something specific", response = SomeModel.class, tags = "Some domain")
    public ResponseEntity<?> getSome( @PathVariable("idSome") Long idSome) {
        try{
            return new ResponseEntity<SomeModel>(someService.getSome(idSome), HttpStatus.OK);
        }catch(Exception e){
            return noDisclosureOfTechnicalInfo(e);
        }
    }

    @PutMapping("/some")
    @ApiOperation(value = "Change a something", response = String.class, tags = "Some domain")
    public ResponseEntity<?> setSome(@RequestBody SomeModel configRequest) {
        try{
            return new ResponseEntity<String>(someService.changeSome(configRequest), HttpStatus.OK);
        }catch(Exception e){
            return noDisclosureOfTechnicalInfo(e);
        }
    }

    @PostMapping("/some")
    @ApiOperation(value = "Add something", response = String.class, tags = "Some domain")
    public ResponseEntity<?> addSome(@RequestBody SomeModel configRequest) {
        try{
            return new ResponseEntity<String>(someService.addSome(configRequest), HttpStatus.OK);
        }catch(Exception e){
            return noDisclosureOfTechnicalInfo(e);
        }
    }

    @DeleteMapping("/some")
    @ApiOperation(value = "Removes something", response = String.class, tags = "Some domain")
    public ResponseEntity<?> deleteSome(@RequestBody SomeModel configRequest) {
        try{
            return new ResponseEntity<String>(someService.removeSome(configRequest), HttpStatus.OK);
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
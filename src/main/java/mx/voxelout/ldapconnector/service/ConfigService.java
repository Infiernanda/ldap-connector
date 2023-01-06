package mx.voxelout.ldapconnector.service;

import mx.voxelout.ldapconnector.payload.ConfigRequest;
import org.springframework.stereotype.*;

@Service
public class ConfigService {

    public String getConfig(){
        return "Here's the configuration";
    }

    public String changeConfig(ConfigRequest request){
        return "Config changed";

    }
}

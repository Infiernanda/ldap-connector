package mx.voxelout.ldapconnector.service;

import mx.voxelout.ldapconnector.model.SomeModel;
import mx.voxelout.ldapconnector.payload.AllResponse;
import org.springframework.stereotype.*;

import java.util.ArrayList;

@Service
public class SomeService {

    public ArrayList<SomeModel> getAll(){
        ArrayList<SomeModel> response = new ArrayList<SomeModel>(){{
            add(new SomeModel(0001L, "Name", true));
        }};
        return response;
    }
    public SomeModel getSome(Long id){
        SomeModel response = new SomeModel(id, "Name", true);
        return response;
    }

    public String changeSome(SomeModel request){
        return "Something changed";

    }

    public String addSome(SomeModel request){
        return "Something added";

    }

    public String removeSome(SomeModel request){
        return "Something removed";

    }

    public String someHelper(String someInput){
        return "I help "+ someInput;
    }
}

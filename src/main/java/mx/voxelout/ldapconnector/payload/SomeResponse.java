package mx.voxelout.ldapconnector.payload;

import mx.voxelout.ldapconnector.model.SomeModel;

public class SomeResponse {
    SomeModel data = new SomeModel();
    String message;

    public SomeResponse() {
    }

    public SomeResponse(SomeModel data, String message) {
        this.data = data;
        this.message = message;
    }

    public SomeModel getData() {
        return data;
    }

    public void setData(SomeModel data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

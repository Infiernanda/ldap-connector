package mx.voxelout.ldapconnector.payload;

import mx.voxelout.ldapconnector.model.SomeModel;

import java.util.ArrayList;

public class AllResponse {
    ArrayList<SomeModel> data = new ArrayList<>();
    String message;

    public AllResponse() {
    }

    public AllResponse(ArrayList<SomeModel> data, String message) {
        this.data = data;
        this.message = message;
    }

    public ArrayList<SomeModel> getData() {
        return data;
    }

    public void setData(ArrayList<SomeModel> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "AllResponse{" +
                "data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}

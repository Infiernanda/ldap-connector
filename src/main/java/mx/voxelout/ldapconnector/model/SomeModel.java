package mx.voxelout.ldapconnector.model;

public class SomeModel {
    private Long someId;

    private String someString;

    private boolean someBoolean;

    public SomeModel() {
    }

    public SomeModel(Long someId, String someString, boolean someBoolean) {
        this.someId = someId;
        this.someString = someString;
        this.someBoolean = someBoolean;
    }

    public Long getSomeId() {
        return someId;
    }

    public void setSomeId(Long someId) {
        this.someId = someId;
    }

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    public boolean isSomeBoolean() {
        return someBoolean;
    }

    public void setSomeBoolean(boolean someBoolean) {
        this.someBoolean = someBoolean;
    }

    @Override
    public String toString() {
        return "SomeModel{" +
                "someId=" + someId +
                ", someString='" + someString + '\'' +
                ", someBoolean=" + someBoolean +
                '}';
    }
}

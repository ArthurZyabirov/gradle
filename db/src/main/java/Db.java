import java.util.UUID;

public class Db {

    private static final java.util.UUID UUID = java.util.UUID.randomUUID();
    private DbSetting1 dbSetting;
    private MyEntity myEntity;

    public Db(DbSetting1 dbSetting) {
        this.dbSetting = dbSetting;
        myEntity = new MyEntity("first");
        myEntity.setId(UUID);
    }

    public DbSetting1 getDbSetting() {
        return dbSetting;
    }

    public MyEntity getMyEntity() {
        return myEntity;
    }

    public void setMyEntity(MyEntity myEntity) {
        this.myEntity = myEntity;
    }
}

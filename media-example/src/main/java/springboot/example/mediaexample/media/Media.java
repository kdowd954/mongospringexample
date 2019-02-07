package springboot.example.mediaexample.media;

import org.springframework.data.annotation.Id;

public class Media {

    @Id
    private String uuid;
    private String itemType;
    private String usage;

    public Media() {

    }

    public Media(String uuid, String itemType, String usage) {
        this.uuid = uuid;
        this.itemType = itemType;
        this.usage = usage;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Override
    public String toString() {
        return String.format(
            "Customer[uuid='%s', itemType='%s', usage='%s']", uuid, itemType, usage);
    }
}

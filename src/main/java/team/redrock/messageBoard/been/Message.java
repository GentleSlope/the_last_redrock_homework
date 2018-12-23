//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package team.redrock.messageBoard.been;

import java.util.List;

public class Message {
    private int id;
    private int pid;
    private String username;
    private String text;
    private List<Message> childContent;

    public Message() {
    }

    public Message(String username, String text, int pid) {
        this.username = username;
        this.text = text;
        this.pid = pid;
    }

    public int getId() {
        return this.id;
    }

    public int getPid() {
        return this.pid;
    }

    public String getUsername() {
        return this.username;
    }

    public String getText() {
        return this.text;
    }

    public List<Message> getChildContent() {
        return this.childContent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setChildContent(List<Message> childContent) {
        this.childContent = childContent;
    }

    public String toString() {
        return "Message(id=" + this.getId() + ", pid=" + this.getPid() + ", username=" + this.getUsername() + ", text=" + this.getText() + ", childContent=" + this.getChildContent() + ")";
    }
}

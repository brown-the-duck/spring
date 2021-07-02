package hello.hellospring.domain;

public class Memeber {
    private Long id; //임의로 저장하는 아이디
    private String name;
    private String pw;
    private String id_in;

    public String getId_in() {
        return id_in;
    }

    public void setId_in(String id_in) {
        this.id_in = id_in;
    }



    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

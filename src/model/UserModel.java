package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "mysneakersby", catalog = "")
public class UserModel {
    private int id;
    private String nama;
    private String username;
    private String email;
    private String password;
    private String alamat;
    private String telp;
    private String foto;
    private String rememberToken;

    public UserModel() {
    }

    public UserModel(String nama, String username, String email, String password,
                     String alamat, String telp, String foto) {
        this.nama = nama;
        this.username = username;
        this.email = email;
        this.password = password;
        this.alamat = alamat;
        this.telp = telp;
        this.foto = foto;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nama", nullable = false, length = 50)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 50)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 65535)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "alamat", nullable = false, length = 65535)
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Basic
    @Column(name = "telp", nullable = false, length = 20)
    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    @Basic
    @Column(name = "foto", nullable = false, length = 100)
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return id == userModel.id &&
                Objects.equals(nama, userModel.nama) &&
                Objects.equals(username, userModel.username) &&
                Objects.equals(email, userModel.email) &&
                Objects.equals(password, userModel.password) &&
                Objects.equals(alamat, userModel.alamat) &&
                Objects.equals(telp, userModel.telp) &&
                Objects.equals(foto, userModel.foto);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nama, username, email, password, alamat, telp, foto);
    }

    @Basic
    @Column(name = "remember_token", nullable = false, length = 65535)
    public String getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
    }
}

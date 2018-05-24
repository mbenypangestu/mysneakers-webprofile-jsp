package model;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "mysneakersby", catalog = "")
public class UserModel {
    private int id;
    private String nama;
    private String username;
    private String email;
    private String password;
    private String rememberToken;
    private String alamat;
    private String telp;
    private String foto;

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
    @Column(name = "remember_token", nullable = false, length = 65535)
    public String getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
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

        if (id != userModel.id) return false;
        if (nama != null ? !nama.equals(userModel.nama) : userModel.nama != null) return false;
        if (username != null ? !username.equals(userModel.username) : userModel.username != null) return false;
        if (email != null ? !email.equals(userModel.email) : userModel.email != null) return false;
        if (password != null ? !password.equals(userModel.password) : userModel.password != null) return false;
        if (rememberToken != null ? !rememberToken.equals(userModel.rememberToken) : userModel.rememberToken != null)
            return false;
        if (alamat != null ? !alamat.equals(userModel.alamat) : userModel.alamat != null) return false;
        if (telp != null ? !telp.equals(userModel.telp) : userModel.telp != null) return false;
        if (foto != null ? !foto.equals(userModel.foto) : userModel.foto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nama != null ? nama.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (rememberToken != null ? rememberToken.hashCode() : 0);
        result = 31 * result + (alamat != null ? alamat.hashCode() : 0);
        result = 31 * result + (telp != null ? telp.hashCode() : 0);
        result = 31 * result + (foto != null ? foto.hashCode() : 0);
        return result;
    }
}

package com.company;

public class Pasajero extends Usuario{

    private String direccion;
    private String telefono;
    private String email;

    public Pasajero() {
    }

    public Pasajero(String direccion, String telefono, String email) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

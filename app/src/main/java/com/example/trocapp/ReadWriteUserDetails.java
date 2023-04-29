package com.example.trocapp;

public class ReadWriteUserDetails {
    public String nomComplet,phone,address,pays,ville,description;

    public ReadWriteUserDetails(String nomComplet,String phone,String address,String pays,String ville,String description){
        this.nomComplet= nomComplet;
        this.phone= phone;
        this.pays=pays;
        this.ville=ville;
        this.address= address;
        this.description= description;
    }
}
